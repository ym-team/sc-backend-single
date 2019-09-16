package com.cloud.business.cusconsumer;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * 顾客信息
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
public class CusconsumerVO implements Serializable{


	private static final long serialVersionUID=1L;

	/**主键id*/
    private Long id;
	/**顾客姓名*/
    private String consuName;
	/**电话*/
    private String consuPhone;
	/**店家id*/
    private Long shopId;
	/**客户年龄*/
    private Integer consuAge;
	/**确定项目*/
    private String consuConfirmItem;
	/**意向项目*/
    private String consuWanttoItem;
	/**享受政策*/
    private String enjoyPolicy;
	/**服务顾问*/
    private String serviceConsult;
	/**顾客分析*/
    private String consuAnaylise;
	/**顾客工作*/
    private String consuWork;
	/**顾客性格*/
    private String consuCharacter;
	/**顾客年收入*/
    private String consuIncome;
	/**顾客消费价值观*/
    private String consuValue;
	/**铺垫次数*/
    private String consuPreCount;
	/**最大的抗拒点*/
    private String consuMaxReject;
	/**业务员id*/
    private Long bussinessUserId;
	/**1 正常  2 不正常*/
    private Integer consuStatus;
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
	 * 设置：顾客姓名
	 */
	public void setConsuName(String consuName) {
			this.consuName = consuName;
	}
	/**
	 * 获取：顾客姓名
	 */
	public String getConsuName() {
			return consuName;
	}
	/**
	 * 设置：电话
	 */
	public void setConsuPhone(String consuPhone) {
			this.consuPhone = consuPhone;
	}
	/**
	 * 获取：电话
	 */
	public String getConsuPhone() {
			return consuPhone;
	}
	/**
	 * 设置：店家id
	 */
	public void setShopId(Long shopId) {
			this.shopId = shopId;
	}
	/**
	 * 获取：店家id
	 */
	public Long getShopId() {
			return shopId;
	}
	/**
	 * 设置：客户年龄
	 */
	public void setConsuAge(Integer consuAge) {
			this.consuAge = consuAge;
	}
	/**
	 * 获取：客户年龄
	 */
	public Integer getConsuAge() {
			return consuAge;
	}
	/**
	 * 设置：确定项目
	 */
	public void setConsuConfirmItem(String consuConfirmItem) {
			this.consuConfirmItem = consuConfirmItem;
	}
	/**
	 * 获取：确定项目
	 */
	public String getConsuConfirmItem() {
			return consuConfirmItem;
	}
	/**
	 * 设置：意向项目
	 */
	public void setConsuWanttoItem(String consuWanttoItem) {
			this.consuWanttoItem = consuWanttoItem;
	}
	/**
	 * 获取：意向项目
	 */
	public String getConsuWanttoItem() {
			return consuWanttoItem;
	}
	/**
	 * 设置：享受政策
	 */
	public void setEnjoyPolicy(String enjoyPolicy) {
			this.enjoyPolicy = enjoyPolicy;
	}
	/**
	 * 获取：享受政策
	 */
	public String getEnjoyPolicy() {
			return enjoyPolicy;
	}
	/**
	 * 设置：服务顾问
	 */
	public void setServiceConsult(String serviceConsult) {
			this.serviceConsult = serviceConsult;
	}
	/**
	 * 获取：服务顾问
	 */
	public String getServiceConsult() {
			return serviceConsult;
	}
	/**
	 * 设置：顾客分析
	 */
	public void setConsuAnaylise(String consuAnaylise) {
			this.consuAnaylise = consuAnaylise;
	}
	/**
	 * 获取：顾客分析
	 */
	public String getConsuAnaylise() {
			return consuAnaylise;
	}
	/**
	 * 设置：顾客工作
	 */
	public void setConsuWork(String consuWork) {
			this.consuWork = consuWork;
	}
	/**
	 * 获取：顾客工作
	 */
	public String getConsuWork() {
			return consuWork;
	}
	/**
	 * 设置：顾客性格
	 */
	public void setConsuCharacter(String consuCharacter) {
			this.consuCharacter = consuCharacter;
	}
	/**
	 * 获取：顾客性格
	 */
	public String getConsuCharacter() {
			return consuCharacter;
	}
	/**
	 * 设置：顾客年收入
	 */
	public void setConsuIncome(String consuIncome) {
			this.consuIncome = consuIncome;
	}
	/**
	 * 获取：顾客年收入
	 */
	public String getConsuIncome() {
			return consuIncome;
	}
	/**
	 * 设置：顾客消费价值观
	 */
	public void setConsuValue(String consuValue) {
			this.consuValue = consuValue;
	}
	/**
	 * 获取：顾客消费价值观
	 */
	public String getConsuValue() {
			return consuValue;
	}
	/**
	 * 设置：铺垫次数
	 */
	public void setConsuPreCount(String consuPreCount) {
			this.consuPreCount = consuPreCount;
	}
	/**
	 * 获取：铺垫次数
	 */
	public String getConsuPreCount() {
			return consuPreCount;
	}
	/**
	 * 设置：最大的抗拒点
	 */
	public void setConsuMaxReject(String consuMaxReject) {
			this.consuMaxReject = consuMaxReject;
	}
	/**
	 * 获取：最大的抗拒点
	 */
	public String getConsuMaxReject() {
			return consuMaxReject;
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
	 * 设置：1 正常  2 不正常
	 */
	public void setConsuStatus(Integer consuStatus) {
			this.consuStatus = consuStatus;
	}
	/**
	 * 获取：1 正常  2 不正常
	 */
	public Integer getConsuStatus() {
			return consuStatus;
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