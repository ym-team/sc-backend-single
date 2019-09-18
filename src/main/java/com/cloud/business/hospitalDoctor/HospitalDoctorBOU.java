package com.cloud.business.hospitalDoctor;


import com.alibaba.fastjson.JSON;
import com.cloud.util.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Michael
 * @date 2019-09-17 01:13:28
 */
@Getter
@Setter
public class HospitalDoctorBOU extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 医生名称
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 医院Id
     */
    private Long hospitalId;
    /**
     * 备注
     */
    private String remark;
}