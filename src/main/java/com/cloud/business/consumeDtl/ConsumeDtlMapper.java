package com.cloud.business.consumeDtl;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Mapper
public interface ConsumeDtlMapper {

	 /**
	   * 新增  信息
	   * @param ConsumeDtlModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("consumeDtlModel")ConsumeDtlModel  consumeDtlModel);
	
	

	/**
	   *批量新增
	   * @param List<ConsumeDtlModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listConsumeDtlModel")List<ConsumeDtlModel>  listConsumeDtlModel);
	

  	 /**
	   * 查询详情
	   * @param ConsumeDtlModel
	   * @return ConsumeDtlModel
	   * @throws Exception
	   */
	public ConsumeDtlModel queryDetail(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
  
	/**
	 * 查询列表
	 * @param ConsumeDtlModel
	 * @return List<ConsumeDtlModel>
	 * @throws Exception
	 */
	public List<ConsumeDtlModel> queryList(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param ConsumeDtlModel
	 * @return Page<ConsumeDtlModel>
	 * @throws Exception
	 */
	public Page<ConsumeDtlModel> queryListByPage(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
	  
	  
	/**
	 * 更新
	 * @param ConsumeDtlModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
	
	
	/**
	 * 批量更新
	 * @param List<ConsumeDtlModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listConsumeDtlModel")List<ConsumeDtlModel> listConsumeDtlModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param ConsumeDtlModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param ConsumeDtlModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("consumeDtlModel")ConsumeDtlModel consumeDtlModel);
	
	
	  

}