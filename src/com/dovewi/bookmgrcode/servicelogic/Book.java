package com.dovewi.bookmgrcode.servicelogic;
//图书信息类,方便实现数据库操作当参数穿进去
public class Book {
	public String bkISBN;
	public String bkName;
	public String bkAuthor;
	public float bkPrice;
	public int bkAmount;//在馆数量
	public int bkSum;//总共数量
	public String bkInfo;//图书简介
	
	Book(){
		//空构造函数
	}
	
	//带值构造函数
	Book(String bkISBN,String bkName,String bkAuthor,float bkPrice,int bkAmount,int bkSum,String bkInfo){
		this.bkISBN=bkISBN;
		this.bkName=bkName;
		this.bkAuthor=bkAuthor;
		this.bkPrice=bkPrice;
		this.bkAmount=bkAmount;
		this.bkSum=bkSum;
		this.bkInfo=bkInfo;
	}
}
