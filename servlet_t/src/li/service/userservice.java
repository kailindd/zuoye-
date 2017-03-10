package li.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lk.util.ConnectionFactory;

import lk.dao.*;
import lk.dao.imp.impdao;
import lk.entity.user;

public class userservice  {
	public userdao userdao=new impdao();
	
public boolean check(user user){
	Connection conn=null;
	conn=ConnectionFactory.getInstance().makeConnection();

		try {
			conn.setAutoCommit(false);
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		ResultSet resultset=null;
		try {
			resultset = userdao.get(conn, user);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			while (resultset.next()) {
				return true;
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
	
	
return false;

	
}
}
