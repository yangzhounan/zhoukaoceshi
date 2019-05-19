package com.nzy.entity;

public class Goods {
    private int gid;
    private String gname;
    private String price;
    private String size;
    private String gnum;
    private Brand brand;
	public Goods(int gid, String gname, String price, String size, String gnum, Brand brand) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.size = size;
		this.gnum = gnum;
		this.brand = brand;
	}
	public Goods(int gid, String gname, String price, String size, String gnum) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.size = size;
		this.gnum = gnum;
	}
	public Goods() {
		super();
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getGnum() {
		return gnum;
	}
	public void setGnum(String gnum) {
		this.gnum = gnum;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", size=" + size + ", gnum=" + gnum
				+ ", brand=" + brand + "]";
	}
	
    
}
