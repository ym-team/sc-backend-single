package com.cloud.business.categoryIndex;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 
 *
 * @author oymw
 * @date 2019-09-28 10:58:31
 */
@Mapper
public interface CategoryIndexMapper {

	 /**
	   * 新增  信息
	   * @param CategoryIndexModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("categoryIndexModel")CategoryIndexModel  categoryIndexModel);
	
	

	/**
	   *批量新增
	   * @param List<CategoryIndexModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listCategoryIndexModel")List<CategoryIndexModel>  listCategoryIndexModel);
	

  	 /**
	   * 查询详情
	   * @param CategoryIndexModel
	   * @return CategoryIndexModel
	   * @throws Exception
	   */
	public CategoryIndexModel queryDetail(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
  
	/**
	 * 查询列表
	 * @param CategoryIndexModel
	 * @return List<CategoryIndexModel>
	 * @throws Exception
	 */
	public List<CategoryIndexModel> queryList(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param CategoryIndexModel
	 * @return Page<CategoryIndexModel>
	 * @throws Exception
	 */
	public Page<CategoryIndexModel> queryListByPage(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
	  
	  
	/**
	 * 更新
	 * @param CategoryIndexModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
	
	
	/**
	 * 批量更新
	 * @param List<CategoryIndexModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listCategoryIndexModel")List<CategoryIndexModel> listCategoryIndexModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CategoryIndexModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param CategoryIndexModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("categoryIndexModel")CategoryIndexModel categoryIndexModel);
	
	
	  

}