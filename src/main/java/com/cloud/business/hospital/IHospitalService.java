package com.cloud.business.hospital;

import java.util.List;

import com.cloud.util.Page;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

public interface IHospitalService {
	
	/**
	   * 新增
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long save(HospitalBOS hospitalBOS);
	
	/**
	   * 批量新增
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long saveList(List<HospitalBOS> listHospitalBOS);

	
	/**
	   * 修改
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long update(HospitalBOU hospitalBOU);
	
	
	
	/**
	   * 批量修改
	   * @param HospitalModel
	   * @return long
	   *
	   */
	public long updateList(List<HospitalBOU> listHospitalBOU);

	
	/**
	 * 删除
	 * 	@param HospitalModel
	 *  @return long
	 * */
	public long delete(HospitalBOD hospitalBOD);
	
	
	/**
	 * 查询列表
	 * 	@param HospitalModel
	 *  @return List<HospitalModel>
	 * */
	public List<HospitalVO> queryList(HospitalBOQ hospitalBOQ);
	
	
	/**
	 * 分页查询列表
	 * 	@param HospitalModel
	 *  @return Page<HospitalModel>
	 * */
	public PageQuery<HospitalVO> queryListByPage(HospitalBOQP hospitalBOP,PageInfo page);
	
	
	/**
	 * 查询详情
	 * @param HospitalModel
	 * @return HospitalModel
	 * */
	public HospitalVO queryDetail(HospitalBOQ hospitalBO);
	
	
	/**
	 * 查询总数
	 * @param HospitalModel
	 * @return Long
	 * */
	public Long queryCount(HospitalBOQ hospitalBOQ);
	
	


}
