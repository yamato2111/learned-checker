// ユーザ入力情報と、該当するDBデータを比較して既習、未習を判定する

package pojo;

import java.util.HashMap;
import java.util.List;

import bean.DataFromDb;
import bean.ResultData;
import bean.UserSetting;

public class Compar {

    public HashMap<String, ResultData> learnedMaping(List<String> extractionResult, UserSetting userSetting) {
    	HashMap<String, ResultData> resultMap = new HashMap<>();
    	
    	for (String word : extractionResult) {
    		ResultData resultData = new ResultData();
    		DataFromDb dataFromDb = new DataFromDb();
    		//TODO DBから当該インスタンスのデータを取得
    		// test code
    		dataFromDb.setLevel(1);
    		dataFromDb.setLesson(2);
    		dataFromDb.setPart(3);
    		// test code
    		
	    	if (dataFromDb.getLevel() > userSetting.getLevel()) {
	    		resultData.setIsAlreadyLeaned(false);
	    	} else if (dataFromDb.getLesson() > userSetting.getLesson()) {
	    		resultData.setIsAlreadyLeaned(false);
	    	} else if (dataFromDb.getPart() > userSetting.getPart()) {
	    		resultData.setIsAlreadyLeaned(false);
	    	} else {
	    		resultData.setIsAlreadyLeaned(true);
	    	}
	    	
	    	resultData.setName(word);
	    	resultData.setLevel(dataFromDb.getLevel());
	    	resultData.setLesson(dataFromDb.getLesson());
	    	resultData.setPart(dataFromDb.getPart());
	    	resultMap.put(word, resultData);
	    	
    	}
    	return resultMap;
    }
}
