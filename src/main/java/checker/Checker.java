package checker;

public class Checker {
	public static boolean isAlreadyLearned(int userNumber, int dbNumber) {
		if (userNumber >= dbNumber)  {
			return true;
		} else {
			return false;
		}
	} 
}
