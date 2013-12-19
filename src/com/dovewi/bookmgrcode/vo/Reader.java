package com.dovewi.bookmgrcode.vo;

public class Reader {
	private String readerNum;
	private String readerName;
	private String readerSex;
	private int maxLend;
	private int borrowNum;
	private int renegue;
	private String readerPhone;
	private String other;

	public Reader() {

	}

	public String getReaderNum() {
		return readerNum;
	}

	public String getReaderName() {
		return readerName;
	}

	public String getReaderSex() {
		return readerSex;
	}

	public int getMaxLend() {
		return maxLend;
	}

	public int getBorrowNum() {
		return borrowNum;
	}

	public int getRenegue() {
		return renegue;
	}

	public String getReaderPhone() {
		return readerPhone;
	}

	public String getOther() {
		return other;
	}

	// set
	public void setReaderNum(String readerNum) {
		this.readerNum = readerNum;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public void setReaderSex(String readerSex) {
		this.readerSex=readerSex;
	}

	public void setMaxLend(int maxLend) {
		this.maxLend=maxLend;
	}

	public void setBorrowNum(int borrowNum) {
		this.borrowNum=borrowNum;
	}

	public void setRenegue(int renegue) {
		this.renegue=renegue;
	}

	public void setReaderPhone(String readerPhone) {
		this.readerPhone=readerPhone;
	}

	public void setOther(String other) {
		this.other=other;
	}
}
