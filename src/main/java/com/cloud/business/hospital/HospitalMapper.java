package com.cloud.business.hospital;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;


@Mapper
public interface HospitalMapper {
	
	/**
	   * 新增
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long save(@Param("hospitalModel")HospitalModel hospitalModel);
	
	/**
	   * 批量新增
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long saveList(@Param("listHospitalModel")List<HospitalModel> listHospitalModel);
	
	
	/**
	   * 修改
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long update(@Param("hospitalModel")HospitalModel hospitalModel);
	
	
	
	/**
	   * 批量修改
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long updateList(@Param("listHospitalModel")List<HospitalModel> listHospitalModel);

	
	/**
	 * 删除
	 * 	@param HospitalModel
	 *  @return long
	 * */
	public long delete(@Param("hospitalModel")HospitalModel hospitalModel);
	
	
	/**
	 * 查询列表
	 * 	@param HospitalModel
	 *  @return List<HospitalModel>
	 * */
	public List<HospitalModel> queryList(@Param("hospitalModel")HospitalModel hospitalModel);
	
	
	/**
	 * 分页查询列表
	 * 	@param HospitalModel
	 *  @return Page<HospitalModel>
	 * */
	public Page<HospitalModel> queryListByPage(@Param("hospitalModel")HospitalModel hospitalModel);
	
	
	/**
	 * 查询详情
	 * @param HospitalModel
	 * @return HospitalModel
	 * */
	public HospitalModel queryDetail(@Param("hospitalModel")HospitalModel hospitalModel);
	
	
	/**
	 * 查询总数
	 * @param HospitalModel
	 * @return Long
	 * */
	public Long queryCount(@Param("hospitalModel")HospitalModel hospitalModel);
	
}
