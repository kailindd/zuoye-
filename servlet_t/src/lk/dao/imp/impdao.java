package lk.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import lk.dao.userdao;
import lk.entity.user;

public class impdao implements userdao {

	@Override
	public void save(Connection conn, user user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("insert into user values(?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.execute();
		
	}

	@Override
	public void update(Connection conn, long id, user user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, user user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet get(Connection conn, user user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select* from user where name=? and password=?");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ResultSet rs=ps.executeQuery();
		return rs;
	}

}
