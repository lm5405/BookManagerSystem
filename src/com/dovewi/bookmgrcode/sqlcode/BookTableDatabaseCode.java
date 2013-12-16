package com.dovewi.bookmgrcode.sqlcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dovewi.bookmgrcode.vo.Book;

public class BookTableDatabaseCode {
	private static Connection con;
	private static PreparedStatement stat = null;
	private static String sql;
	
	public static boolean addBook(Book bk){
		sql = "insert into bm_book (isbnnumber,bookname,author,price,amount,sum,bookinfo) values (?,?,?,?,?,?,?)";
		int flag = 0;
		try {
			con = DatabaseConnection.getMyDatabaseConnection();
			stat = con.prepareStatement(sql);
			stat.setString(1, bk.getISBN());
			stat.setString(2, bk.getBookName());
			stat.setString(3, bk.getBookAuthor());
			stat.setString(4, bk.getBookPrice());
			stat.setString(5, bk.getBookAmount());
			stat.setString(6, bk.getBookSum());
			stat.setString(7, bk.getBookInfo());
			flag = stat.executeUpdate();
			stat.close();
			con.close();
		} catch (Exception e) {
			System.out.println("添加出错:" + e.getMessage());
		}
		if (flag > 0)
			return true;
		else
			return false;
	}
	
	public static boolean delBook(String num){
		sql = "DELETE FROM bm_book WHERE isbnnumber=" + num;
		int flag = 0;
		try {
			con = DatabaseConnection.getMyDatabaseConnection();
			stat = con.prepareStatement(sql);
			flag = stat.executeUpdate();
			stat.close();
			con.close();
		} catch (Exception e) {
			System.out.println("删除出错:" + e.getMessage());
		}
		if (flag > 0)
			return true;
		else
			return false;
	}
	
	public static boolean updateBook(String num, String item, String value) {
		sql = "UPDATE bm_book SET "+item+"=? WHERE isbnnumber=?;";
		int flag = 0;
		try {
			con = DatabaseConnection.getMyDatabaseConnection();
			stat = con.prepareStatement(sql);
			stat.setString(1, value);
			stat.setString(2, num);
			flag = stat.executeUpdate();
			stat.close();
			con.close();
		} catch (Exception e) {
			System.out.println("更新出错" + e.getMessage());
		}
		if (flag > 0)
			return true;
		else
			return false;
	}
	
	public static ResultSet queryBook(String item,boolean j){
		sql="";
		if (j==true){
			sql="SELECT * FROM bm_book WHERE isbnnumber=%?%";//选择查询的精确程度
		}else
			sql="SELECT * FROM bm_book WHERE isbnnumber=?";
		ResultSet rs=null;
		try{
			con = DatabaseConnection.getMyDatabaseConnection();
			stat = con.prepareStatement(sql);
			stat.setString(1, item);
			rs = stat.executeQuery();
		}catch(SQLException e){
			System.out.println("查询出错："+e.getMessage());
		}
		return rs;
	}
}