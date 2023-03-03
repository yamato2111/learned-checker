package check;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ResultData;
import bean.UserSetting;
import pojo.Compar;
import pojo.Extraction;
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
        Extraction extract = new Extraction();
        List<String> extractionResult = extract.extraction(sentence);
        
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
