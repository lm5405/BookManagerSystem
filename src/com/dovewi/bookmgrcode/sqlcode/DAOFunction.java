package com.dovewi.bookmgrcode.sqlcode;
/*
 * 本类实现数据库读写操作等必须函数
 * 数据库托管在db4free
 * 数据库用户名：iidove
 * 数据库密码：mytestserver
 * 请勿随意更改数据库密码和数据
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
	private static Connection conne;
	private static Statement state;

	public static Connection ConnectDatabase(){
		Connection con = null;  //创建用于连接数据库的Connection对象  
        try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动  
              
            con = DriverManager.getConnection(  
                    "jdbc:mysql://db4free.net:3306/dovewibmg", "iidove", "mytestserver");// 创建数据连接  
            System.out.println("数据库连接成功");              
        } catch (Exception e) {  
            System.out.println("数据库连接失败" + e.getMessage());  
        }  
        return con;
	}

	//添加图书函数
	public static int AddBook(){
		int tmp=1;
		String sql="";
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
		ResultSet tmp=null;
		String sql="select * from bm_book where 1";
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
		ResultSet tmp=null;
		String sql="select * from bm_book where bookname="+bookName+"or isbnnumber="+bookISBN+"or author="+bookAuthor;
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
		//TODO 还书函数，直接填写书号和学号,需要检查学生是否借了这本书,还书成功数据库书的在馆量加一,学生借书表减少相应条目,如果时间违约则学生表违约次数加一
	}
	
	
	//以下代码用于处理表，为上面增加项目，删除项目，修改项目处理提供辅助,可对应表编写重载
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
