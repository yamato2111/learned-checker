// ユーザ入力情報と、該当するDBデータを比較して既習、未習を判定する

package pojo;

import java.util.ArrayList;
import java.util.List;

import bean.DataFromDB;
import bean.ResultData;
import bean.UserSetting;
import dao.WordsDAO;

public class Compar {
	public List<ResultData> learnedMaping(List<String> extractionResult, UserSetting userSetting) {
		List<ResultData> resultList = new ArrayList<>();

		try {
			for (String word : extractionResult) {
				// インスタンス生成
				ResultData resultData = new ResultData();
				WordsDAO dao = new WordsDAO();
				DataFromDB dataFromDB = dao.search(word);
				int dbNumber = dataFromDB.getNumber();
				
				UserNumberGenerator unGenerator = new UserNumberGenerator();
				
				// 既習未習チェック
				int userNumber = unGenerator.userNumberGenerator(userSetting);
				boolean checkResult = Checker.isAlreadyLearned(userNumber, dbNumber);
				
				resultData.setName(word);
				resultData.setLv(dataFromDB.getLv());
				resultData.setLesson(dataFromDB.getLesson());
				resultData.setPart(dataFromDB.getPart());
				resultData.setIsAlreadyLeaned(checkResult);
				resultData.setIsExistsInDB(dataFromDB.getIsExists());
				resultList.add(resultData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultList;
	}
}
