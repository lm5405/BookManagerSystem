package com.dovewi.bookmgrcode.ui;

/* 
 * 图书管理系统
 * 
 * 实现主窗体
 * 
 * 要求毕程宇尽快实现
 * 
 * add by dovewi
*/

import java.awt.event.*;
import javax.swing.*;

public class MainForm extends JFrame {
	//TODO 实现主窗体，通过构造函数添加组件实现
	//TODO 实现标签样式界面，包括在馆图书查询，借书，还书，增加新图书
	//TODO 详细界面设计图林木来设计
	MainForm(){
		super("图书管理系统");
		setSize(800,600);
		setVisible(true);
		JTabbedPane MJTP=new JTabbedPane();
		MJTP.addTab("借书", new LendBookPanelUI());
		MJTP.addTab("还书",new ReturnBookUI());
		MJTP.addTab("续借", new RenewUI());
		MJTP.addTab("入库",new AddBookUI());
		getContentPane().add(MJTP);
		validate();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
