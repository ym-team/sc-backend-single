package com.cloud.business.cusconsumer;


import com.cloud.util.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 顾客信息
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Getter
@Setter
public class CusconsumerBOU extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 顾客姓名
     */
    private String consuName;
    /**
     * 电话
     */
    private String consuPhone;
    /**
     * 店家id
     */
    private Long shopId;
    /**
     * 客户年龄
     */
    private Integer consuAge;
    /**
     * 确定项目
     */
    private String consuConfirmItem;
    /**
     * 意向项目
     */
    private String consuWanttoItem;
    /**
     * 享受政策
     */
    private String enjoyPolicy;
    /**
     * 服务顾问
     */
    private String serviceConsult;
    /**
     * 顾客分析
     */
    private String consuAnaylise;
    /**
     * 顾客工作
     */
    private String consuWork;
    /**
     * 顾客性格
     */
    private String consuCharacter;
    /**
     * 顾客年收入
     */
    private String consuIncome;
    /**
     * 顾客消费价值观
     */
    private String consuValue;
    /**
     * 铺垫次数
     */
    private String consuPreCount;
    /**
     * 最大的抗拒点
     */
    private String consuMaxReject;
    /**
     * 业务员id
     */
    private Long bussinessUserId;
    /**
     * 1 正常  2 不正常
     */
    private Integer consuStatus;
    /**
     * 备注
     */
    private String remark;
}