/*package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/ex1/DbConTest"})
public class DbConTest extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Servlet ex</title>");
        out.println("</head>");
        out.println("<body>");
		try {
			// test code
			String table = "noun";
			
			// /testcode
			//WordsDAO dao = new WordsDAO();
			//List<DataFromDb> list = dao.search(keyword);
			
			for (DataFromDb data : list) {
				out.println(data.getName());
				out.println(data.getLv());
				out.println(data.getLesson());
				out.println(data.getPart());
				out.println("<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        out.println("</body>");
        out.println("</html>");		
	}
}
*/