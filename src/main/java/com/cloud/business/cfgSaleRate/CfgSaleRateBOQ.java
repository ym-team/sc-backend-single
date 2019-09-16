package com.cloud.business.cfgSaleRate;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 业务员/团队提成配置表
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
public class CfgSaleRateBOQ implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键id*/
    private Long id;
	/**月销售总额开始*/
    private BigDecimal monSaleTotalAmtBegin;
	/**月销售总额结束*/
    private BigDecimal monSaleTotalAmtEnd;
	/**提成比例*/
    private Double rate;
	/**创建时间*/
    private Date createTime;
	/**修改时间*/
    private Date updateTime;
	/**创建者*/
    private Long createId;
	/**修改者id*/
    private Long updateId;
	/**类型 1个人；2团队*/
    private Long type;
	/**备注信息*/
    private String remark;
	/**是否有效 1有效；0无效*/
    private Integer status;
	
	
	/**
	 * 设置：主键id
	 */
	public void setId(Long id) {
			this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public Long getId() {
			return id;
	}
	/**
	 * 设置：月销售总额开始
	 */
	public void setMonSaleTotalAmtBegin(BigDecimal monSaleTotalAmtBegin) {
			this.monSaleTotalAmtBegin = monSaleTotalAmtBegin;
	}
	/**
	 * 获取：月销售总额开始
	 */
	public BigDecimal getMonSaleTotalAmtBegin() {
			return monSaleTotalAmtBegin;
	}
	/**
	 * 设置：月销售总额结束
	 */
	public void setMonSaleTotalAmtEnd(BigDecimal monSaleTotalAmtEnd) {
			this.monSaleTotalAmtEnd = monSaleTotalAmtEnd;
	}
	/**
	 * 获取：月销售总额结束
	 */
	public BigDecimal getMonSaleTotalAmtEnd() {
			return monSaleTotalAmtEnd;
	}
	/**
	 * 设置：提成比例
	 */
	public void setRate(Double rate) {
			this.rate = rate;
	}
	/**
	 * 获取：提成比例
	 */
	public Double getRate() {
			return rate;
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
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
			return updateTime;
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
	/**
	 * 设置：修改者id
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：修改者id
	 */
	public Long getUpdateId() {
			return updateId;
	}
	/**
	 * 设置：类型 1个人；2团队
	 */
	public void setType(Long type) {
			this.type = type;
	}
	/**
	 * 获取：类型 1个人；2团队
	 */
	public Long getType() {
			return type;
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
	 * 设置：是否有效 1有效；0无效
	 */
	public void setStatus(Integer status) {
			this.status = status;
	}
	/**
	 * 获取：是否有效 1有效；0无效
	 */
	public Integer getStatus() {
			return status;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}