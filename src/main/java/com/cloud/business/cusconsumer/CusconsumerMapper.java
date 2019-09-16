package com.cloud.business.cusconsumer;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 顾客信息
 *
 * @author Michael
 * @date 2019-09-17 01:13:26
 */
@Mapper
public interface CusconsumerMapper {

	 /**
	   * 新增 顾客信息 信息
	   * @param CusconsumerModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("cusconsumerModel")CusconsumerModel  cusconsumerModel);
	
	

	/**
	   *批量新增
	   * @param List<CusconsumerModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listCusconsumerModel")List<CusconsumerModel>  listCusconsumerModel);
	

  	 /**
	   * 查询详情
	   * @param CusconsumerModel
	   * @return CusconsumerModel
	   * @throws Exception
	   */
	public CusconsumerModel queryDetail(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
  
	/**
	 * 查询列表
	 * @param CusconsumerModel
	 * @return List<CusconsumerModel>
	 * @throws Exception
	 */
	public List<CusconsumerModel> queryList(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param CusconsumerModel
	 * @return Page<CusconsumerModel>
	 * @throws Exception
	 */
	public Page<CusconsumerModel> queryListByPage(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
	  
	  
	/**
	 * 更新
	 * @param CusconsumerModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
	
	
	/**
	 * 批量更新
	 * @param List<CusconsumerModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listCusconsumerModel")List<CusconsumerModel> listCusconsumerModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CusconsumerModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param CusconsumerModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("cusconsumerModel")CusconsumerModel cusconsumerModel);
	
	
	  

}