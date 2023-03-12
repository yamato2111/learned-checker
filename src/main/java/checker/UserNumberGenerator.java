// 比較のためのユーザ側番号を生成する

package checker;

import bean.UserSetting;

public class UserNumberGenerator {
	// 初級1の場合：  レベル + (課 × 100) + 回
	// 初級2の場合：  (レベル * 1000) + (課 × 100) + 回
	private static final int NUM_FOR_LEVELTWO = 1000;
	private static final int NUM_FOR_LESSON = 100;
	private int userNumber;
	private int userLvNumber, userLessonNumber, userPartNumber;

	public int userNumberGenerator(UserSetting userSetting) {
		
		if (userSetting.getLv() == 2) {
			userLvNumber = (userSetting.getLv()) * NUM_FOR_LEVELTWO;
		} else {
			userLvNumber = userSetting.getLv();
		}
		
		userLessonNumber = (userSetting.getLesson()) * NUM_FOR_LESSON;
		userPartNumber = userSetting.getPart();
		
		userNumber = userLvNumber + userLessonNumber + userPartNumber;
		
		return userNumber;
	} 

}
