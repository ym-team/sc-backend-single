package com.cloud.business.cusconsumer;


import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

import java.util.List;


/**
 * <p>
 * 顾客信息 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:26
 */
public interface ICusconsumerService {
    /**
     * 新增 顾客信息 信息
     *
     * @param cusconsumerBOS
     * @return int
     * @throws Exception
     */
    long save(CusconsumerBOS cusconsumerBOS) throws Exception;

    /**
     * 批量新增
     *
     * @param listCusconsumerBOS
     * @return int
     * @throws Exception
     */
    int saveList(List<CusconsumerBOS> listCusconsumerBOS) throws Exception;

    /**
     * 查询详情
     *
     * @param cusconsumerBOQ
     * @return CusconsumerVO
     * @throws Exception
     */
    CusconsumerVO queryDetail(CusconsumerBOQ cusconsumerBOQ) throws Exception;

    /**
     * 查询列表
     *
     * @param cusconsumerBOQ
     * @return List<CusconsumerVO>
     * @throws Exception
     */
    List<CusconsumerVO> queryList(CusconsumerBOQ cusconsumerBOQ) throws Exception;


    /**
     * 分页查询列表
     *
     * @param cusconsumerBOQP
     * @return PageQuery<CusconsumerVO>
     * @throws Exception
     */
    PageQuery<CusconsumerVO> queryListByPage(CusconsumerBOQP cusconsumerBOQP, PageInfo page) throws Exception;


    /**
     * 更新
     *
     * @param cusconsumerBOU
     * @return int
     * @throws Exception
     */
    int update(CusconsumerBOU cusconsumerBOU) throws Exception;


    /**
     * 批量更新
     *
     * @param listCusconsumerBOU
     * @return int
     * @throws Exception
     */
    int updateList(List<CusconsumerBOU> listCusconsumerBOU) throws Exception;


    /**
     * 物理删除
     *
     * @param cusconsumerBOD
     * @return int
     * @throws Exception
     */
    int delete(CusconsumerBOD cusconsumerBOD) throws Exception;

    /**
     * 根据入参条件查询 总数
     *
     * @param cusconsumerBOQ
     * @return Long
     * @throws Exception
     */
    Long queryCount(CusconsumerBOQ cusconsumerBOQ) throws Exception;
}
