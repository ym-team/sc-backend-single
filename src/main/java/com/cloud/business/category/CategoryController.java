package com.cloud.business.category;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.cloud.util.LogAnnotation;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import java.util.List;



/**
 * <p>
 *  
 * </p>
 *
 * @author oymw
 * @date  2019-09-28 10:58:31
 */
@RestController
public class CategoryController{

	@Autowired
	private ICategoryService categoryService;

	/**
	   * 添加信息
	   * @param CategoryBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:category:save')")
	@PostMapping("/api-business/category/save")
	public void save(@RequestBody CategoryBOS  categoryBOS)throws Exception{
		long id = this.categoryService.save(categoryBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CategoryBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:category:saveList')")
	@PostMapping("/api-business/category/saveList")
	public void saveList(@RequestBody List<CategoryBOS>  listCategoryBOS)throws Exception{
		long count = this.categoryService.saveList(listCategoryBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CategoryBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:category:update')")
	@PutMapping("/api-business/category/update")
	public void update(@RequestBody CategoryBOU categoryBOU)throws Exception{
		long count = this.categoryService.update(categoryBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CategoryBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:category:updateList')")
	@PutMapping("/api-business/category/updateList")
	public void updateList(@RequestBody List<CategoryBOU> listCategoryBOU)throws Exception{
		long count = this.categoryService.updateList(listCategoryBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CategoryBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:category:delete')")
	//@PutMapping("/api-business/category/delete")   
	@DeleteMapping("/api-business/category/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CategoryBOD categoryBOD
		CategoryBOD categoryBOD = new CategoryBOD();
		categoryBOD.setId(id);
		long count = this.categoryService.delete(categoryBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CategoryQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:category:queryDetail')")
	@GetMapping("/api-business/category/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CategoryBOQ categoryBOQ){
	public CategoryVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CategoryBOQ categoryBOQ = new CategoryBOQ();
		categoryBOQ.setId(id);
		return this.categoryService.queryDetail(categoryBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CategoryBOQ
	 * @return List<CategoryVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:category:queryList')")
	@GetMapping("/api-business/category/queryList")
	public List<CategoryVO> queryList(@RequestBody(required=false) CategoryBOQ categoryBOQ)throws Exception{
		return this.categoryService.queryList(categoryBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CategoryBOQP
	 * @return	List<CategoryVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:category:queryListByPage')")
	@GetMapping("/api-business/category/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CategoryBOQP categoryBOP){
	public PageQuery<CategoryVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CategoryBOQP categoryBOQP = JSON.parseObject(JSON.toJSONString(params), CategoryBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.categoryService.queryListByPage(categoryBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CategoryBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:category:queryCount')")
	@GetMapping("/api-business/category/queryCount")
	public Long queryCount(CategoryBOQ categoryBOQ)throws Exception{
		return this.categoryService.queryCount(categoryBOQ);
	}
	
	
	  
     

}