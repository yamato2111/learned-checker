// ユーザ入力情報と、該当するDBデータを比較して既習、未習を判定する

package pojo;

import java.util.HashMap;
import java.util.List;

import bean.DataFromDb;
import bean.ResultData;
import bean.UserSetting;
import dao.WordsDAO;

public class Compar {

    public HashMap<String, ResultData> learnedMaping(List<String> extractionResult, UserSetting userSetting) {
    	HashMap<String, ResultData> resultMap = new HashMap<>();
    	
    	try {
    		System.out.println(extractionResult);
    	for (String word : extractionResult) {
    			System.out.println("word" + word);
	    		ResultData resultData = new ResultData();
	    		//DataFromDb dataFromDb = new DataFromDb();
	    		//TODO DBから当該インスタンスのデータを取得
	    		WordsDAO dao = new WordsDAO();
				
				List<DataFromDb> dataList = dao.search(word);
				for (DataFromDb dataFromDb : dataList) {
					if (dataFromDb.getLv() > userSetting.getLevel()) {
				    	resultData.setIsAlreadyLeaned(false);
				    } else if (dataFromDb.getLesson() > userSetting.getLesson()) {
				    	resultData.setIsAlreadyLeaned(false);
				    } else if (dataFromDb.getPart() > userSetting.getPart()) {
				    	resultData.setIsAlreadyLeaned(false);
				    } else {
				    	resultData.setIsAlreadyLeaned(true);
				    }
					    resultData.setName(word); System.out.println(resultData.getName());
					    resultData.setLv(dataFromDb.getLv()); System.out.println(resultData.getLv());
					    resultData.setLesson(dataFromDb.getLesson()); System.out.println(resultData.getLesson());
					    resultData.setPart(dataFromDb.getPart()); System.out.println(resultData.getPart());
					    System.out.println(resultData.getIsAlreadyLeaned());
					    resultMap.put(word, resultData);
					}
	    		}
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
    		
    	return resultMap;
    }
}
