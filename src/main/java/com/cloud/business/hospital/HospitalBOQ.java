package com.cloud.business.hospital;


import com.cloud.util.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 医院表
 *
 * @author Michael
 * @date 2019-09-17 01:13:29
 */
@Getter
@Setter
public class HospitalBOQ extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

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
}