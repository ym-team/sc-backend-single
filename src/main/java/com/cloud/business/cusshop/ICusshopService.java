package com.cloud.business.cusshop;


import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

import java.util.List;


/**
 * <p>
 * 店面入驻 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:26
 */
public interface ICusshopService {

    /**
     * 新增 店面入驻 信息
     *
     * @param cusshopBOS
     * @return int
     * @throws Exception
     */
    long save(CusshopBOS cusshopBOS) throws Exception;

    /**
     * 批量新增
     *
     * @param listCusshopBOS
     * @return int
     * @throws Exception
     */
    int saveList(List<CusshopBOS> listCusshopBOS) throws Exception;

    /**
     * 查询详情
     *
     * @param cusshopBOQ
     * @return CusshopVO
     * @throws Exception
     */
    CusshopVO queryDetail(CusshopBOQ cusshopBOQ) throws Exception;

    /**
     * 查询列表
     *
     * @param cusshopBOQ
     * @return List<CusshopVO>
     * @throws Exception
     */
    List<CusshopVO> queryList(CusshopBOQ cusshopBOQ) throws Exception;


    /**
     * 分页查询列表
     *
     * @param cusshopBOQP
     * @return PageQuery<CusshopVO>
     * @throws Exception
     */
    PageQuery<CusshopVO> queryListByPage(CusshopBOQP cusshopBOQP, PageInfo page) throws Exception;


    /**
     * 更新
     *
     * @param cusshopBOU
     * @return int
     * @throws Exception
     */
    int update(CusshopBOU cusshopBOU) throws Exception;


    /**
     * 批量更新
     *
     * @param listCusshopBOU
     * @return int
     * @throws Exception
     */
    int updateList(List<CusshopBOU> listCusshopBOU) throws Exception;


    /**
     * 物理删除
     *
     * @param cusshopBOD
     * @return int
     * @throws Exception
     */
    int delete(CusshopBOD cusshopBOD) throws Exception;

    /**
     * 根据入参条件查询 总数
     *
     * @param cusshopBOQ
     * @return Long
     * @throws Exception
     */
    Long queryCount(CusshopBOQ cusshopBOQ) throws Exception;
}
