package com.cloud.business.hospital;

import java.io.Serializable;
import java.util.Date;

public class HospitalBOD implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2588744581550031456L;
	private long id;
	private String name;
	private String address;
	private String logo;
	private String phone;
	private String remark;
	private String contactor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getContactor() {
		return contactor;
	}
	public void setContactor(String contactor) {
		this.contactor = contactor;
	}
	

}
