package com.nzy.entity;

public class Brand {
    private int bid;
    private String bname;
    private String descp;
	public Brand(int bid, String bname, String descp) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.descp = descp;
	}
	public Brand() {
		super();
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + ", descp=" + descp + "]";
	}
    
}
