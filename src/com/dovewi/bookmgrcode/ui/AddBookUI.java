package com.dovewi.bookmgrcode.ui;

import java.awt.*;
import javax.swing.*;

public class AddBookUI extends JPanel {
	AddBookUI(){
		//标签
		JLabel label_bookName=new JLabel("书名");
		JLabel label_bookISBN=new JLabel("ISBN");
		JLabel label_bookAuthor=new JLabel("作者");
		JLabel label_bookPrice=new JLabel("标价");
		JLabel label_bookSum=new JLabel("数量");
		JLabel label_bookInfo=new JLabel("图书简介");
		//文本框和文本区域
		JTextField tf_bookName=new JTextField(40);
		JTextField tf_bookISBN=new JTextField(15);
		JTextField tf_bookAuthor=new JTextField(30);
		JTextField tf_bookPrice=new JTextField(5);
		JTextField tf_bookSum=new JTextField(6);
		JTextArea ta_bookInfo=new JTextArea();
		//增加滚动条面板并添加ta_bookinfo
		JScrollPane jspl=new JScrollPane(ta_bookInfo);
		//按钮
		JButton bt_commit=new JButton("提交");
		JButton bt_clear=new JButton("清空");
		//开始构造窗体
		setLayout(null);
		this.add(label_bookISBN);
		label_bookISBN.setBounds(40, 40, 30, 16);
		this.add(label_bookName);
		label_bookName.setBounds(40,130,30,16);
		this.add(label_bookAuthor);
		label_bookAuthor.setBounds(40,223,30,16);
		this.add(label_bookPrice);
		label_bookPrice.setBounds(40,314,30,16);
		this.add(label_bookSum);
		label_bookSum.setBounds(40,394,30,16);
		this.add(label_bookInfo);
		label_bookInfo.setBounds(340,40,80,16);
		//添加文本框到窗体
		this.add(tf_bookISBN);
		tf_bookISBN.setBounds(40, 70, 271, 30);
		this.add(tf_bookName);
		tf_bookName.setBounds(40,155,271,30);
		this.add(tf_bookAuthor);
		tf_bookAuthor.setBounds(40,249,271,30);
		this.add(tf_bookPrice);
		tf_bookPrice.setBounds(40,338,271,30);
		this.add(tf_bookSum);
		tf_bookSum.setBounds(40,420,271,30);
		this.add(jspl);
		jspl.setBounds(340,70,400,380);//添加的滚动条面板
		
		//添加两个按钮,侦听器设置到业务逻辑处理
		this.add(bt_commit);
		bt_commit.setBounds(530,470,100,25);
		this.add(bt_clear);
		bt_clear.setBounds(640,470,100,25);
	}
}
