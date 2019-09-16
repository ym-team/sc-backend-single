package com.cloud.business.consumeDtl;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
public class ConsumeDtlBOQ implements Serializable{


	private static final long serialVersionUID=1L;

	/***/
    private Long id;
	/**项目名称*/
    private String projectName;
	/**总费用*/
    private BigDecimal sumFee;
	/**材料费*/
    private BigDecimal materialsFee;
	/**t_cust_consumer表中的主键ID*/
    private Long consumerId;
	/**医院id*/
    private Long hospitalId;
	/**店家ID*/
    private Long shopId;
	/**业务员id*/
    private Long bussinessUserId;
	/***/
    private String attrUrl;
	/**创建时间*/
    private Date createTime;
	/**更新时间*/
    private Date updateTime;
	/**备注信息*/
    private String remark;
	/**更新人*/
    private Long updateId;
	/**状态：1有效；0无效*/
    private Integer status;
	/**审核状态 1未审核 2审核通过  3未通过*/
    private Integer auditStatus;
	/**不通过理由*/
    private String auditReason;
	/**创建者id*/
    private Long createId;
	
	
	/**
	 * 设置：
	 */
	public void setId(Long id) {
			this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
			return id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectName(String projectName) {
			this.projectName = projectName;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectName() {
			return projectName;
	}
	/**
	 * 设置：总费用
	 */
	public void setSumFee(BigDecimal sumFee) {
			this.sumFee = sumFee;
	}
	/**
	 * 获取：总费用
	 */
	public BigDecimal getSumFee() {
			return sumFee;
	}
	/**
	 * 设置：材料费
	 */
	public void setMaterialsFee(BigDecimal materialsFee) {
			this.materialsFee = materialsFee;
	}
	/**
	 * 获取：材料费
	 */
	public BigDecimal getMaterialsFee() {
			return materialsFee;
	}
	/**
	 * 设置：t_cust_consumer表中的主键ID
	 */
	public void setConsumerId(Long consumerId) {
			this.consumerId = consumerId;
	}
	/**
	 * 获取：t_cust_consumer表中的主键ID
	 */
	public Long getConsumerId() {
			return consumerId;
	}
	/**
	 * 设置：医院id
	 */
	public void setHospitalId(Long hospitalId) {
			this.hospitalId = hospitalId;
	}
	/**
	 * 获取：医院id
	 */
	public Long getHospitalId() {
			return hospitalId;
	}
	/**
	 * 设置：店家ID
	 */
	public void setShopId(Long shopId) {
			this.shopId = shopId;
	}
	/**
	 * 获取：店家ID
	 */
	public Long getShopId() {
			return shopId;
	}
	/**
	 * 设置：业务员id
	 */
	public void setBussinessUserId(Long bussinessUserId) {
			this.bussinessUserId = bussinessUserId;
	}
	/**
	 * 获取：业务员id
	 */
	public Long getBussinessUserId() {
			return bussinessUserId;
	}
	/**
	 * 设置：
	 */
	public void setAttrUrl(String attrUrl) {
			this.attrUrl = attrUrl;
	}
	/**
	 * 获取：
	 */
	public String getAttrUrl() {
			return attrUrl;
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
	 * 设置：备注信息
	 */
	public void setRemark(String remark) {
			this.remark = remark;
	}
	/**
	 * 获取：备注信息
	 */
	public String getRemark() {
			return remark;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：更新人
	 */
	public Long getUpdateId() {
			return updateId;
	}
	/**
	 * 设置：状态：1有效；0无效
	 */
	public void setStatus(Integer status) {
			this.status = status;
	}
	/**
	 * 获取：状态：1有效；0无效
	 */
	public Integer getStatus() {
			return status;
	}
	/**
	 * 设置：审核状态 1未审核 2审核通过  3未通过
	 */
	public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
	}
	/**
	 * 获取：审核状态 1未审核 2审核通过  3未通过
	 */
	public Integer getAuditStatus() {
			return auditStatus;
	}
	/**
	 * 设置：不通过理由
	 */
	public void setAuditReason(String auditReason) {
			this.auditReason = auditReason;
	}
	/**
	 * 获取：不通过理由
	 */
	public String getAuditReason() {
			return auditReason;
	}
	/**
	 * 设置：创建者id
	 */
	public void setCreateId(Long createId) {
			this.createId = createId;
	}
	/**
	 * 获取：创建者id
	 */
	public Long getCreateId() {
			return createId;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}