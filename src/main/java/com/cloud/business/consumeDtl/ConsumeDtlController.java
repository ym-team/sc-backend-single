package com.cloud.business.consumeDtl;


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
 * @author Michael
 * @date  2019-09-17 01:13:26
 */
@RestController
public class ConsumeDtlController{

	@Autowired
	private IConsumeDtlService consumeDtlService;

	/**
	   * 添加信息
	   * @param ConsumeDtlBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:consumeDtl:save')")
	@PostMapping("/api-business/consumeDtl/save")
	public void save(@RequestBody ConsumeDtlBOS  consumeDtlBOS)throws Exception{
		long id = this.consumeDtlService.save(consumeDtlBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param ConsumeDtlBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:consumeDtl:saveList')")
	@PostMapping("/api-business/consumeDtl/saveList")
	public void saveList(@RequestBody List<ConsumeDtlBOS>  listConsumeDtlBOS)throws Exception{
		long count = this.consumeDtlService.saveList(listConsumeDtlBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param ConsumeDtlBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:consumeDtl:update')")
	@PutMapping("/api-business/consumeDtl/update")
	public void update(@RequestBody ConsumeDtlBOU consumeDtlBOU)throws Exception{
		long count = this.consumeDtlService.update(consumeDtlBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<ConsumeDtlBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:consumeDtl:updateList')")
	@PutMapping("/api-business/consumeDtl/updateList")
	public void updateList(@RequestBody List<ConsumeDtlBOU> listConsumeDtlBOU)throws Exception{
		long count = this.consumeDtlService.updateList(listConsumeDtlBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param ConsumeDtlBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:consumeDtl:delete')")
	//@PutMapping("/api-business/consumeDtl/delete")   
	@DeleteMapping("/api-business/consumeDtl/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody ConsumeDtlBOD consumeDtlBOD
		ConsumeDtlBOD consumeDtlBOD = new ConsumeDtlBOD();
		consumeDtlBOD.setId(id);
		long count = this.consumeDtlService.delete(consumeDtlBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param ConsumeDtlQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:consumeDtl:queryDetail')")
	@GetMapping("/api-business/consumeDtl/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  ConsumeDtlBOQ consumeDtlBOQ){
	public ConsumeDtlVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		ConsumeDtlBOQ consumeDtlBOQ = new ConsumeDtlBOQ();
		consumeDtlBOQ.setId(id);
		return this.consumeDtlService.queryDetail(consumeDtlBOQ);
	}
  
	/**
	 * 查询列表
	 * @param ConsumeDtlBOQ
	 * @return List<ConsumeDtlVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:consumeDtl:queryList')")
	@GetMapping("/api-business/consumeDtl/queryList")
	public List<ConsumeDtlVO> queryList(@RequestBody(required=false) ConsumeDtlBOQ consumeDtlBOQ)throws Exception{
		return this.consumeDtlService.queryList(consumeDtlBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param ConsumeDtlBOQP
	 * @return	List<ConsumeDtlVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:consumeDtl:queryListByPage')")
	@GetMapping("/api-business/consumeDtl/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) ConsumeDtlBOQP consumeDtlBOP){
	public PageQuery<ConsumeDtlVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		ConsumeDtlBOQP consumeDtlBOQP = JSON.parseObject(JSON.toJSONString(params), ConsumeDtlBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.consumeDtlService.queryListByPage(consumeDtlBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param ConsumeDtlBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:consumeDtl:queryCount')")
	@GetMapping("/api-business/consumeDtl/queryCount")
	public Long queryCount(ConsumeDtlBOQ consumeDtlBOQ)throws Exception{
		return this.consumeDtlService.queryCount(consumeDtlBOQ);
	}
	
	
	  
     

}