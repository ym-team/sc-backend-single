package com.cloud.business.cfgSaleRate;


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
public class CfgSaleRateController{

	@Autowired
	private ICfgSaleRateService cfgSaleRateService;

	/**
	   * 添加信息
	   * @param CfgSaleRateBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:save')")
	@PostMapping("/api-business/cfgSaleRate/save")
	public void save(@RequestBody CfgSaleRateBOS  cfgSaleRateBOS)throws Exception{
		long id = this.cfgSaleRateService.save(cfgSaleRateBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param CfgSaleRateBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:saveList')")
	@PostMapping("/api-business/cfgSaleRate/saveList")
	public void saveList(@RequestBody List<CfgSaleRateBOS>  listCfgSaleRateBOS)throws Exception{
		long count = this.cfgSaleRateService.saveList(listCfgSaleRateBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param CfgSaleRateBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:update')")
	@PutMapping("/api-business/cfgSaleRate/update")
	public void update(@RequestBody CfgSaleRateBOU cfgSaleRateBOU)throws Exception{
		long count = this.cfgSaleRateService.update(cfgSaleRateBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<CfgSaleRateBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:updateList')")
	@PutMapping("/api-business/cfgSaleRate/updateList")
	public void updateList(@RequestBody List<CfgSaleRateBOU> listCfgSaleRateBOU)throws Exception{
		long count = this.cfgSaleRateService.updateList(listCfgSaleRateBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param CfgSaleRateBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:delete')")
	//@PutMapping("/api-business/cfgSaleRate/delete")   
	@DeleteMapping("/api-business/cfgSaleRate/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody CfgSaleRateBOD cfgSaleRateBOD
		CfgSaleRateBOD cfgSaleRateBOD = new CfgSaleRateBOD();
		cfgSaleRateBOD.setId(id);
		long count = this.cfgSaleRateService.delete(cfgSaleRateBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param CfgSaleRateQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:queryDetail')")
	@GetMapping("/api-business/cfgSaleRate/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  CfgSaleRateBOQ cfgSaleRateBOQ){
	public CfgSaleRateVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		CfgSaleRateBOQ cfgSaleRateBOQ = new CfgSaleRateBOQ();
		cfgSaleRateBOQ.setId(id);
		return this.cfgSaleRateService.queryDetail(cfgSaleRateBOQ);
	}
  
	/**
	 * 查询列表
	 * @param CfgSaleRateBOQ
	 * @return List<CfgSaleRateVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:queryList')")
	@GetMapping("/api-business/cfgSaleRate/queryList")
	public List<CfgSaleRateVO> queryList(@RequestBody(required=false) CfgSaleRateBOQ cfgSaleRateBOQ)throws Exception{
		return this.cfgSaleRateService.queryList(cfgSaleRateBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param CfgSaleRateBOQP
	 * @return	List<CfgSaleRateVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:queryListByPage')")
	@GetMapping("/api-business/cfgSaleRate/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) CfgSaleRateBOQP cfgSaleRateBOP){
	public PageQuery<CfgSaleRateVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		CfgSaleRateBOQP cfgSaleRateBOQP = JSON.parseObject(JSON.toJSONString(params), CfgSaleRateBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.cfgSaleRateService.queryListByPage(cfgSaleRateBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param CfgSaleRateBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:cfgSaleRate:queryCount')")
	@GetMapping("/api-business/cfgSaleRate/queryCount")
	public Long queryCount(CfgSaleRateBOQ cfgSaleRateBOQ)throws Exception{
		return this.cfgSaleRateService.queryCount(cfgSaleRateBOQ);
	}
	
	
	  
     

}