package com.dovewi.bookmgrcode.ui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ReaderManagerUI extends JPanel{
	ReaderManagerUI(){
		this.setLayout(null);
		JTabbedPane tb=new JTabbedPane();
		tb.addTab("办理借阅证", new AddReaderPane());
		tb.addTab("修改信息",new UpdateReaderPane());
		tb.addTab("删除读者",new DeleteReaderPane());
		tb.addTab("借书查询", new QueryReaderPane());
		tb.setVisible(true);
		tb.setBounds(20,20,750,500);
		this.add(tb);
	}
}

class AddReaderPane extends JPanel{
	
	AddReaderPane(){
		
		JButton btt=new JButton("测试");
		add(arp);
		add(btt);
	}
	
}

class DeleteReaderPane extends JPanel{
	DeleteReaderPane(){
		
	}
}

class UpdateReaderPane extends JPanel{
	UpdateReaderPane(){
		
	}
}

class QueryReaderPane extends JPanel{
	QueryReaderPane(){
		
	}
}
