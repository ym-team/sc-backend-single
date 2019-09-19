package com.cloud.business.hospitalDoctor;


import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

import java.util.List;


/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:28
 */
public interface IHospitalDoctorService {

    /**
     * 新增  信息
     *
     * @param hospitalDoctorBOS
     * @return int
     * @throws Exception
     */
    long save(HospitalDoctorBOS hospitalDoctorBOS) throws Exception;

    /**
     * 批量新增
     *
     * @param listHospitalDoctorBOS
     * @return int
     * @throws Exception
     */
    int saveList(List<HospitalDoctorBOS> listHospitalDoctorBOS) throws Exception;

    /**
     * 查询详情
     *
     * @param hospitalDoctorBOQ
     * @return HospitalDoctorVO
     * @throws Exception
     */
    HospitalDoctorVO queryDetail(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;

    /**
     * 查询列表
     *
     * @param hospitalDoctorBOQ
     * @return List<HospitalDoctorVO>
     * @throws Exception
     */
    List<HospitalDoctorVO> queryList(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;


    /**
     * 分页查询列表
     *
     * @param hospitalDoctorBOQP
     * @return PageQuery<HospitalDoctorVO>
     * @throws Exception
     */
    PageQuery<HospitalDoctorVO> queryListByPage(HospitalDoctorBOQP hospitalDoctorBOQP, PageInfo page) throws Exception;

    /**
     * 更新
     *
     * @param hospitalDoctorBOU
     * @return int
     * @throws Exception
     */
    int update(HospitalDoctorBOU hospitalDoctorBOU) throws Exception;

    /**
     * 批量更新
     *
     * @param listHospitalDoctorBOU
     * @return int
     * @throws Exception
     */
    int updateList(List<HospitalDoctorBOU> listHospitalDoctorBOU) throws Exception;

    /**
     * 物理删除
     *
     * @param hospitalDoctorBOD
     * @return int
     * @throws Exception
     */
    int delete(HospitalDoctorBOD hospitalDoctorBOD) throws Exception;

    /**
     * 根据入参条件查询 总数
     *
     * @param hospitalDoctorBOQ
     * @return Long
     * @throws Exception
     */
    Long queryCount(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;
}
