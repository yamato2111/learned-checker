// 比較のためのユーザ側番号を生成する

package pojo;

import bean.UserSetting;

public class UserNumberGenerator {
	// 初級1の場合：  レベル + (課 × 100) + 回
	// 初級2の場合：  (レベル * 1000) + (課 × 100) + 回
	
	public int userNumberGenerator(UserSetting userSetting) {
		
		int userNumber;
		int userLvNumber, userLessonNumber, userPartNumber;
		
		if (userSetting.getLv() == 2) {
			userLvNumber = (userSetting.getLv()) * 1000;
		} else {
			userLvNumber = userSetting.getLv();
		}
		
		userLessonNumber = (userSetting.getLesson()) * 100;
		userPartNumber = userSetting.getPart();
		
		
		userNumber = userLvNumber + userLessonNumber + userPartNumber;
		
		return userNumber;
	} 

}
