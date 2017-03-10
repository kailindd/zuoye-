package com.lk.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.lk.util.ConnectionFactory;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	private static final ConnectionFactory factory = new ConnectionFactory();
	private Connection conn;

	static {
		Properties prop = new Properties();
		try {
			System.out.println("22222222");

			/*ClassLoader cloder = ConnectionFactory.class.getClassLoader();
			if (cloder == null) {
				System.out.println("类加载器返回空");
			}
			InputStream in = cloder.getResourceAsStream("src/pro.txt");*/
			
			  InputStream in=ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			 
			if (in == null) {
				System.out.println("返回流为空");
			}
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("配置文件读取出错！");
		}
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}

	private ConnectionFactory() {
		System.out.println("33333333");

	};

	public static ConnectionFactory getInstance() {
		System.out.println("111111");
		return factory;
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

}