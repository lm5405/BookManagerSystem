package com.dovewi.bookmgrcode.sqlcode;
/*
 * 本类实现数据库读写操作等必须函数
 * 数据库托管在db4free
 * 数据库用户名：
 * 数据库密码：
 * add by dovewi
*/
/*本项目需要用到的表：
 * 学生表
 * 图书表
 * 借书表
 * 管理员表
*/
import java.sql.*;

public class DAOFunction {
	//此类正常工作需要mysql驱动，请到mysql官方下载
	private static Connection conne;
	private static Statement state;

	public static Connection ConnectDatabase(){
		//TODO 获取数据库连接对象
		//TODO 以下使用的测试服务器为上次通讯录管理系统的数据库服务器，将会修改
		Connection conTemp = null;
		try {
			Class.forName("java.mysql.jdbc.Driver");
			conTemp = DriverManager.getConnection(
					"jdbc:mysql://db4free.net:3306", "dovewi",
					"mytestserver");
		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return conTemp;
	}

	//添加图书函数
	public static int AddBook(String bkName){
		int tmp=1;
		String sql="";//本函数要执行的查询语句，等待完善
		try{
			conne=ConnectDatabase();
			state=conne.createStatement();
			tmp=state.executeUpdate(sql);
		}catch(SQLException e){
			System.out.println("出现错误："+e.getMessage());
		}
		return tmp;
	}

/*	//图书损坏后删除图书的函数
	public static ResultSet DelBook(,){
		//TODO 编写图书删除函数
	}*/

	public static ResultSet ListBook(){
		//TODO 查看图书列表
		ResultSet tmp=null;
		String sql="";//本函数要执行的查询语句，等待完善
		try{
			conne=ConnectDatabase();
			state=conne.createStatement();
			tmp=state.executeQuery(sql);
		}catch(SQLException e){
			System.out.println("出现错误："+e.getMessage());
		}
		return tmp;//返回结果集给业务逻辑处理
	}

	public static ResultSet SelectBook(String bookISBN,String bookName,String bookAuthor){
		//TODO 查询图书信息,可以增加重载
		ResultSet tmp=null;
		String sql="";//本函数要执行的查询语句，等待完善
		try{
			conne=ConnectDatabase();
			state=conne.createStatement();
			tmp=state.executeQuery(sql);
		}catch(SQLException e){
			System.out.println("出现错误："+e.getMessage());
		}
		return tmp;
	}

	public static ResultSet LendBooks(String bookISBN,String stuNumber){
		return null;
		//TODO 参数直接填书号，为了便于移植修改，本项目数据库不设立触发器，借书等修改需要同步各表的操作
		
	}

	public static ResultSet ReturnBooks(String bookISBN,String stuNumber){
		return null;
		//TODO 还书函数，直接填写书号
	}
	
	
	//以下代码用于处理表，为上面增加项目，删除项目，修改项目处理提供辅助
	private static int AddItem(){
		return 0;
	}
	
	private static int DelItem(){
		return 0;
	}
	
	private static int UpdateItem(){
		return 0;
	}
}
