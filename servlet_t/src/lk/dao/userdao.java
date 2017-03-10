package lk.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import lk.entity.user;

public interface userdao {
	public void save(Connection conn,user user) throws SQLException;
	public void update(Connection conn ,long id,user user )throws SQLException;
	public void delete(Connection conn,user user)throws SQLException;
	public ResultSet get(Connection conn,user user)throws SQLException;
		
	}


