package com.cloud.business.team;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
public class TeamBOQ implements Serializable{


	private static final long serialVersionUID=1L;

	/**team主键id*/
    private Long id;
	/**用户表id*/
    private Long userId;
	/***/
    private Long parentId;
	/***/
    private Date createTime;
	/***/
    private Date updateTime;
	/**备注*/
    private String remark;
	
	
	/**
	 * 设置：team主键id
	 */
	public void setId(Long id) {
			this.id = id;
	}
	/**
	 * 获取：team主键id
	 */
	public Long getId() {
			return id;
	}
	/**
	 * 设置：用户表id
	 */
	public void setUserId(Long userId) {
			this.userId = userId;
	}
	/**
	 * 获取：用户表id
	 */
	public Long getUserId() {
			return userId;
	}
	/**
	 * 设置：
	 */
	public void setParentId(Long parentId) {
			this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public Long getParentId() {
			return parentId;
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
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}