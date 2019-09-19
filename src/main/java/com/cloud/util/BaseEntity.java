package com.cloud.util;


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
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    /**
     * 创建人Id
     */
    private Long createId;
    /**
     * 创建人名称
     */
    private String createName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人Id
     */
    private Long updateId;
    /**
     * 更新人名称
     */
    private String updateName;
    /**
     * 更新时间
     */
    private Date updateTime;
}