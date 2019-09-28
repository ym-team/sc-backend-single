package com.cloud.business.category;

/**
import com.cloud.business.Category.CategoryModel;
import com.cloud.business.Category.CategoryMapper;
import com.cloud.business.Category.CategoryService;
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.util.BeanConvertUtils;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * ${comments} 服务实现类
 * </p>
 
 *
 * @author oymw
 * @date  2019-09-28 10:58:31
 */
@Slf4j
@Service
public class CategoryServiceImpl implements ICategoryService  {


	  @Autowired
	  private CategoryMapper categoryMapper;
  
  
     /**
	   * 新增
	   * @param CategoryModel
	   * @return long
	 */
	  @Override
	  public long save(CategoryBOS categoryBOS) throws Exception{
	  	CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOS, CategoryModel.class);
		int count = this.categoryMapper.save(categoryModel);
	    return categoryModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<CategoryBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<CategoryBOS> listCategoryBOS) throws Exception {
	  	List<CategoryModel> listCategoryModel = BeanConvertUtils.convertList(listCategoryBOS, CategoryModel.class);
		int count = this.categoryMapper.saveList(listCategoryModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param CategoryBOQ
	   * @return CategoryVO
	   */
	@Override
	public CategoryVO queryDetail(CategoryBOQ categoryBOQ) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOQ, CategoryModel.class);
		categoryModel = this.categoryMapper.queryDetail(categoryModel);
		return BeanConvertUtils.convert(categoryModel, CategoryVO.class);
	}
  
	/**
	 * 
	 * @param CategoryBOQ
	 * @return	List<CategoryVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<CategoryVO> queryList(CategoryBOQ categoryBOQ) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOQ, CategoryModel.class);
		List<CategoryModel> listCategoryModel = this.categoryMapper.queryList(categoryModel);
		return  BeanConvertUtils.convertList(listCategoryModel, CategoryVO.class);
	}
	  
	
	/**
	 * 
	 * @param CategoryBOQP
	 * @param page
	 * @return PageQuery<CategoryVO>
	 */
	@Override
	public PageQuery<CategoryVO> queryListByPage(CategoryBOQP categoryBOQP,PageInfo page) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOQP, CategoryModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<CategoryModel> queryListByPage = this.categoryMapper.queryListByPage(categoryModel);
		return  new PageQuery(queryListByPage, CategoryVO.class);
	}
	
	
	  
	/**
	 *
	 * @param CategoryBOU
	 * @return int
	 */
	@Override
	public int update(CategoryBOU categoryBOU) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOU, CategoryModel.class);
		return this.categoryMapper.update(categoryModel);
	}
	
	
	/**
	 *
	 * @param List<CategoryBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<CategoryBOU> listCategoryBOU) throws Exception{
		List<CategoryModel> listCategoryModel = BeanConvertUtils.convertList(listCategoryBOU, CategoryModel.class);
		return this.categoryMapper.updateList(listCategoryModel);
	}
	
	  
	 /**
	  * 
	  * @param CategoryBOD
	  * @return int
	  */
	  @Override
	public int delete(CategoryBOD categoryBOD) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOD, CategoryModel.class);
		return this.categoryMapper.delete(categoryModel);
	}
	
	/**
	  * 
	  * @param CategoryBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(CategoryBOQ categoryBOQ) throws Exception{
		CategoryModel categoryModel = BeanConvertUtils.convert(categoryBOQ, CategoryModel.class);
		return this.categoryMapper.queryCount(categoryModel);
	}


	
}
