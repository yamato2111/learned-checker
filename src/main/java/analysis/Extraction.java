// ユーザが入力した文から、比較対象の品詞に該当する単語のみを抽出する

package analysis;

import java.util.Arrays;
import java.util.List;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

public class Extraction {

	// 抽出対象の品詞
	final private String[] POS_ARRAY = {"名詞", "形容詞", "動詞", "連体詞", "副詞"}; //TODO: プロパティファイルに移す

	public List<String> extraction(String sentence, List<String> extractionResultList) {
		Tokenizer tokenizer = new Tokenizer();

		List<Token> tokens = tokenizer.tokenize(sentence);
		// 抽出対象にあたる単語のみリストに追加
		for (Token token : tokens) {
			if (Arrays.asList(POS_ARRAY).contains(token.getPartOfSpeechLevel1())) {
				extractionResultList.add(token.getBaseForm());
			}
		}
		return extractionResultList;
	}

}