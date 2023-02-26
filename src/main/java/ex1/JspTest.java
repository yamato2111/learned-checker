package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

@WebServlet("/JspTest")
public class JspTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();
        
        Tokenizer tokenizer = new Tokenizer() ;
    List<Token> tokens = tokenizer.tokenize("昨日、デパートでお茶を買いました。");
        for (Token token : tokens) {
            out.println(token.getSurface() + "\t" + token.getPartOfSpeechLevel4());
            out.println("<br>");
            out.println(token.getSurface() + "\t" + token.getPartOfSpeechLevel2());
            out.println("<br>");
            out.println(token.getSurface() + "\t" + token.getPartOfSpeechLevel3());
            out.println("<br>");
            out.println(token.getSurface() + "\t" + token.getBaseForm());
            out.println("<br>");
            out.println("<br>");
            
            if (token.getPartOfSpeechLevel4() == "昨日 *") {
            	out.println("昨日です");
            }
        }    	
   
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}