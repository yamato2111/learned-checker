package check;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ResultData;
import bean.UserSetting;
import pojo.Compar;
import pojo.Extraction;
import pojo.TunedData;
import pojo.UserSentenceTuner;
import tool.Action;

public class SetUserInputAction extends Action {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        
        // ユーザ入力情報取得
        int userInputLevel = Integer.parseInt(request.getParameter("level"));
        int userInputLesson = Integer.parseInt(request.getParameter("lesson"));
        int userInputPart = Integer.parseInt(request.getParameter("part"));
        String sentence = request.getParameter("sentence");
        
        // ユーザ入力情報セット
        UserSetting userSetting = new UserSetting();
        userSetting.setLv(userInputLevel);
        userSetting.setLesson(userInputLesson);
        userSetting.setPart(userInputPart);
        
        // 比較対象の単語の抽出
        Path path = Paths.get("C:\\pleiades-2022-12-java-win-64bit-jre_20230124\\workspace\\testapp\\src\\main\\webapp\\WEB-INF\\tuningwords.csv");
        List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
        
        UserSentenceTuner tuner = new UserSentenceTuner();
        TunedData tunedData = tuner.sentenceTuner(sentence, lines);
        
        Extraction extract = new Extraction();
        List<String> extractionResult = extract.extraction(tunedData.tunedSentence, tunedData.tunedList);
        
        // 比較処理
        Compar comp = new Compar();
        List<ResultData> resultList = new ArrayList<>();
        resultList = comp.learnedMaping(extractionResult, userSetting);
        
        // リクエスト属性にセット
        request.setAttribute("sentence", sentence);
        request.setAttribute("userSetting", userSetting);
        request.setAttribute("resultList", resultList);
        
        return "/WEB-INF/check/result-test.jsp";
    }

}
