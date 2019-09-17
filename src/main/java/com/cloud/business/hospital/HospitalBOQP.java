package com.cloud.business.hospital;


import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Date;

/**
 * 医院表
 *
 * @author Michael
 * @date 2019-09-17 01:13:29
 */
public class HospitalBOQP implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 医院名称
     */
    private String name;
    /**
     * 医院地址
     */
    private String address;
    /**
     * logo
     */
    private String logo;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 医院介绍
     */
    private String remark;
    /**
     * 联系人
     */
    private String contactor;
    /**
     * 更新者id
     */
    private Long updateId;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建者Id
     */
    private Long createId;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 获取：主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：医院名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：医院名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：医院地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置：医院地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置：logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取：手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置：手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：医院介绍
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：医院介绍
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：联系人
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * 设置：联系人
     */
    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    /**
     * 获取：更新者id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置：更新者id
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 获取：更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：创建者Id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置：创建者Id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //JSON
    public String toString() {
        return JSON.toJSONString(this);

    }


}