package com.cloud.business.cusshop;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 店面入驻
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Mapper
public interface CusshopMapper {

    /**
     * 新增 店面入驻 信息
     *
     * @param cusshopModel
     * @return int
     * @throws Exception
     */
    int save(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 批量新增
     *
     * @param listCusshopModel
     * @return int
     * @throws Exception
     */
    int saveList(@Param("listCusshopModel") List<CusshopModel> listCusshopModel);

    /**
     * 查询详情
     *
     * @param cusshopModel
     * @return CusshopModel
     * @throws Exception
     */
    CusshopModel queryDetail(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 查询列表
     *
     * @param cusshopModel
     * @return List<CusshopModel>
     * @throws Exception
     */
    List<CusshopModel> queryList(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 分页查询列表
     *
     * @param cusshopModel
     * @return Page<CusshopModel>
     * @throws Exception
     */
    Page<CusshopModel> queryListByPage(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 更新
     *
     * @param cusshopModel
     * @return int
     * @throws Exception
     */
    int update(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 批量更新
     *
     * @param listCusshopModel
     * @return int
     * @throws Exception
     */
    int updateList(@Param("listCusshopModel") List<CusshopModel> listCusshopModel);

    /**
     * 物理删除
     *
     * @param cusshopModel
     * @return int
     * @throws Exception
     */
    int delete(@Param("cusshopModel") CusshopModel cusshopModel);

    /**
     * 根据入参条件查询 总数
     *
     * @param cusshopModel
     * @throws Exception
     */
    Long queryCount(@Param("cusshopModel") CusshopModel cusshopModel);
}