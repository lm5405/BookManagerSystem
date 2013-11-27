package com.dovewi.bookmgrcode.servicelogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.dovewi.bookmgrcode.sqlcode.*;
import com.dovewi.bookmgrcode.ui.*;
import com.dovewi.bookmgrcode.vo.*;

public class ActionManager implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==AddBookUI.bt_commit){
			String a="";
			String b="";
			String c="";
			String d="";
			String e="";
			String f="";
			String g="";
			a=AddBookUI.tf_bookISBN.getText();
			b=AddBookUI.tf_bookSum.getText();
			c=AddBookUI.tf_bookName.getText();
			d=AddBookUI.tf_bookPrice.getText();
			e=AddBookUI.ta_bookInfo.getText();
			f=AddBookUI.tf_bookSum.getText();
			g=AddBookUI.tf_bookAuthor.getText();
			Book bktmp=new Book();
			bktmp.setISBN(a);
			bktmp.setBookSum(b);
			bktmp.setBookName(c);
			bktmp.setBookPrice(d);
			bktmp.setBookInfo(e);
			bktmp.setBookAmount(f);
			bktmp.setBookAuthor(g);
			boolean flag=BookTableDatabaseCode.addBook(bktmp);
			if(flag==true){
				System.out.println("插入图书成功-主函数");
			}
			else
				System.out.println("插入图书失败-主函数");
		}
	}

}
