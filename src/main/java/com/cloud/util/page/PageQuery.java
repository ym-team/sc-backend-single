package com.cloud.util.page;

import com.github.pagehelper.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by minglu.zhao on 2018-1-5.
 */
@Data
@ApiModel(value = "PageQuery", description = "网关分页返回信息")
public class PageQuery<K> implements Serializable {

    private static final long serialVersionUID = -50150220882337914L;

    @ApiModelProperty(value = "总数", required = true)
    private long total = 0;

    @ApiModelProperty(value = "总页数", required = true)
    private int totalPage = 0;

    @ApiModelProperty(value = "每页条数", required = true)
    private int pageSize = 20;

    @ApiModelProperty(value = "当前页,第一页默认1", required = true)
    private int currPage = 1;

    @ApiModelProperty(value = "查询结果")
    private List<K> data = new ArrayList<>();

    @ApiModelProperty(value = "是否为第一页", required = true)
    private boolean isFirstPage = true;

    @ApiModelProperty(value = "是否为最后一页", required = true)
    private boolean isLastPage = true;

    public PageQuery() {
    }

    /**
     * 包装Page对象
     *
     * @param page
     */
    public <T> PageQuery(Page<T> page, Class<K> targetClass) {
        if (page == null) {
            return;
        }
        this.currPage = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.totalPage = page.getPages();
        this.total = page.getTotal();
        this.isFirstPage = (currPage == 0 || currPage == 1);
        this.isLastPage = (totalPage == 0 || currPage == totalPage);

        if (page.getResult() != null && page.getResult() != null && page.getResult().size() > 0) {
        	data = new ArrayList<>(page.getResult().size());
            for (T source : page.getResult()) {
                K target = null;
                if (source == null) {
                    continue;
                }
                try {
                    target = targetClass.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BeanUtils.copyProperties(source, target);
                if (target != null) {
                	data.add(target);
                }
            }
        }
    }
}
