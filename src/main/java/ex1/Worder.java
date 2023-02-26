package ex1;

import java.util.List;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

public class Worder {
	public List<Token> worder() {
		Tokenizer tokenizer = new Tokenizer();
		List<Token> tokens = tokenizer.tokenize("昨日、公園へ行きました。");
		return tokens;
	}

}
