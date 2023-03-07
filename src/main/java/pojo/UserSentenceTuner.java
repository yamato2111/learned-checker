package pojo;

import java.util.ArrayList;
import java.util.List;

public class UserSentenceTuner {

	public TunedData sentenceTuner(String userSentence, List<String> lines) {

		List<String> tunedList = new ArrayList<>();

		for (String data : lines) {
			if (userSentence.contains(data)) {
				tunedList.add(data);
				userSentence = userSentence.replace(data, "");
			}
		}
		TunedData tunedData = new TunedData(userSentence, tunedList);
		return tunedData;
	}
}
