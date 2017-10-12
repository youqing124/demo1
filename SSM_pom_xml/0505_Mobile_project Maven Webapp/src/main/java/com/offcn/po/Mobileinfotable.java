package com.offcn.po;

public class Mobileinfotable {

	
	private int id;
	private String mobileNumber;
	private String mobileArea ;
	private String mobileType ;
	private String areaCode ;
	private String postCode ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMobileArea() {
		return mobileArea;
	}
	public void setMobileArea(String mobileArea) {
		this.mobileArea = mobileArea;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	@Override
	public String toString() {
		return "mobileinfotable [id=" + id + ", mobileNumber=" + mobileNumber + ", mobileArea=" + mobileArea
				+ ", mobileType=" + mobileType + ", areaCode=" + areaCode + ", postCode=" + postCode + "]";
	}
	
	
}
