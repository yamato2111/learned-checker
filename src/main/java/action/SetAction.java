package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;

public class SetAction extends Action {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		if (session.getAttribute("user") != null) {
			return "/WEB-INF/check/set-sentence.jsp";
		}
		return "/WEB-INF/entry/login-error.jsp";
	}

}