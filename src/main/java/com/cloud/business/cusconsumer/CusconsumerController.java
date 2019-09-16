package com.cloud.business.cusconsumer;


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
public class CusconsumerController{

	@Autowired
	private ICusconsumerService cusconsumerService;

	/**
	   * 添加信息
	   * @param CusconsumerBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:cusconsumer:save')")
	@PostMapping("/api-business/cusconsumer/save")
	public void save(@RequestBody CusconsumerBOS  cusconsumerBOS)throws Exception{
		long id = this.cusconsumerService.save(cusconsumerBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CusconsumerBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:cusconsumer:saveList')")
	@PostMapping("/api-business/cusconsumer/saveList")
	public void saveList(@RequestBody List<CusconsumerBOS>  listCusconsumerBOS)throws Exception{
		long count = this.cusconsumerService.saveList(listCusconsumerBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CusconsumerBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:cusconsumer:update')")
	@PutMapping("/api-business/cusconsumer/update")
	public void update(@RequestBody CusconsumerBOU cusconsumerBOU)throws Exception{
		long count = this.cusconsumerService.update(cusconsumerBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CusconsumerBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:cusconsumer:updateList')")
	@PutMapping("/api-business/cusconsumer/updateList")
	public void updateList(@RequestBody List<CusconsumerBOU> listCusconsumerBOU)throws Exception{
		long count = this.cusconsumerService.updateList(listCusconsumerBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CusconsumerBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:cusconsumer:delete')")
	//@PutMapping("/api-business/cusconsumer/delete")   
	@DeleteMapping("/api-business/cusconsumer/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CusconsumerBOD cusconsumerBOD
		CusconsumerBOD cusconsumerBOD = new CusconsumerBOD();
		cusconsumerBOD.setId(id);
		long count = this.cusconsumerService.delete(cusconsumerBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CusconsumerQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:cusconsumer:queryDetail')")
	@GetMapping("/api-business/cusconsumer/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CusconsumerBOQ cusconsumerBOQ){
	public CusconsumerVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CusconsumerBOQ cusconsumerBOQ = new CusconsumerBOQ();
		cusconsumerBOQ.setId(id);
		return this.cusconsumerService.queryDetail(cusconsumerBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CusconsumerBOQ
	 * @return List<CusconsumerVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:cusconsumer:queryList')")
	@GetMapping("/api-business/cusconsumer/queryList")
	public List<CusconsumerVO> queryList(@RequestBody(required=false) CusconsumerBOQ cusconsumerBOQ)throws Exception{
		return this.cusconsumerService.queryList(cusconsumerBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CusconsumerBOQP
	 * @return	List<CusconsumerVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:cusconsumer:queryListByPage')")
	@GetMapping("/api-business/cusconsumer/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CusconsumerBOQP cusconsumerBOP){
	public PageQuery<CusconsumerVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CusconsumerBOQP cusconsumerBOQP = JSON.parseObject(JSON.toJSONString(params), CusconsumerBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.cusconsumerService.queryListByPage(cusconsumerBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CusconsumerBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:cusconsumer:queryCount')")
	@GetMapping("/api-business/cusconsumer/queryCount")
	public Long queryCount(CusconsumerBOQ cusconsumerBOQ)throws Exception{
		return this.cusconsumerService.queryCount(cusconsumerBOQ);
	}
	
	
	  
     

}