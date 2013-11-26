package com.dovewi.bookmgrcode.sqlcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.dovewi.bookmgrcode.vo.LendBook;

public class LendTableDatabaseCode {
	private static Connection con;
	private static PreparedStatement stat = null;
	private static String sql;
	
	public static boolean addLendBook(LendBook lbk) {
		sql = "insert into bm_lend (isbnnumber,readernum,lendtime,shouldreturntime) VALUES (?,?,?,?);";
		int flag = 0;
		try{
			con=DatabaseConnection.getMyDatabaseConnection();
			stat=con.prepareStatement(sql);
			stat.setString(1, lbk.getISBN());
			stat.setString(2, lbk.getReaderNum());
			stat.setDate(3,lbk.getLendTime());
			stat.setDate(4,lbk.getShouldReturnTime());
			flag=stat.executeUpdate();
			stat.close();
			con.close();
		}catch(Exception e){
			System.out.println("出现错误:"+e.getMessage());
		}
		if (flag > 0)
			return true;
		else
			return false;
	}
	
	public static boolean delLendBook(String isbn,String readernum){
		sql = "DELETE FROM bm_lend WHERE isbnnumber="+isbn+" AND readernum="+readernum;
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
	
	public static boolean updateLendBook(String num, String item, String value) {
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
}
