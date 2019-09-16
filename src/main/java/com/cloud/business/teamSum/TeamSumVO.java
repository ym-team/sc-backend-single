package com.cloud.business.teamSum;


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
public class TeamSumVO implements Serializable{


	private static final long serialVersionUID=1L;

	/***/
    private Long id;
	/***/
    private Long teamId;
	/***/
    private Date createTime;
	/**团队金额*/
    private BigDecimal teamSumFee;
	/**备注信息*/
    private String remark;
	/**当前月份*/
    private Integer yearsMonth;
	
	
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
	 * 设置：团队金额
	 */
	public void setTeamSumFee(BigDecimal teamSumFee) {
			this.teamSumFee = teamSumFee;
	}
	/**
	 * 获取：团队金额
	 */
	public BigDecimal getTeamSumFee() {
			return teamSumFee;
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
	 * 设置：当前月份
	 */
	public void setYearsMonth(Integer yearsMonth) {
			this.yearsMonth = yearsMonth;
	}
	/**
	 * 获取：当前月份
	 */
	public Integer getYearsMonth() {
			return yearsMonth;
	}
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}