package com.cloud.business.cusshop;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 店面入驻
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
public class CusshopVO implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键id*/
    private Long id;
	/**店面名称*/
    private String shopName;
	/**地址*/
    private String shopAddress;
	/**店面描述*/
    private String shopDesc;
	/**店面负责人名称*/
    private String shopUserName;
	/**手机电话*/
    private String shopPhone;
	/**身份证*/
    private String shopIdCard;
	/**1 已签约  2 未签约  3 作废*/
    private Integer shopXieyiStatus;
	/**业务员id t_user*/
    private Long bussinessUserId;
	/**店家用户id t_user*/
    private Long userId;
	/**1 正常  2 不正常*/
    private Integer shopStatus;
	/**备注*/
    private String remark;
	/**更新时间*/
    private Date updateTime;
	/**创建时间*/
    private Date createTime;
	/**创建者*/
    private Long createId;
	/**更新者*/
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
	 * 设置：店面名称
	 */
	public void setShopName(String shopName) {
			this.shopName = shopName;
	}
	/**
	 * 获取：店面名称
	 */
	public String getShopName() {
			return shopName;
	}
	/**
	 * 设置：地址
	 */
	public void setShopAddress(String shopAddress) {
			this.shopAddress = shopAddress;
	}
	/**
	 * 获取：地址
	 */
	public String getShopAddress() {
			return shopAddress;
	}
	/**
	 * 设置：店面描述
	 */
	public void setShopDesc(String shopDesc) {
			this.shopDesc = shopDesc;
	}
	/**
	 * 获取：店面描述
	 */
	public String getShopDesc() {
			return shopDesc;
	}
	/**
	 * 设置：店面负责人名称
	 */
	public void setShopUserName(String shopUserName) {
			this.shopUserName = shopUserName;
	}
	/**
	 * 获取：店面负责人名称
	 */
	public String getShopUserName() {
			return shopUserName;
	}
	/**
	 * 设置：手机电话
	 */
	public void setShopPhone(String shopPhone) {
			this.shopPhone = shopPhone;
	}
	/**
	 * 获取：手机电话
	 */
	public String getShopPhone() {
			return shopPhone;
	}
	/**
	 * 设置：身份证
	 */
	public void setShopIdCard(String shopIdCard) {
			this.shopIdCard = shopIdCard;
	}
	/**
	 * 获取：身份证
	 */
	public String getShopIdCard() {
			return shopIdCard;
	}
	/**
	 * 设置：1 已签约  2 未签约  3 作废
	 */
	public void setShopXieyiStatus(Integer shopXieyiStatus) {
			this.shopXieyiStatus = shopXieyiStatus;
	}
	/**
	 * 获取：1 已签约  2 未签约  3 作废
	 */
	public Integer getShopXieyiStatus() {
			return shopXieyiStatus;
	}
	/**
	 * 设置：业务员id t_user
	 */
	public void setBussinessUserId(Long bussinessUserId) {
			this.bussinessUserId = bussinessUserId;
	}
	/**
	 * 获取：业务员id t_user
	 */
	public Long getBussinessUserId() {
			return bussinessUserId;
	}
	/**
	 * 设置：店家用户id t_user
	 */
	public void setUserId(Long userId) {
			this.userId = userId;
	}
	/**
	 * 获取：店家用户id t_user
	 */
	public Long getUserId() {
			return userId;
	}
	/**
	 * 设置：1 正常  2 不正常
	 */
	public void setShopStatus(Integer shopStatus) {
			this.shopStatus = shopStatus;
	}
	/**
	 * 获取：1 正常  2 不正常
	 */
	public Integer getShopStatus() {
			return shopStatus;
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
	
  	//JSON 
   	public String toString() {
   		return JSON.toJSONString(this);

   	}
 
	
}