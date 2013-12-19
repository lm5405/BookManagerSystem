package com.dovewi.bookmgrcode.vo;

public class Book {
	private String ISBN;
	private String bookName;
	private String bookAuthor;
	private String bookPrice;
	private String bookAmount;
	private String bookSum;
	private String bookInfo;
	public Book(){
	}
	
	public void setISBN(String ib){
		this.ISBN=ib;
	}
	public String getISBN(){
		return ISBN;
	}
	
	public void setBookName(String nm){
		this.bookName=nm;
	}
	public String getBookName(){
		return bookName;
	}
	
	public void setBookAuthor(String at){
		this.bookAuthor=at;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	
	public void setBookPrice(String price){
		this.bookPrice=price;
	}
	public String getBookPrice(){
		return bookPrice;
	}
	
	public void setBookAmount(String ba){
		this.bookAmount=ba;
	}
	public String getBookAmount(){
		return bookAmount;
	}
	
	public void setBookSum(String string){
		this.bookSum=string;
	}
	public String getBookSum(){
		return bookSum;
	}
	
	public void setBookInfo(String ifo){
		this.bookInfo=ifo;
	}
	public String getBookInfo(){
		return bookInfo;
	}
}
