package com.cloud.business.user;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 用户表
 *
 * @author Michael
 * @date 2019-09-17 01:13:27
 */
public class UserVO implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键ID*/
    private Long id;
	/**手机号码*/
    private String phone;
	/**密码*/
    private String password;
	/**用户类型( 1：业务员  2：店家 3：消费者 )*/
    private Integer type;
	/**用户状态( 1：有效  2：失效 )*/
    private Integer status;
	/**邀请码*/
    private String inviteCode;
	/**邀请用户Id*/
    private Long parentId;
	/**创建时间*/
    private Date createTime;
	/**创建者Id*/
    private Long updateId;
	/**更新时间*/
    private Date updateTime;
	
	
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
	 * 设置：密码
	 */
	public void setPassword(String password) {
			this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
			return password;
	}
	/**
	 * 设置：用户类型( 1：业务员  2：店家 3：消费者 )
	 */
	public void setType(Integer type) {
			this.type = type;
	}
	/**
	 * 获取：用户类型( 1：业务员  2：店家 3：消费者 )
	 */
	public Integer getType() {
			return type;
	}
	/**
	 * 设置：用户状态( 1：有效  2：失效 )
	 */
	public void setStatus(Integer status) {
			this.status = status;
	}
	/**
	 * 获取：用户状态( 1：有效  2：失效 )
	 */
	public Integer getStatus() {
			return status;
	}
	/**
	 * 设置：邀请码
	 */
	public void setInviteCode(String inviteCode) {
			this.inviteCode = inviteCode;
	}
	/**
	 * 获取：邀请码
	 */
	public String getInviteCode() {
			return inviteCode;
	}
	/**
	 * 设置：邀请用户Id
	 */
	public void setParentId(Long parentId) {
			this.parentId = parentId;
	}
	/**
	 * 获取：邀请用户Id
	 */
	public Long getParentId() {
			return parentId;
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
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}