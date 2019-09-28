package com.cloud.business.category;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.category.CategoryModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author oymw
 * @since 2019-09-28 10:58:31
 */
public interface ICategoryService {


	 /**
	   * 新增  信息
	   * @param CategoryBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CategoryBOS  categoryBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CategoryBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CategoryBOS>  listCategoryBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CategoryBOQ
	   * @return CategoryVO
	   * @throws Exception
	   */
	public CategoryVO queryDetail(CategoryBOQ categoryBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CategoryBOQ
	 * @return List<CategoryVO>
	 * @throws Exception
	 */
	public List<CategoryVO> queryList(CategoryBOQ categoryBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CategoryBOQP
	 * @return PageQuery<CategoryVO>
	 * @throws Exception
	 */
	public PageQuery<CategoryVO> queryListByPage(CategoryBOQP categoryBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CategoryBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CategoryBOU categoryBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CategoryBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CategoryBOU> listCategoryBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CategoryBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CategoryBOD categoryBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CategoryBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CategoryBOQ categoryBOQ)throws Exception;
	
	
	  

}
