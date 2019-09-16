package com.cloud.business.bussinessSum;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:24
 */
@Mapper
public interface BussinessSumMapper {

	 /**
	   * 新增  信息
	   * @param BussinessSumModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("bussinessSumModel")BussinessSumModel  bussinessSumModel);
	
	

	/**
	   *批量新增
	   * @param List<BussinessSumModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listBussinessSumModel")List<BussinessSumModel>  listBussinessSumModel);
	

  	 /**
	   * 查询详情
	   * @param BussinessSumModel
	   * @return BussinessSumModel
	   * @throws Exception
	   */
	public BussinessSumModel queryDetail(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
  
	/**
	 * 查询列表
	 * @param BussinessSumModel
	 * @return List<BussinessSumModel>
	 * @throws Exception
	 */
	public List<BussinessSumModel> queryList(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param BussinessSumModel
	 * @return Page<BussinessSumModel>
	 * @throws Exception
	 */
	public Page<BussinessSumModel> queryListByPage(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
	  
	  
	/**
	 * 更新
	 * @param BussinessSumModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
	
	
	/**
	 * 批量更新
	 * @param List<BussinessSumModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listBussinessSumModel")List<BussinessSumModel> listBussinessSumModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param BussinessSumModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param BussinessSumModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("bussinessSumModel")BussinessSumModel bussinessSumModel);
	
	
	  

}