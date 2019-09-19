package com.cloud.business.cusshop;


import com.alibaba.fastjson.JSON;
import com.cloud.util.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 店面入驻
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Getter
@Setter
public class CusshopBOS extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 店面名称
     */
    private String shopName;
    /**
     * 地址
     */
    private String shopAddress;
    /**
     * 店面描述
     */
    private String shopDesc;
    /**
     * 店面负责人名称
     */
    private String shopUserName;
    /**
     * 手机电话
     */
    private String shopPhone;
    /**
     * 身份证
     */
    private String shopIdCard;
    /**
     * 1 已签约  2 未签约  3 作废
     */
    private Integer shopXieyiStatus;
    /**
     * 业务员id t_user
     */
    private Long bussinessUserId;
    /**
     * 店家用户id t_user
     */
    private Long userId;
    /**
     * 1 正常  2 不正常
     */
    private Integer shopStatus;
    /**
     * 备注
     */
    private String remark;
}