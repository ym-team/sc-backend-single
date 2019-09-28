package com.cloud.business.categoryIndex;


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
public class CategoryIndexController{

	@Autowired
	private ICategoryIndexService categoryIndexService;

	/**
	   * 添加信息
	   * @param CategoryIndexBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:categoryIndex:save')")
	@PostMapping("/api-business/categoryIndex/save")
	public void save(@RequestBody CategoryIndexBOS  categoryIndexBOS)throws Exception{
		long id = this.categoryIndexService.save(categoryIndexBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CategoryIndexBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:categoryIndex:saveList')")
	@PostMapping("/api-business/categoryIndex/saveList")
	public void saveList(@RequestBody List<CategoryIndexBOS>  listCategoryIndexBOS)throws Exception{
		long count = this.categoryIndexService.saveList(listCategoryIndexBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CategoryIndexBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:categoryIndex:update')")
	@PutMapping("/api-business/categoryIndex/update")
	public void update(@RequestBody CategoryIndexBOU categoryIndexBOU)throws Exception{
		long count = this.categoryIndexService.update(categoryIndexBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CategoryIndexBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:categoryIndex:updateList')")
	@PutMapping("/api-business/categoryIndex/updateList")
	public void updateList(@RequestBody List<CategoryIndexBOU> listCategoryIndexBOU)throws Exception{
		long count = this.categoryIndexService.updateList(listCategoryIndexBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CategoryIndexBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:categoryIndex:delete')")
	//@PutMapping("/api-business/categoryIndex/delete")   
	@DeleteMapping("/api-business/categoryIndex/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CategoryIndexBOD categoryIndexBOD
		CategoryIndexBOD categoryIndexBOD = new CategoryIndexBOD();
		categoryIndexBOD.setId(id);
		long count = this.categoryIndexService.delete(categoryIndexBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CategoryIndexQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:categoryIndex:queryDetail')")
	@GetMapping("/api-business/categoryIndex/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CategoryIndexBOQ categoryIndexBOQ){
	public CategoryIndexVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CategoryIndexBOQ categoryIndexBOQ = new CategoryIndexBOQ();
		categoryIndexBOQ.setId(id);
		return this.categoryIndexService.queryDetail(categoryIndexBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CategoryIndexBOQ
	 * @return List<CategoryIndexVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:categoryIndex:queryList')")
	@GetMapping("/api-business/categoryIndex/queryList")
	public List<CategoryIndexVO> queryList(@RequestBody(required=false) CategoryIndexBOQ categoryIndexBOQ)throws Exception{
		return this.categoryIndexService.queryList(categoryIndexBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CategoryIndexBOQP
	 * @return	List<CategoryIndexVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:categoryIndex:queryListByPage')")
	@GetMapping("/api-business/categoryIndex/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CategoryIndexBOQP categoryIndexBOP){
	public PageQuery<CategoryIndexVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CategoryIndexBOQP categoryIndexBOQP = JSON.parseObject(JSON.toJSONString(params), CategoryIndexBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.categoryIndexService.queryListByPage(categoryIndexBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CategoryIndexBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:categoryIndex:queryCount')")
	@GetMapping("/api-business/categoryIndex/queryCount")
	public Long queryCount(CategoryIndexBOQ categoryIndexBOQ)throws Exception{
		return this.categoryIndexService.queryCount(categoryIndexBOQ);
	}
	
	
	  
     

}