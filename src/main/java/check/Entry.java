package check;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/entry"})
public class Entry extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			String path = "/WEB-INF/check/set-sentence.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
