package com.cloud.business.saleman;


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
 * @date  2019-09-17 01:13:27
 */
@RestController
public class SalemanController{

	@Autowired
	private ISalemanService salemanService;

	/**
	   * 添加信息
	   * @param SalemanBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:saleman:save')")
	@PostMapping("/api-business/saleman/save")
	public void save(@RequestBody SalemanBOS  salemanBOS)throws Exception{
		long id = this.salemanService.save(salemanBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param SalemanBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:saleman:saveList')")
	@PostMapping("/api-business/saleman/saveList")
	public void saveList(@RequestBody List<SalemanBOS>  listSalemanBOS)throws Exception{
		long count = this.salemanService.saveList(listSalemanBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param SalemanBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:saleman:update')")
	@PutMapping("/api-business/saleman/update")
	public void update(@RequestBody SalemanBOU salemanBOU)throws Exception{
		long count = this.salemanService.update(salemanBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<SalemanBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:saleman:updateList')")
	@PutMapping("/api-business/saleman/updateList")
	public void updateList(@RequestBody List<SalemanBOU> listSalemanBOU)throws Exception{
		long count = this.salemanService.updateList(listSalemanBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param SalemanBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:saleman:delete')")
	//@PutMapping("/api-business/saleman/delete")   
	@DeleteMapping("/api-business/saleman/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody SalemanBOD salemanBOD
		SalemanBOD salemanBOD = new SalemanBOD();
		salemanBOD.setId(id);
		long count = this.salemanService.delete(salemanBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param SalemanQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:saleman:queryDetail')")
	@GetMapping("/api-business/saleman/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  SalemanBOQ salemanBOQ){
	public SalemanVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		SalemanBOQ salemanBOQ = new SalemanBOQ();
		salemanBOQ.setId(id);
		return this.salemanService.queryDetail(salemanBOQ);
	}
  
	/**
	 * 查询列表
	 * @param SalemanBOQ
	 * @return List<SalemanVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:saleman:queryList')")
	@GetMapping("/api-business/saleman/queryList")
	public List<SalemanVO> queryList(@RequestBody(required=false) SalemanBOQ salemanBOQ)throws Exception{
		return this.salemanService.queryList(salemanBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param SalemanBOQP
	 * @return	List<SalemanVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:saleman:queryListByPage')")
	@GetMapping("/api-business/saleman/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) SalemanBOQP salemanBOP){
	public PageQuery<SalemanVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		SalemanBOQP salemanBOQP = JSON.parseObject(JSON.toJSONString(params), SalemanBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.salemanService.queryListByPage(salemanBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param SalemanBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:saleman:queryCount')")
	@GetMapping("/api-business/saleman/queryCount")
	public Long queryCount(SalemanBOQ salemanBOQ)throws Exception{
		return this.salemanService.queryCount(salemanBOQ);
	}
	
	
	  
     

}