package com.cloud.business.bussinessSum;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:24
 */
public class BussinessSumModel implements Serializable{


	private static final long serialVersionUID=1L;

	/***/
    private Long id;
	/**业务员id*/
    private Long bussinessUserId;
	/***/
    private Long teamId;
	/**业务员月统计金额*/
    private BigDecimal totalAmt;
	/***/
    private Date createTime;
	/***/
    private Date updateTime;
	/**创建者*/
    private Long createId;
	/***/
    private Long updateId;
	/**备注信息*/
    private String remark;
	
	
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
	public void setTeamId(Long teamId) {
			this.teamId = teamId;
	}
	/**
	 * 获取：
	 */
	public Long getTeamId() {
			return teamId;
	}
	/**
	 * 设置：业务员月统计金额
	 */
	public void setTotalAmt(BigDecimal totalAmt) {
			this.totalAmt = totalAmt;
	}
	/**
	 * 获取：业务员月统计金额
	 */
	public BigDecimal getTotalAmt() {
			return totalAmt;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
			this.createTime = createTime;
	}
	/**
	 * 获取：
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
	 * 设置：
	 */
	public void setUpdateId(Long updateId) {
			this.updateId = updateId;
	}
	/**
	 * 获取：
	 */
	public Long getUpdateId() {
			return updateId;
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
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}