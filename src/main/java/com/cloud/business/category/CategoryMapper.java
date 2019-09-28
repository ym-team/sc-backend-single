package com.cloud.business.category;

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
public interface CategoryMapper {

	 /**
	   * 新增  信息
	   * @param CategoryModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("categoryModel")CategoryModel  categoryModel);
	
	

	/**
	   *批量新增
	   * @param List<CategoryModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listCategoryModel")List<CategoryModel>  listCategoryModel);
	

  	 /**
	   * 查询详情
	   * @param CategoryModel
	   * @return CategoryModel
	   * @throws Exception
	   */
	public CategoryModel queryDetail(@Param("categoryModel")CategoryModel categoryModel);
  
	/**
	 * 查询列表
	 * @param CategoryModel
	 * @return List<CategoryModel>
	 * @throws Exception
	 */
	public List<CategoryModel> queryList(@Param("categoryModel")CategoryModel categoryModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param CategoryModel
	 * @return Page<CategoryModel>
	 * @throws Exception
	 */
	public Page<CategoryModel> queryListByPage(@Param("categoryModel")CategoryModel categoryModel);
	  
	  
	/**
	 * 更新
	 * @param CategoryModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("categoryModel")CategoryModel categoryModel);
	
	
	/**
	 * 批量更新
	 * @param List<CategoryModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listCategoryModel")List<CategoryModel> listCategoryModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CategoryModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("categoryModel")CategoryModel categoryModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param CategoryModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("categoryModel")CategoryModel categoryModel);
	
	
	  

}