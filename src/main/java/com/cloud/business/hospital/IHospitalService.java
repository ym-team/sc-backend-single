package com.cloud.business.hospital;


import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

import java.util.List;


/**
 * <p>
 * 医院表 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:29
 */
public interface IHospitalService {


    /**
     * 新增 医院表 信息
     *
     * @param hospitalBOS
     * @return int
     * @throws Exception
     */
    long save(HospitalBOS hospitalBOS) throws Exception;


    /**
     * 批量新增
     *
     * @param listHospitalBOS
     * @return int
     * @throws Exception
     */
    int saveList(List<HospitalBOS> listHospitalBOS) throws Exception;


    /**
     * 查询详情
     *
     * @param hospitalBOQ
     * @return HospitalVO
     * @throws Exception
     */
    HospitalVO queryDetail(HospitalBOQ hospitalBOQ) throws Exception;

    /**
     * 查询列表
     *
     * @param hospitalBOQ
     * @return List<HospitalVO>
     * @throws Exception
     */
    List<HospitalVO> queryList(HospitalBOQ hospitalBOQ) throws Exception;


    /**
     * 分页查询列表
     *
     * @param hospitalBOQP
     * @return PageQuery<HospitalVO>
     * @throws Exception
     */
    PageQuery<HospitalVO> queryListByPage(HospitalBOQP hospitalBOQP, PageInfo page) throws Exception;


    /**
     * 更新
     *
     * @param hospitalBOU
     * @return int
     * @throws Exception
     */
    int update(HospitalBOU hospitalBOU) throws Exception;


    /**
     * 批量更新
     *
     * @param listHospitalBOU
     * @return int
     * @throws Exception
     */
    int updateList(List<HospitalBOU> listHospitalBOU) throws Exception;


    /**
     * 物理删除
     *
     * @param hospitalBOD
     * @return int
     * @throws Exception
     */
    int delete(HospitalBOD hospitalBOD) throws Exception;

    /**
     * 根据入参条件查询 总数
     *
     * @param hospitalBOQ
     * @return Long
     * @throws Exception
     */
    Long queryCount(HospitalBOQ hospitalBOQ) throws Exception;
}
