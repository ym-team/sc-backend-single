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
     * @param hospitalDoctorModel
     * @return int
     * @throws Exception
     */
    int save(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 批量新增
     *
     * @param listHospitalDoctorModel
     * @return int
     * @throws Exception
     */
    int saveList(@Param("listHospitalDoctorModel") List<HospitalDoctorModel> listHospitalDoctorModel);


    /**
     * 查询详情
     *
     * @param hospitalDoctorModel
     * @return HospitalDoctorModel
     * @throws Exception
     */
    HospitalDoctorModel queryDetail(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);

    /**
     * 查询列表
     *
     * @param hospitalDoctorModel
     * @return List<HospitalDoctorModel>
     * @throws Exception
     */
    List<HospitalDoctorModel> queryList(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 分页查询列表
     *
     * @param hospitalDoctorModel
     * @return Page<HospitalDoctorModel>
     * @throws Exception
     */
    Page<HospitalDoctorModel> queryListByPage(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 更新
     *
     * @param hospitalDoctorModel
     * @return int
     * @throws Exception
     */
    int update(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);


    /**
     * 批量更新
     *
     * @param listHospitalDoctorModel
     * @return int
     * @throws Exception
     */
    int updateList(@Param("listHospitalDoctorModel") List<HospitalDoctorModel> listHospitalDoctorModel);


    /**
     * 物理删除
     *
     * @param hospitalDoctorModel
     * @return int
     * @throws Exception
     */
    int delete(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);

    /**
     * 根据入参条件查询 总数
     *
     * @param hospitalDoctorModel
     * @throws Exception
     */
    Long queryCount(@Param("hospitalDoctorModel") HospitalDoctorModel hospitalDoctorModel);
}