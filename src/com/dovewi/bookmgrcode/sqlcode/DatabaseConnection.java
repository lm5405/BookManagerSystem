package com.dovewi.bookmgrcode.sqlcode;

import java.sql.*;

public class DatabaseConnection {
	private static String URL;
	private static String PWD;
	private static String USER;

	public static Connection getMyDatabaseConnection() {
		Connection con=null;
		URL = "jdbc:mysql://db4free.net:3306/dovewibmg";
		PWD = "mytestserver";
		USER = "iidove";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PWD);
		} catch (Exception e) {
			System.out.println("创建连接过程出错:" + e.getMessage());
		}
		return con;
	}
}
