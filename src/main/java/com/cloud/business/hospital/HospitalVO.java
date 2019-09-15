package com.cloud.business.hospital;

import java.io.Serializable;
import java.util.Date;

public class HospitalVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3698268508495682224L;
	private long id;
	private String name;
	private String address;
	private String logo;
	private String phone;
	private String remark;
	private String contactor;
	private long updateId;
	private Date updateTime;
	private long createId;
	private Date createTime;
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
	public long getUpdateId() {
		return updateId;
	}
	public void setUpdateId(long updateId) {
		this.updateId = updateId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public long getCreateId() {
		return createId;
	}
	public void setCreateId(long createId) {
		this.createId = createId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	

}
