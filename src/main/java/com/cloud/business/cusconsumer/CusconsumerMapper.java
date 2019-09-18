package com.cloud.business.cusconsumer;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 顾客信息
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Mapper
public interface CusconsumerMapper {

    /**
     * 新增 顾客信息 信息
     *
     * @param cusconsumerModel
     * @return int
     */
    int save(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);


    /**
     * 批量新增
     *
     * @param listCusconsumerModel
     * @return int
     */
    int saveList(@Param("listCusconsumerModel") List<CusconsumerModel> listCusconsumerModel);


    /**
     * 查询详情
     *
     * @param cusconsumerModel
     * @return CusconsumerModel
     */
    CusconsumerModel queryDetail(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);

    /**
     * 查询列表
     *
     * @param cusconsumerModel
     * @return List<CusconsumerModel>
     */
    List<CusconsumerModel> queryList(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);


    /**
     * 分页查询列表
     *
     * @param cusconsumerModel
     * @return Page<CusconsumerModel>
     */
    Page<CusconsumerModel> queryListByPage(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);


    /**
     * 更新
     *
     * @param cusconsumerModel
     * @return int
     */
    int update(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);


    /**
     * 批量更新
     *
     * @param listCusconsumerModel
     * @return int
     */
    int updateList(@Param("listCusconsumerModel") List<CusconsumerModel> listCusconsumerModel);


    /**
     * 物理删除
     *
     * @param cusconsumerModel
     * @return int
     */
    int delete(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);

    /**
     * 根据入参条件查询 总数
     *
     * @param cusconsumerModel
     */
    Long queryCount(@Param("cusconsumerModel") CusconsumerModel cusconsumerModel);
}