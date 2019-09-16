package com.cloud.business.hospitalDoctor;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:28
 */
public class HospitalDoctorBOU implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键Id*/
    private Long id;
	/**医生名称*/
    private String name;
	/**职位*/
    private String position;
	/**头像*/
    private String headImg;
	/**联系电话*/
    private String phone;
	/**医院Id*/
    private Long hospitalId;
	/**备注*/
    private String remark;
	/**创建人Id*/
    private Long createId;
	/**创建时间*/
    private Date createTime;
	/**更新者Id*/
    private Long updateId;
	/**更新时间*/
    private Date updateTime;
	
	
	/**
	 * 设置：主键Id
	 */
	public void setId(Long id) {
			this.id = id;
	}
	/**
	 * 获取：主键Id
	 */
	public Long getId() {
			return id;
	}
	/**
	 * 设置：医生名称
	 */
	public void setName(String name) {
			this.name = name;
	}
	/**
	 * 获取：医生名称
	 */
	public String getName() {
			return name;
	}
	/**
	 * 设置：职位
	 */
	public void setPosition(String position) {
			this.position = position;
	}
	/**
	 * 获取：职位
	 */
	public String getPosition() {
			return position;
	}
	/**
	 * 设置：头像
	 */
	public void setHeadImg(String headImg) {
			this.headImg = headImg;
	}
	/**
	 * 获取：头像
	 */
	public String getHeadImg() {
			return headImg;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
			this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
			return phone;
	}
	/**
	 * 设置：医院Id
	 */
	public void setHospitalId(Long hospitalId) {
			this.hospitalId = hospitalId;
	}
	/**
	 * 获取：医院Id
	 */
	public Long getHospitalId() {
			return hospitalId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
			this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
			return remark;
	}
	/**
	 * 设置：创建人Id
	 */
	public void setCreateId(Long createId) {
			this.createId = createId;
	}
	/**
	 * 获取：创建人Id
	 */
	public Long getCreateId() {
			return createId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
			this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
			return createTime;
	}
	/**
	 * 设置：更新者Id
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：更新者Id
	 */
	public Long getUpdateId() {
			return updateId;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
			return updateTime;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}