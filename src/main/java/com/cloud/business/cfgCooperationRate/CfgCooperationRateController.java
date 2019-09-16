package com.cloud.business.cfgCooperationRate;


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
 * @date  2019-09-17 01:13:25
 */
@RestController
public class CfgCooperationRateController{

	@Autowired
	private ICfgCooperationRateService cfgCooperationRateService;

	/**
	   * 添加信息
	   * @param CfgCooperationRateBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:save')")
	@PostMapping("/api-business/cfgCooperationRate/save")
	public void save(@RequestBody CfgCooperationRateBOS  cfgCooperationRateBOS)throws Exception{
		long id = this.cfgCooperationRateService.save(cfgCooperationRateBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CfgCooperationRateBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:saveList')")
	@PostMapping("/api-business/cfgCooperationRate/saveList")
	public void saveList(@RequestBody List<CfgCooperationRateBOS>  listCfgCooperationRateBOS)throws Exception{
		long count = this.cfgCooperationRateService.saveList(listCfgCooperationRateBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CfgCooperationRateBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:update')")
	@PutMapping("/api-business/cfgCooperationRate/update")
	public void update(@RequestBody CfgCooperationRateBOU cfgCooperationRateBOU)throws Exception{
		long count = this.cfgCooperationRateService.update(cfgCooperationRateBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CfgCooperationRateBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:updateList')")
	@PutMapping("/api-business/cfgCooperationRate/updateList")
	public void updateList(@RequestBody List<CfgCooperationRateBOU> listCfgCooperationRateBOU)throws Exception{
		long count = this.cfgCooperationRateService.updateList(listCfgCooperationRateBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CfgCooperationRateBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:delete')")
	//@PutMapping("/api-business/cfgCooperationRate/delete")   
	@DeleteMapping("/api-business/cfgCooperationRate/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CfgCooperationRateBOD cfgCooperationRateBOD
		CfgCooperationRateBOD cfgCooperationRateBOD = new CfgCooperationRateBOD();
		cfgCooperationRateBOD.setId(id);
		long count = this.cfgCooperationRateService.delete(cfgCooperationRateBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CfgCooperationRateQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:queryDetail')")
	@GetMapping("/api-business/cfgCooperationRate/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CfgCooperationRateBOQ cfgCooperationRateBOQ){
	public CfgCooperationRateVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CfgCooperationRateBOQ cfgCooperationRateBOQ = new CfgCooperationRateBOQ();
		cfgCooperationRateBOQ.setId(id);
		return this.cfgCooperationRateService.queryDetail(cfgCooperationRateBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CfgCooperationRateBOQ
	 * @return List<CfgCooperationRateVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:queryList')")
	@GetMapping("/api-business/cfgCooperationRate/queryList")
	public List<CfgCooperationRateVO> queryList(@RequestBody(required=false) CfgCooperationRateBOQ cfgCooperationRateBOQ)throws Exception{
		return this.cfgCooperationRateService.queryList(cfgCooperationRateBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CfgCooperationRateBOQP
	 * @return	List<CfgCooperationRateVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:queryListByPage')")
	@GetMapping("/api-business/cfgCooperationRate/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CfgCooperationRateBOQP cfgCooperationRateBOP){
	public PageQuery<CfgCooperationRateVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CfgCooperationRateBOQP cfgCooperationRateBOQP = JSON.parseObject(JSON.toJSONString(params), CfgCooperationRateBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.cfgCooperationRateService.queryListByPage(cfgCooperationRateBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CfgCooperationRateBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:cfgCooperationRate:queryCount')")
	@GetMapping("/api-business/cfgCooperationRate/queryCount")
	public Long queryCount(CfgCooperationRateBOQ cfgCooperationRateBOQ)throws Exception{
		return this.cfgCooperationRateService.queryCount(cfgCooperationRateBOQ);
	}
	
	
	  
     

}