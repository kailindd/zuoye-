package lk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import li.service.userservice;
import lk.entity.user;

/**
 * Servlet implementation class checkservlet
 */
@WebServlet("/checkservlet")
public class checkservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private userservice ur=new userservice();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		RequestDispatcher rd=null;
		String forward=null;
		if (name==null||password==null) {
			request.setAttribute("msg", "’À∫≈√‹¬Î≤ªƒ‹Œ™ø’");
			rd=request.getRequestDispatcher("01/error.jsp");
			rd.forward(request, response);
			
		}else{
			user user=new user();
			user.setName(name);
			user.setPassword(password);
			boolean bool=ur.check(user);
			
		if (bool) {
			forward="01/success.jsp";
			
		}
		else {
			forward="01/faild.jsp";
		}
			
		}
		rd=request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

}
