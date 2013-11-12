package com.dovewi.bookmgrcode.sqlcode;
/*
 * 本类实现数据库读写操作等必须函数
 * 数据库托管在db4free
 * 数据库用户名：
 * 数据库密码：
 * add by dovewi
 */

import java.sql.*;

public class DAOFunction {
	//此类正常工作需要mysql驱动，请到mysql官方下载
	private Connection conne;
	private Statement State;
	
	public static Connection ConnectDatabase(){
		//TODO 获取数据库连接对象
		//TODO 以下使用的测试服务器为上次通讯录管理系统的数据库服务器，将会修改
		Connection conTemp = null;
		try {
			Class.forName("java.mysql.jdbc.Driver");
			conTemp = DriverManager.getConnection(
					"jdbc:mysql://db4free.net:3306/dovewicontacts", "dovewi",
					"mytestserver");
		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return conTemp;
	}
	
	//添加图书函数
	public static ResultSet AddBook(,){
		//TODO 添加图书到数据库的函数
	}
	
	//图书损坏后删除图书的函数
	public static ResultSet DelBook(,){
		//TODO 编写图书删除函数
	}
	
	public static ResultSet ListBook(){
		//TODO 查看图书列表
	}
	
	public static ResultSet SelectBook(,,){
		//TODO 查询图书信息,编写重载
	}
	
	public static ResultSet LendBooks(){
		//TODO 参数直接填书号
	}
	
	public static ResultSet ReturnBooks(){
		//TODO 还书函数，直接填写书号
	}
}
