package com.dovewi.bookmgrcode.vo;

import java.sql.Date;

public class LendBook {
	private String ISBN;
	private String readerNum;
	private Date lendTime;
	private Date shouldReturnTime;
	
	public LendBook(){
	}
	public void setISBN(String ib){
		this.ISBN=ib;
	}
	public String getISBN(){
		return ISBN;
	}
	
	public void setReaderNum(String readerNum) {
		this.readerNum = readerNum;
	}
	public String getReaderNum() {
		return readerNum;
	}
	
	public void setLendTime(Date dt){
		this.lendTime=dt;
	}
	public Date getLendTime(){
		return lendTime;
	}
	
	public void setShouldReturnTime(Date dt){
		this.shouldReturnTime=dt;
	}
	public Date getShouldReturnTime(){
		return shouldReturnTime;
	}
}
