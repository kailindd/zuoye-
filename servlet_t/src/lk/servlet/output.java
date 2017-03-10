package lk.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.Messaging.SyncScopeHelper;

import com.lk.dap.imp.jdbc_dao_imp;
import com.lk.test.ConnectionFactoryTest;
import com.lk.util.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class output
 */
@WebServlet("/output")
public class output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public output(){
		super();
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
		List<String> list=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		String sql ="select u.user_id,  u.user_name ,u.hobby ,d.adress_name"
				   +" from jdbc_user u,jdbc_adress d where 1=1 and  u.adress_id=d.adress_id and u.adress_id=? " ;
		String address=request.getParameter("address");
		int adress2=Integer.parseInt(address);
	Connection conn= ConnectionFactory.getInstance().makeConnection();
	try {
		java.sql.PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, adress2);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			list.add(rs.getString("user_name"));
			list2.add(rs.getString("hobby"));
		}
		System.out.println(list.get(0));
			request.setAttribute("a", list);
			request.setAttribute("b", list2);
			request.getRequestDispatcher("/02/1.jsp").forward(request, response);
			
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	


}
