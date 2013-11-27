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
	MainForm(){
		super("图书管理系统");
		setSize(800,600);
		setVisible(true);
		setResizable(false);
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
