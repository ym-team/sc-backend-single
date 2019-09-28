package com.cloud.business.categoryIndex;


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
public class CategoryIndexBOU implements Serializable{


	private static final long serialVersionUID=1L;

	/***/
    private Long id;
	/***/
    private Long categoryId;
	/**图片地址*/
    private String picUrl;
	/**状态1有效；0无效*/
    private Integer status;
	/**备注信息*/
    private String remark;
	/**描述*/
    private String descriptor;
	/**创建时间*/
    private Date createTime;
	/**更新时间*/
    private Date updateTime;
	/**创建用户id*/
    private Long createId;
	/**是否展示前端页面1展示；0不展示*/
    private Integer isShow;
	/**前端页面排序*/
    private Integer isSort;
	/**更新人*/
    private Long updateId;
	
	
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
	public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
	}
	/**
	 * 获取：
	 */
	public Long getCategoryId() {
			return categoryId;
	}
	/**
	 * 设置：图片地址
	 */
	public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
	}
	/**
	 * 获取：图片地址
	 */
	public String getPicUrl() {
			return picUrl;
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
	 * 设置：描述
	 */
	public void setDescriptor(String descriptor) {
			this.descriptor = descriptor;
	}
	/**
	 * 获取：描述
	 */
	public String getDescriptor() {
			return descriptor;
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
	 * 设置：创建用户id
	 */
	public void setCreateId(Long createId) {
			this.createId = createId;
	}
	/**
	 * 获取：创建用户id
	 */
	public Long getCreateId() {
			return createId;
	}
	/**
	 * 设置：是否展示前端页面1展示；0不展示
	 */
	public void setIsShow(Integer isShow) {
			this.isShow = isShow;
	}
	/**
	 * 获取：是否展示前端页面1展示；0不展示
	 */
	public Integer getIsShow() {
			return isShow;
	}
	/**
	 * 设置：前端页面排序
	 */
	public void setIsSort(Integer isSort) {
			this.isSort = isSort;
	}
	/**
	 * 获取：前端页面排序
	 */
	public Integer getIsSort() {
			return isSort;
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