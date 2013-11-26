package com.dovewi.bookmgrcode.sqlcode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.dovewi.bookmgrcode.vo.Book;
import com.dovewi.bookmgrcode.vo.LendBook;
import com.dovewi.bookmgrcode.vo.Reader;

@SuppressWarnings("unused")
public class TestDAO {
	
	public static void main(String args[])throws Exception{
		//会员表测试
		//reader表增加测试
		/*Reader rd=new Reader();
		rd.setReaderName("喜洋洋");
		rd.setReaderNum("1108060205");
		rd.setReaderSex("M");
		rd.setMaxLend(5);
		rd.setBorrowNum(0);
		rd.setRenegue(0);
		rd.setReaderPhone("18285121312");
		rd.setOther("0");
		boolean flag=ReaderTableDatabaseCode.addReader(rd);
		if(flag==true)
			System.out.println("插入成功-主函数");
		else
			System.out.println("插入失败-主函数");*/
		
		//删除测试
		/*boolean flag=UserTableDatabaseCode.delReader("1108060204");
		if(flag==true)
			System.out.println("删除成功-主函数");
		else
			System.out.println("删除失败-主函数");*/
		
		//修改测试
		/*boolean flag=ReaderTableDatabaseCode.updateReader("1108060204", "readername", "中国移动");
		if (flag==true)
			System.out.println("修改成功-主函数");
		else
			System.out.println("修改失败-主函数");*/
		
		
		
		//图书类的测试
		/*Book bk=new Book();
		bk.setISBN("9787040182545");
		bk.setBookName("物理学(第五版下册)");
		bk.setBookAuthor("马文蔚&解希顺&周雨青");
		bk.setBookInfo("本书分为上下两册,下册主要包括震动和波动,光学,热学等");
		bk.setBookPrice("38.00");
		bk.setBookSum(100);
		bk.setBookAmount(100);
		boolean flag=BookTableDatabaseCode.addBook(bk);
		if(flag==true){
			System.out.println("插入图书成功-主函数");
		}
		else
			System.out.println("插入图书失败-主函数");*/
		//修改图书
		/*boolean flag =BookTableDatabaseCode.updateBook("302275138", "bookname", "毛主席语录");
		if (flag==true)
			System.out.println("修改成功-主函数");
		else
			System.out.println("修改失败-主函数");*/
		//删除图书
		/*boolean flag=BookTableDatabaseCode.delBook("302275138");
		if(flag==true)
			System.out.println("删除成功-主函数");
		else
			System.out.println("删除失败-主函数");*/
		
		
		//借书类测试
		/*Date dt=new Date();
		java.sql.Date sqldt=new java.sql.Date(dt.getTime());
		Calendar cld=Calendar.getInstance();
		cld.setTime(dt);
		cld.add(Calendar.MONTH,1);
		Date dtreturn=cld.getTime();
		java.sql.Date sqldtreturn=new java.sql.Date(dtreturn.getTime());
		
		LendBook lbk=new LendBook();
		lbk.setISBN("9787040195835");
		lbk.setReaderNum("1108060204");
		lbk.setLendTime(sqldt);
		lbk.setShouldReturnTime(sqldtreturn);
		boolean flag=LendTableDatabaseCode.addLendBook(lbk);
		if(flag==true)
			System.out.println("插入成功-主函数");
		else
			System.out.println("插入失败-主函数");*/
		//删除借书条目
		/*boolean flag=LendTableDatabaseCode.delLendBook("9787040182545","1108060204");
		if(flag==true)
			System.out.println("删除成功-主函数");
		else
			System.out.println("删除失败-主函数");*/
		
	}
}
