package lk.servlet;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 2196098185033100971L;

	/*@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名为->"+name);
		System.out.println("密码为->"+password);
		if (name.equals("linkai")&&password.equals("11111")) {
			resp.send
			
			
		}
		}*/

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用户名为->"+name);
		System.out.println("密码为->"+password);
		String forward=null;
		if (name.equals("linkai")&&password.equals("11111")) {
			//请求重定向
			/*resp.sendRedirect(req.getContextPath()+"/01/success.jsp");*/
			//请求转发
			forward="/01/success.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
					
			
			
		}
		else {
			/*resp.sendRedirect(req.getContextPath()+"/01/faild.jsp");*/
			forward="/01/error.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,resp);
	
	}
	

}
