package com.cloud.business.categoryIndex;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.categoryIndex.CategoryIndexModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author oymw
 * @since 2019-09-28 10:58:31
 */
public interface ICategoryIndexService {


	 /**
	   * 新增  信息
	   * @param CategoryIndexBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CategoryIndexBOS  categoryIndexBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CategoryIndexBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CategoryIndexBOS>  listCategoryIndexBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CategoryIndexBOQ
	   * @return CategoryIndexVO
	   * @throws Exception
	   */
	public CategoryIndexVO queryDetail(CategoryIndexBOQ categoryIndexBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CategoryIndexBOQ
	 * @return List<CategoryIndexVO>
	 * @throws Exception
	 */
	public List<CategoryIndexVO> queryList(CategoryIndexBOQ categoryIndexBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CategoryIndexBOQP
	 * @return PageQuery<CategoryIndexVO>
	 * @throws Exception
	 */
	public PageQuery<CategoryIndexVO> queryListByPage(CategoryIndexBOQP categoryIndexBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CategoryIndexBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CategoryIndexBOU categoryIndexBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CategoryIndexBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CategoryIndexBOU> listCategoryIndexBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CategoryIndexBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CategoryIndexBOD categoryIndexBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CategoryIndexBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CategoryIndexBOQ categoryIndexBOQ)throws Exception;
	
	
	  

}
