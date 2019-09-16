package com.cloud.business.cfgCooperationRate;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 合作方提成表
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
@Mapper
public interface CfgCooperationRateMapper {

	 /**
	   * 新增 合作方提成表 信息
	   * @param CfgCooperationRateModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("cfgCooperationRateModel")CfgCooperationRateModel  cfgCooperationRateModel);
	
	

	/**
	   *批量新增
	   * @param List<CfgCooperationRateModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listCfgCooperationRateModel")List<CfgCooperationRateModel>  listCfgCooperationRateModel);
	

  	 /**
	   * 查询详情
	   * @param CfgCooperationRateModel
	   * @return CfgCooperationRateModel
	   * @throws Exception
	   */
	public CfgCooperationRateModel queryDetail(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
  
	/**
	 * 查询列表
	 * @param CfgCooperationRateModel
	 * @return List<CfgCooperationRateModel>
	 * @throws Exception
	 */
	public List<CfgCooperationRateModel> queryList(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param CfgCooperationRateModel
	 * @return Page<CfgCooperationRateModel>
	 * @throws Exception
	 */
	public Page<CfgCooperationRateModel> queryListByPage(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
	  
	  
	/**
	 * 更新
	 * @param CfgCooperationRateModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
	
	
	/**
	 * 批量更新
	 * @param List<CfgCooperationRateModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listCfgCooperationRateModel")List<CfgCooperationRateModel> listCfgCooperationRateModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CfgCooperationRateModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param CfgCooperationRateModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("cfgCooperationRateModel")CfgCooperationRateModel cfgCooperationRateModel);
	
	
	  

}