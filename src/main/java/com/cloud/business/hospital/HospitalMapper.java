package com.cloud.business.hospital;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 医院表
 *
 * @author Michael
 * @date 2019-09-17 01:13:29
 */
@Mapper
public interface HospitalMapper {

    /**
     * 新增 医院表 信息
     *
     * @param HospitalModel
     * @return int
     * @throws Exception
     */
    public int save(@Param("hospitalModel") HospitalModel hospitalModel);


    /**
     * 批量新增
     *
     * @param List<HospitalModel>
     * @return int
     * @throws Exception
     */
    public int saveList(@Param("listHospitalModel") List<HospitalModel> listHospitalModel);


    /**
     * 查询详情
     *
     * @param HospitalModel
     * @return HospitalModel
     * @throws Exception
     */
    public HospitalModel queryDetail(@Param("hospitalModel") HospitalModel hospitalModel);

    /**
     * 查询列表
     *
     * @param HospitalModel
     * @return List<HospitalModel>
     * @throws Exception
     */
    public List<HospitalModel> queryList(@Param("hospitalModel") HospitalModel hospitalModel);


    /**
     * 分页查询列表
     *
     * @param HospitalModel
     * @return Page<HospitalModel>
     * @throws Exception
     */
    public Page<HospitalModel> queryListByPage(@Param("hospitalModel") HospitalModel hospitalModel);


    /**
     * 更新
     *
     * @param HospitalModel
     * @return int
     * @throws Exception
     */
    public int update(@Param("hospitalModel") HospitalModel hospitalModel);


    /**
     * 批量更新
     *
     * @param List<HospitalModel>
     * @return int
     * @throws Exception
     */
    public int updateList(@Param("listHospitalModel") List<HospitalModel> listHospitalModel);


    /**
     * 物理删除
     *
     * @param HospitalModel
     * @return int
     * @throws Exception
     */
    public int delete(@Param("hospitalModel") HospitalModel hospitalModel);

    /**
     * 根据入参条件查询 总数
     *
     * @param HospitalModel
     * @throws Exception
     */
    public Long queryCount(@Param("hospitalModel") HospitalModel hospitalModel);


}