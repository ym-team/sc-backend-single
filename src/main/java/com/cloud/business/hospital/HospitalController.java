package com.cloud.business.hospital;


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
 * @date  2019-09-17 01:13:29
 */
@RestController
public class HospitalController{

	@Autowired
	private IHospitalService hospitalService;

	/**
	   * 添加信息
	   * @param HospitalBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:hospital:save')")
	@PostMapping("/api-business/hospital/save")
	public void save(@RequestBody HospitalBOS  hospitalBOS)throws Exception{
		long id = this.hospitalService.save(hospitalBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param HospitalBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:hospital:saveList')")
	@PostMapping("/api-business/hospital/saveList")
	public void saveList(@RequestBody List<HospitalBOS>  listHospitalBOS)throws Exception{
		long count = this.hospitalService.saveList(listHospitalBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param HospitalBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:hospital:update')")
	@PutMapping("/api-business/hospital/update")
	public void update(@RequestBody HospitalBOU hospitalBOU)throws Exception{
		long count = this.hospitalService.update(hospitalBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<HospitalBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:hospital:updateList')")
	@PutMapping("/api-business/hospital/updateList")
	public void updateList(@RequestBody List<HospitalBOU> listHospitalBOU)throws Exception{
		long count = this.hospitalService.updateList(listHospitalBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param HospitalBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:hospital:delete')")
	//@PutMapping("/api-business/hospital/delete")   
	@DeleteMapping("/api-business/hospital/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody HospitalBOD hospitalBOD
		HospitalBOD hospitalBOD = new HospitalBOD();
		hospitalBOD.setId(id);
		long count = this.hospitalService.delete(hospitalBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param HospitalQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:hospital:queryDetail')")
	@GetMapping("/api-business/hospital/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  HospitalBOQ hospitalBOQ){
	public HospitalVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		HospitalBOQ hospitalBOQ = new HospitalBOQ();
		hospitalBOQ.setId(id);
		return this.hospitalService.queryDetail(hospitalBOQ);
	}
  
	/**
	 * 查询列表
	 * @param HospitalBOQ
	 * @return List<HospitalVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:hospital:queryList')")
	@GetMapping("/api-business/hospital/queryList")
	public List<HospitalVO> queryList(@RequestBody(required=false) HospitalBOQ hospitalBOQ)throws Exception{
		return this.hospitalService.queryList(hospitalBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param HospitalBOQP
	 * @return	List<HospitalVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:hospital:queryListByPage')")
	@GetMapping("/api-business/hospital/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) HospitalBOQP hospitalBOP){
	public PageQuery<HospitalVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		HospitalBOQP hospitalBOQP = JSON.parseObject(JSON.toJSONString(params), HospitalBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.hospitalService.queryListByPage(hospitalBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param HospitalBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:hospital:queryCount')")
	@GetMapping("/api-business/hospital/queryCount")
	public Long queryCount(HospitalBOQ hospitalBOQ)throws Exception{
		return this.hospitalService.queryCount(hospitalBOQ);
	}
	
	
	  
     

}