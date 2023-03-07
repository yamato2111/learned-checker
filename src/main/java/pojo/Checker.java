package pojo;

public class Checker {
	public static boolean isAlreadyLearned(int userNumber, int dbNumber) {
		System.out.println("un:" + userNumber + "/dbn:" + dbNumber);
		if (userNumber >= dbNumber)  {
			return true;
		} else {
			return false;
		}
	} 
}
