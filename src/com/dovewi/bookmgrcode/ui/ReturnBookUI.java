package com.dovewi.bookmgrcode.ui;

import javax.swing.*;

import com.dovewi.bookmgrcode.servicelogic.ActionManager;

public class ReturnBookUI extends JPanel {
	public static JButton btnTrue;
	public static JButton btnClear;
	public static JButton btnGet;
	public static JTextField tfReaderNum;
	public static JTextField tfBookNum;
	public static JTextArea taBookList;
	
	public ReturnBookUI(){
		JLabel label1=new JLabel("借书证号");
		JLabel label2=new JLabel("图书编号");
		JLabel label3=new JLabel("借书清单");
		
		btnTrue=new JButton("还书");
		btnClear=new JButton("清空");
		btnGet=new JButton("获取清单");
		
		tfReaderNum=new JTextField(15);
		tfBookNum=new JTextField(15);
		taBookList=new JTextArea();
		
		this.setLayout(null);
		//标签位置
		add(label1);
		add(label2);
		add(label3);
		label1.setBounds(30,30,150,16);
		label2.setBounds(420,30,213,16);
		label3.setBounds(30,130,105,16);
		
		//按钮位置
		add(btnTrue);
		add(btnClear);
		add(btnGet);
		btnGet.setBounds(30,480,100,25);
		btnGet.addActionListener(new ActionManager());
		btnClear.setBounds(160,480,100,25);
		btnClear.addActionListener(new ActionManager());
		btnTrue.setBounds(270,480,100,25);
		btnClear.addActionListener(new ActionManager());
		
		//文本框
		add(tfReaderNum);
		add(tfBookNum);
		add(taBookList);
		tfReaderNum.setBounds(30,70,320,25);
		tfBookNum.setBounds(420,70,320,25);
		taBookList.setBounds(30,160,710,280);
		
	}
}
