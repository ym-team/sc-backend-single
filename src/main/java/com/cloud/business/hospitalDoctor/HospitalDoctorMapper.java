package com.cloud.business.hospitalDoctor;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Michael
 * @date 2019-09-17 01:13:28
 */
@Mapper
public interface HospitalDoctorMapper {

    /**
     * 新增  信息
     *
     * @param HospitalDoctorModel
     * @return int
     * @throws Exception
     */
    public int save(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 批量新增
     *
     * @param List<HospitalDoctorModel>
     * @return int
     * @throws Exception
     */
    public int saveList(@Param("listHospitalDoctorModel") List<HospitalDoctorModel> listHospitalDoctorModel);


    /**
     * 查询详情
     *
     * @param HospitalDoctorModel
     * @return HospitalDoctorModel
     * @throws Exception
     */
    public HospitalDoctorModel queryDetail(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);

    /**
     * 查询列表
     *
     * @param HospitalDoctorModel
     * @return List<HospitalDoctorModel>
     * @throws Exception
     */
    public List<HospitalDoctorModel> queryList(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 分页查询列表
     *
     * @param HospitalDoctorModel
     * @return Page<HospitalDoctorModel>
     * @throws Exception
     */
    public Page<HospitalDoctorModel> queryListByPage(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 更新
     *
     * @param HospitalDoctorModel
     * @return int
     * @throws Exception
     */
    public int update(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 批量更新
     *
     * @param List<HospitalDoctorModel>
     * @return int
     * @throws Exception
     */
    public int updateList(@Param("listHospitalDoctorModel") List<HospitalDoctorModel> listHospitalDoctorModel);


    /**
     * 物理删除
     *
     * @param HospitalDoctorModel
     * @return int
     * @throws Exception
     */
    public int delete(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);

    /**
     * 根据入参条件查询 总数
     *
     * @param HospitalDoctorModel
     * @throws Exception
     */
    public Long queryCount(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


}