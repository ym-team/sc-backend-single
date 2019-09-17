package com.cloud.business.bussinessSum;


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
import com.cloud.util.aoplog.SpringAOP;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

import lombok.extern.slf4j.Slf4j;

import java.util.List;



/**
 * <p>
 *  
 * </p>
 *
 * @author Michael
 * @date  2019-09-17 01:13:24
 */
@Slf4j
@RestController
public class BussinessSumController{

	@Autowired
	private IBussinessSumService bussinessSumService;

	/**
	   * 添加信息
	   * @param BussinessSumBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:bussinessSum:save')")
	@PostMapping("/api-business/bussinessSum/save")
	public void save(@RequestBody BussinessSumBOS  bussinessSumBOS)throws Exception{
		long id = this.bussinessSumService.save(bussinessSumBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param BussinessSumBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:bussinessSum:saveList')")
	@PostMapping("/api-business/bussinessSum/saveList")
	public void saveList(@RequestBody List<BussinessSumBOS>  listBussinessSumBOS)throws Exception{
		long count = this.bussinessSumService.saveList(listBussinessSumBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param BussinessSumBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:bussinessSum:update')")
	@PutMapping("/api-business/bussinessSum/update")
	public void update(@RequestBody BussinessSumBOU bussinessSumBOU)throws Exception{
		long count = this.bussinessSumService.update(bussinessSumBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<BussinessSumBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:bussinessSum:updateList')")
	@PutMapping("/api-business/bussinessSum/updateList")
	public void updateList(@RequestBody List<BussinessSumBOU> listBussinessSumBOU)throws Exception{
		long count = this.bussinessSumService.updateList(listBussinessSumBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param BussinessSumBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:bussinessSum:delete')")
	//@PutMapping("/api-business/bussinessSum/delete")   
	@DeleteMapping("/api-business/bussinessSum/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody BussinessSumBOD bussinessSumBOD
		BussinessSumBOD bussinessSumBOD = new BussinessSumBOD();
		bussinessSumBOD.setId(id);
		long count = this.bussinessSumService.delete(bussinessSumBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param BussinessSumQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:bussinessSum:queryDetail')")
	@GetMapping("/api-business/bussinessSum/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  BussinessSumBOQ bussinessSumBOQ){
	public BussinessSumVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		BussinessSumBOQ bussinessSumBOQ = new BussinessSumBOQ();
		bussinessSumBOQ.setId(id);
		return this.bussinessSumService.queryDetail(bussinessSumBOQ);
	}
  
	/**
	 * 查询列表
	 * @param BussinessSumBOQ
	 * @return List<BussinessSumVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:bussinessSum:queryList')")
	@GetMapping("/api-business/bussinessSum/queryList")
	public List<BussinessSumVO> queryList(@RequestBody(required=false) BussinessSumBOQ bussinessSumBOQ)throws Exception{
		return this.bussinessSumService.queryList(bussinessSumBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param BussinessSumBOQP
	 * @return	List<BussinessSumVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:bussinessSum:queryListByPage')")
	@GetMapping("/api-business/bussinessSum/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) BussinessSumBOQP bussinessSumBOP){
	public PageQuery<BussinessSumVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		BussinessSumBOQP bussinessSumBOQP = JSON.parseObject(JSON.toJSONString(params), BussinessSumBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.bussinessSumService.queryListByPage(bussinessSumBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param BussinessSumBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:bussinessSum:queryCount')")
	@GetMapping("/api-business/bussinessSum/queryCount")
	public Long queryCount(BussinessSumBOQ bussinessSumBOQ)throws Exception{
		return this.bussinessSumService.queryCount(bussinessSumBOQ);
	}
	
	
	  
     

}