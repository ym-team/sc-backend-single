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
     * @param HospitalDoctorBOS
     * @return int
     * @throws Exception
     */
    public long save(HospitalDoctorBOS hospitalDoctorBOS) throws Exception;


    /**
     * 批量新增
     *
     * @param List<HospitalDoctorBOS>
     * @return int
     * @throws Exception
     */
    public int saveList(List<HospitalDoctorBOS> listHospitalDoctorBOS) throws Exception;


    /**
     * 查询详情
     *
     * @param HospitalDoctorBOQ
     * @return HospitalDoctorVO
     * @throws Exception
     */
    public HospitalDoctorVO queryDetail(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;

    /**
     * 查询列表
     *
     * @param HospitalDoctorBOQ
     * @return List<HospitalDoctorVO>
     * @throws Exception
     */
    public List<HospitalDoctorVO> queryList(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;


    /**
     * 分页查询列表
     *
     * @param HospitalDoctorBOQP
     * @return PageQuery<HospitalDoctorVO>
     * @throws Exception
     */
    public PageQuery<HospitalDoctorVO> queryListByPage(HospitalDoctorBOQP hospitalDoctorBOQP, PageInfo page) throws Exception;


    /**
     * 更新
     *
     * @param HospitalDoctorBOU
     * @return int
     * @throws Exception
     */
    public int update(HospitalDoctorBOU hospitalDoctorBOU) throws Exception;


    /**
     * 批量更新
     *
     * @param List<HospitalDoctorBOU>
     * @return int
     * @throws Exception
     */
    public int updateList(List<HospitalDoctorBOU> listHospitalDoctorBOU) throws Exception;


    /**
     * 物理删除
     *
     * @param HospitalDoctorBOD
     * @return int
     * @throws Exception
     */
    public int delete(HospitalDoctorBOD hospitalDoctorBOD) throws Exception;

    /**
     * 根据入参条件查询 总数
     *
     * @param HospitalDoctorBOQ
     * @return Long
     * @throws Exception
     */
    public Long queryCount(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception;


}
