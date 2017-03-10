package com.lk.dap.imp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lk.dao.jdbc_dao;



public class jdbc_dao_imp implements jdbc_dao {

	public void select(Connection conn, int address_id) {
		String sql ="select u.user_id,  u.user_name ,u.hobby ,d.adress_name"
				   +" from jdbc_user u,jdbc_adress d where 1=1 and  u.adress_id=d.adress_id and u.adress_id=? " ;
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, address_id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()){
				
				System.out.println("居住在" +rs.getString("adress_name")+ "街道的人有: "
				                  +rs.getString("user_name" )+"   他的爱好是 "
						          +rs.getString("hobby")+" "
				                  );
     		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}