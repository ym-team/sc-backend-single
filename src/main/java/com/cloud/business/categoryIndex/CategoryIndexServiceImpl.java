package com.cloud.business.categoryIndex;

/**
import com.cloud.business.CategoryIndex.CategoryIndexModel;
import com.cloud.business.CategoryIndex.CategoryIndexMapper;
import com.cloud.business.CategoryIndex.CategoryIndexService;
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
public class CategoryIndexServiceImpl implements ICategoryIndexService  {


	  @Autowired
	  private CategoryIndexMapper categoryIndexMapper;
  
  
     /**
	   * 新增
	   * @param CategoryIndexModel
	   * @return long
	 */
	  @Override
	  public long save(CategoryIndexBOS categoryIndexBOS) throws Exception{
	  	CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOS, CategoryIndexModel.class);
		int count = this.categoryIndexMapper.save(categoryIndexModel);
	    return categoryIndexModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<CategoryIndexBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<CategoryIndexBOS> listCategoryIndexBOS) throws Exception {
	  	List<CategoryIndexModel> listCategoryIndexModel = BeanConvertUtils.convertList(listCategoryIndexBOS, CategoryIndexModel.class);
		int count = this.categoryIndexMapper.saveList(listCategoryIndexModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param CategoryIndexBOQ
	   * @return CategoryIndexVO
	   */
	@Override
	public CategoryIndexVO queryDetail(CategoryIndexBOQ categoryIndexBOQ) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOQ, CategoryIndexModel.class);
		categoryIndexModel = this.categoryIndexMapper.queryDetail(categoryIndexModel);
		return BeanConvertUtils.convert(categoryIndexModel, CategoryIndexVO.class);
	}
  
	/**
	 * 
	 * @param CategoryIndexBOQ
	 * @return	List<CategoryIndexVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<CategoryIndexVO> queryList(CategoryIndexBOQ categoryIndexBOQ) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOQ, CategoryIndexModel.class);
		List<CategoryIndexModel> listCategoryIndexModel = this.categoryIndexMapper.queryList(categoryIndexModel);
		return  BeanConvertUtils.convertList(listCategoryIndexModel, CategoryIndexVO.class);
	}
	  
	
	/**
	 * 
	 * @param CategoryIndexBOQP
	 * @param page
	 * @return PageQuery<CategoryIndexVO>
	 */
	@Override
	public PageQuery<CategoryIndexVO> queryListByPage(CategoryIndexBOQP categoryIndexBOQP,PageInfo page) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOQP, CategoryIndexModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<CategoryIndexModel> queryListByPage = this.categoryIndexMapper.queryListByPage(categoryIndexModel);
		return  new PageQuery(queryListByPage, CategoryIndexVO.class);
	}
	
	
	  
	/**
	 *
	 * @param CategoryIndexBOU
	 * @return int
	 */
	@Override
	public int update(CategoryIndexBOU categoryIndexBOU) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOU, CategoryIndexModel.class);
		return this.categoryIndexMapper.update(categoryIndexModel);
	}
	
	
	/**
	 *
	 * @param List<CategoryIndexBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<CategoryIndexBOU> listCategoryIndexBOU) throws Exception{
		List<CategoryIndexModel> listCategoryIndexModel = BeanConvertUtils.convertList(listCategoryIndexBOU, CategoryIndexModel.class);
		return this.categoryIndexMapper.updateList(listCategoryIndexModel);
	}
	
	  
	 /**
	  * 
	  * @param CategoryIndexBOD
	  * @return int
	  */
	  @Override
	public int delete(CategoryIndexBOD categoryIndexBOD) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOD, CategoryIndexModel.class);
		return this.categoryIndexMapper.delete(categoryIndexModel);
	}
	
	/**
	  * 
	  * @param CategoryIndexBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(CategoryIndexBOQ categoryIndexBOQ) throws Exception{
		CategoryIndexModel categoryIndexModel = BeanConvertUtils.convert(categoryIndexBOQ, CategoryIndexModel.class);
		return this.categoryIndexMapper.queryCount(categoryIndexModel);
	}


	
}
