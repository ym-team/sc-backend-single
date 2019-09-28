package com.cloud.business.category;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 
 *
 * @author oymw
 * @date 2019-09-28 10:58:31
 */
public class CategoryBOQP implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键id*/
    private Long id;
	/**创建者用户id*/
    private Long createId;
	/**类别名称*/
    private String categoryName;
	/**状态1有效；0无效*/
    private Integer status;
	/**备注描述*/
    private String remark;
	/**创建时间*/
    private Date createTime;
	/**更新时间*/
    private Date updateTime;
	/**更新人*/
    private Long updateId;
	
	
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
	 * 设置：创建者用户id
	 */
	public void setCreateId(Long createId) {
			this.createId = createId;
	}
	/**
	 * 获取：创建者用户id
	 */
	public Long getCreateId() {
			return createId;
	}
	/**
	 * 设置：类别名称
	 */
	public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
	}
	/**
	 * 获取：类别名称
	 */
	public String getCategoryName() {
			return categoryName;
	}
	/**
	 * 设置：状态1有效；0无效
	 */
	public void setStatus(Integer status) {
			this.status = status;
	}
	/**
	 * 获取：状态1有效；0无效
	 */
	public Integer getStatus() {
			return status;
	}
	/**
	 * 设置：备注描述
	 */
	public void setRemark(String remark) {
			this.remark = remark;
	}
	/**
	 * 获取：备注描述
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
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}