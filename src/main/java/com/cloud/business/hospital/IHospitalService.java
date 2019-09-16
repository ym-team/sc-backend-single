package com.cloud.business.hospital;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.hospital.HospitalModel;



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
	   * @param HospitalBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(HospitalBOS  hospitalBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<HospitalBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<HospitalBOS>  listHospitalBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param HospitalBOQ
	   * @return HospitalVO
	   * @throws Exception
	   */
	public HospitalVO queryDetail(HospitalBOQ hospitalBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param HospitalBOQ
	 * @return List<HospitalVO>
	 * @throws Exception
	 */
	public List<HospitalVO> queryList(HospitalBOQ hospitalBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param HospitalBOQP
	 * @return PageQuery<HospitalVO>
	 * @throws Exception
	 */
	public PageQuery<HospitalVO> queryListByPage(HospitalBOQP hospitalBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param HospitalBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(HospitalBOU hospitalBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<HospitalBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<HospitalBOU> listHospitalBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param HospitalBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(HospitalBOD hospitalBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param HospitalBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(HospitalBOQ hospitalBOQ)throws Exception;
	
	
	  

}
