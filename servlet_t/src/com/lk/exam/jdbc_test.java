package com.lk.exam;

import java.sql.Connection;
import java.util.Scanner;

import com.lk.dap.imp.jdbc_dao_imp;

import com.lk.util.ConnectionFactory;

public class jdbc_test {
	public static void main(String[] args) {

		int address_id = 0;
		System.out.println("«Î ‰»Îµÿ÷∑id:");
		Scanner s = new Scanner(System.in);
		address_id = s.nextInt();

		Connection conn = ConnectionFactory.getInstance().makeConnection();
		/*
		 * Connection_1 c=new Connection_1(); Connection conn=
		 * c.getConnection();
		 */

		jdbc_dao_imp jdi = new jdbc_dao_imp();
		jdi.select(conn, address_id);

	}
}
