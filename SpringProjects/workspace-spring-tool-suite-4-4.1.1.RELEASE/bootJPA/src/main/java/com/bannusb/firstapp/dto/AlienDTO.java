package com.bannusb.firstapp.dto;

public class AlienDTO {

	int aid;
	String aname;
	String alang;
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", alang=" + alang + "]";
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAlang() {
		return alang;
	}
	public void setAlang(String alang) {
		this.alang = alang;
	}
	
}

