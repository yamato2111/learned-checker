// ユーザ入力情報と、該当するDBデータを比較して既習、未習を判定する

package pojo;

import java.util.ArrayList;
import java.util.List;

import bean.DataFromDb;
import bean.ResultData;
import bean.UserSetting;
import dao.WordsDAO;

public class Compar {
	public List<ResultData> learnedMaping(List<String> extractionResult, UserSetting userSetting) {
		List<ResultData> resultList = new ArrayList<>();

		try {
			for (String word : extractionResult) {
				ResultData resultData = new ResultData();
				WordsDAO dao = new WordsDAO();
				DataFromDb dataFromDb = dao.search(word);
				
				System.out.println("今からチェックする単語：" + word);
				System.out.println("dataFromDb.getLv()" + dataFromDb.getLv());
				System.out.println("userSetting.getLv()" + userSetting.getLv());
				System.out.println("dataFromDb.getLesson()" + dataFromDb.getLesson());
				System.out.println("userSetting.getLesson()" + userSetting.getLesson());
				System.out.println("dataFromDb.getPart()" + dataFromDb.getPart());
				System.out.println("userSetting.getPart()" + userSetting.getPart());
				
				boolean resultLv = dataFromDb.getLv() > userSetting.getLv();
				System.out.println("resultLv:" + resultLv);
				boolean resultLesson = dataFromDb.getLesson() > userSetting.getLesson();
				System.out.println("resultLesson:" + resultLesson);
				boolean resultPart = dataFromDb.getPart() > userSetting.getPart();
				System.out.println("resultPart:" + resultPart);
				
				if (dataFromDb.getLv() > userSetting.getLv()) {
					resultData.setIsAlreadyLeaned(false);
				} else if (dataFromDb.getLesson() > userSetting.getLesson()) {
					resultData.setIsAlreadyLeaned(false);
				} else if (dataFromDb.getPart() > userSetting.getPart()) {
					resultData.setIsAlreadyLeaned(false);
				} else {
					resultData.setIsAlreadyLeaned(true);
				}
				
				resultData.setName(word);
				resultData.setLv(dataFromDb.getLv());
				resultData.setLesson(dataFromDb.getLesson());
				resultData.setPart(dataFromDb.getPart());
				resultList.add(resultData);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultList;
	}
}
