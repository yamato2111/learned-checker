package pojo;

import bean.UserSetting;

public class UserNumberMaker {
	// 初級1の場合：Lv + (lesson * 100) + part
	// 初級2の場合：(Lv * 1000) + (lesson * 100) + part
	
	public int numberMaker(UserSetting userSetting) {
		
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
