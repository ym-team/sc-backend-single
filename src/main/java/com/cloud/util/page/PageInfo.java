package com.cloud.util.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by minglu.zhao on 2018-1-5.
 */
@Data
@ApiModel(value = "PageInfo", description = "网关分页查询信息")
public class PageInfo implements Serializable {

    private static final long serialVersionUID = 1868812352562982645L;

    @ApiModelProperty(value = "排序降序", hidden = true)
    public static final String ORDER_TYPE_DESC = "desc";

    @ApiModelProperty(value = "排序升序", hidden = true)
    public static final String ORDER_TYPE_ASC = "asc";
    
    private int start = 0;
    private int length = 10;

    @ApiModelProperty(value = "当前页,第一页默认1", required = true, dataType = "int")
    private int currPage = 1;

    @ApiModelProperty(value = "每页的数量", required = true, dataType = "int")
    private int pageSize = 10;

    @ApiModelProperty(value = "排序字段【,】分隔", allowEmptyValue = true, dataType = "String")
    private String orderField = "";

    @ApiModelProperty(value = "默认降序", allowEmptyValue = true, dataType = "String")
    private String orderType = ORDER_TYPE_DESC;

    @ApiModelProperty(value = "排序拼接", hidden = true)
    private String orderby = "";

    public String getOrderby() {
   /*     if (StringUtils.isNotBlank(orderField) && StringUtils.isNotBlank(orderType)) {
            return orderField + " " + orderType;
        }*/
        
        if(!"".equals(orderField) && null != orderField && !"".equals(orderType)&&null != orderType){
        	return orderField + " " + orderType;
        }
        return "";
    }

    public int getCurrPage() {
/*        if (currPage == 0) {
            return 1;
        }*/
    	if(start == 0){
    		return 1;
    	}else{
    		currPage = (this.start / this.pageSize) + 1;
    	}
        return currPage;
    }

    public int getPageSize() {
        if (pageSize == 0) {
            return 20;
        }
        return pageSize;
    }
}
