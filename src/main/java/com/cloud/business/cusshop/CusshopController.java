package com.cloud.business.cusshop;


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
public class CusshopController{

	@Autowired
	private ICusshopService cusshopService;

	/**
	   * 添加信息
	   * @param CusshopBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:cusshop:save')")
	@PostMapping("/api-business/cusshop/save")
	public void save(@RequestBody CusshopBOS  cusshopBOS)throws Exception{
		long id = this.cusshopService.save(cusshopBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CusshopBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:cusshop:saveList')")
	@PostMapping("/api-business/cusshop/saveList")
	public void saveList(@RequestBody List<CusshopBOS>  listCusshopBOS)throws Exception{
		long count = this.cusshopService.saveList(listCusshopBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CusshopBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:cusshop:update')")
	@PutMapping("/api-business/cusshop/update")
	public void update(@RequestBody CusshopBOU cusshopBOU)throws Exception{
		long count = this.cusshopService.update(cusshopBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CusshopBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:cusshop:updateList')")
	@PutMapping("/api-business/cusshop/updateList")
	public void updateList(@RequestBody List<CusshopBOU> listCusshopBOU)throws Exception{
		long count = this.cusshopService.updateList(listCusshopBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CusshopBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:cusshop:delete')")
	//@PutMapping("/api-business/cusshop/delete")   
	@DeleteMapping("/api-business/cusshop/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CusshopBOD cusshopBOD
		CusshopBOD cusshopBOD = new CusshopBOD();
		cusshopBOD.setId(id);
		long count = this.cusshopService.delete(cusshopBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CusshopQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:cusshop:queryDetail')")
	@GetMapping("/api-business/cusshop/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CusshopBOQ cusshopBOQ){
	public CusshopVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CusshopBOQ cusshopBOQ = new CusshopBOQ();
		cusshopBOQ.setId(id);
		return this.cusshopService.queryDetail(cusshopBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CusshopBOQ
	 * @return List<CusshopVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:cusshop:queryList')")
	@GetMapping("/api-business/cusshop/queryList")
	public List<CusshopVO> queryList(@RequestBody(required=false) CusshopBOQ cusshopBOQ)throws Exception{
		return this.cusshopService.queryList(cusshopBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CusshopBOQP
	 * @return	List<CusshopVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:cusshop:queryListByPage')")
	@GetMapping("/api-business/cusshop/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CusshopBOQP cusshopBOP){
	public PageQuery<CusshopVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CusshopBOQP cusshopBOQP = JSON.parseObject(JSON.toJSONString(params), CusshopBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.cusshopService.queryListByPage(cusshopBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CusshopBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:cusshop:queryCount')")
	@GetMapping("/api-business/cusshop/queryCount")
	public Long queryCount(CusshopBOQ cusshopBOQ)throws Exception{
		return this.cusshopService.queryCount(cusshopBOQ);
	}
	
	
	  
     

}