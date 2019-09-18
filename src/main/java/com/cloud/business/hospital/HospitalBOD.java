package com.cloud.business.hospital;


import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 医院表
 *
 * @author Michael
 * @date 2019-09-17 01:13:29
 */
@Getter
@Setter
public class HospitalBOD implements Serializable {
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

    //JSON
    public String toString() {
        return JSON.toJSONString(this);

    }
}