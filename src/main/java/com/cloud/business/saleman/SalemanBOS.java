package com.cloud.business.saleman;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 业务员表
 *
 * @author Michael
 * @date 2019-09-17 01:13:27
 */
public class SalemanBOS implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键ID*/
    private Long id;
	/**用户Id*/
    private Long userId;
	/**业务员真实姓名*/
    private String realName;
	/**身份证号*/
    private String idCard;
	/**手机号码*/
    private String phone;
	/**认证状态(1：认证通过  2：未认证  3：认证不通过*/
    private Integer auditStatus;
	/**身份证手持*/
    private String sfzSc;
	/**身份证正面*/
    private String sfzZm;
	/**身份证反面*/
    private String sfzFm;
	/**备注*/
    private String remark;
	/**创建时间*/
    private Date createTime;
	/**创建者Id*/
    private Long updateId;
	/**更新时间*/
    private Date updateTime;
	/**个人提成比例分配*/
    private Double rate;
	
	
	/**
	 * 设置：主键ID
	 */
	public void setId(Long id) {
			this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Long getId() {
			return id;
	}
	/**
	 * 设置：用户Id
	 */
	public void setUserId(Long userId) {
			this.userId = userId;
	}
	/**
	 * 获取：用户Id
	 */
	public Long getUserId() {
			return userId;
	}
	/**
	 * 设置：业务员真实姓名
	 */
	public void setRealName(String realName) {
			this.realName = realName;
	}
	/**
	 * 获取：业务员真实姓名
	 */
	public String getRealName() {
			return realName;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdCard(String idCard) {
			this.idCard = idCard;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdCard() {
			return idCard;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhone(String phone) {
			this.phone = phone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhone() {
			return phone;
	}
	/**
	 * 设置：认证状态(1：认证通过  2：未认证  3：认证不通过
	 */
	public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
	}
	/**
	 * 获取：认证状态(1：认证通过  2：未认证  3：认证不通过
	 */
	public Integer getAuditStatus() {
			return auditStatus;
	}
	/**
	 * 设置：身份证手持
	 */
	public void setSfzSc(String sfzSc) {
			this.sfzSc = sfzSc;
	}
	/**
	 * 获取：身份证手持
	 */
	public String getSfzSc() {
			return sfzSc;
	}
	/**
	 * 设置：身份证正面
	 */
	public void setSfzZm(String sfzZm) {
			this.sfzZm = sfzZm;
	}
	/**
	 * 获取：身份证正面
	 */
	public String getSfzZm() {
			return sfzZm;
	}
	/**
	 * 设置：身份证反面
	 */
	public void setSfzFm(String sfzFm) {
			this.sfzFm = sfzFm;
	}
	/**
	 * 获取：身份证反面
	 */
	public String getSfzFm() {
			return sfzFm;
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
	 * 设置：创建者Id
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：创建者Id
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
	/**
	 * 设置：个人提成比例分配
	 */
	public void setRate(Double rate) {
			this.rate = rate;
	}
	/**
	 * 获取：个人提成比例分配
	 */
	public Double getRate() {
			return rate;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}