package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.LoginDAO;
import tool.Action;

public class EnterAction extends Action {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		String login = request.getParameter("name");
		String password = request.getParameter("password");
		LoginDAO dao = new LoginDAO();
		User user = dao.search(login, password);
		
		if (user != null) {
			session.setAttribute("user", user);
			return "/WEB-INF/check/set-sentence.jsp";
		}
		return "/WEB-INF/entry/login-error.jsp";
		
	}
	

}