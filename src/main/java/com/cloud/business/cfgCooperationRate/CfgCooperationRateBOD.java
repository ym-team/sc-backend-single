package com.cloud.business.cfgCooperationRate;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 合作方提成表
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
public class CfgCooperationRateBOD implements Serializable{


	private static final long serialVersionUID=1L;

	/***/
    private Long id;
	/**合作者用户ID 如医院id 店面id*/
    private Long amortizationId;
	/***/
    private Long status;
	/**医院提成比例*/
    private Double rate;
	/**提成类型 1医院 2店面*/
    private Integer type;
	/**创建时间*/
    private Date createTime;
	/***/
    private Date updateTime;
	/**备注信息*/
    private String remark;
	/**更新者*/
    private Long updateId;
	/**创建者*/
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
	 * 设置：合作者用户ID 如医院id 店面id
	 */
	public void setAmortizationId(Long amortizationId) {
			this.amortizationId = amortizationId;
	}
	/**
	 * 获取：合作者用户ID 如医院id 店面id
	 */
	public Long getAmortizationId() {
			return amortizationId;
	}
	/**
	 * 设置：
	 */
	public void setStatus(Long status) {
			this.status = status;
	}
	/**
	 * 获取：
	 */
	public Long getStatus() {
			return status;
	}
	/**
	 * 设置：医院提成比例
	 */
	public void setRate(Double rate) {
			this.rate = rate;
	}
	/**
	 * 获取：医院提成比例
	 */
	public Double getRate() {
			return rate;
	}
	/**
	 * 设置：提成类型 1医院 2店面
	 */
	public void setType(Integer type) {
			this.type = type;
	}
	/**
	 * 获取：提成类型 1医院 2店面
	 */
	public Integer getType() {
			return type;
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
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
	}
	/**
	 * 获取：
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
	 * 设置：更新者
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：更新者
	 */
	public Long getUpdateId() {
			return updateId;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateId(Long createId) {
			this.createId = createId;
	}
	/**
	 * 获取：创建者
	 */
	public Long getCreateId() {
			return createId;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}