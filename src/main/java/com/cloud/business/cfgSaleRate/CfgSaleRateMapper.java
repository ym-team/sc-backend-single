package com.cloud.business.cfgSaleRate;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 业务员/团队提成配置表
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
@Mapper
public interface CfgSaleRateMapper {

	 /**
	   * 新增 业务员/团队提成配置表 信息
	   * @param CfgSaleRateModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("cfgSaleRateModel")CfgSaleRateModel  cfgSaleRateModel);
	
	

	/**
	   *批量新增
	   * @param List<CfgSaleRateModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listCfgSaleRateModel")List<CfgSaleRateModel>  listCfgSaleRateModel);
	

  	 /**
	   * 查询详情
	   * @param CfgSaleRateModel
	   * @return CfgSaleRateModel
	   * @throws Exception
	   */
	public CfgSaleRateModel queryDetail(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
  
	/**
	 * 查询列表
	 * @param CfgSaleRateModel
	 * @return List<CfgSaleRateModel>
	 * @throws Exception
	 */
	public List<CfgSaleRateModel> queryList(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param CfgSaleRateModel
	 * @return Page<CfgSaleRateModel>
	 * @throws Exception
	 */
	public Page<CfgSaleRateModel> queryListByPage(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
	  
	  
	/**
	 * 更新
	 * @param CfgSaleRateModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
	
	
	/**
	 * 批量更新
	 * @param List<CfgSaleRateModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listCfgSaleRateModel")List<CfgSaleRateModel> listCfgSaleRateModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CfgSaleRateModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param CfgSaleRateModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("cfgSaleRateModel")CfgSaleRateModel cfgSaleRateModel);
	
	
	  

}