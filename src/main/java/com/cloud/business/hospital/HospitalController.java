package com.cloud.business.hospital;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.cloud.util.BeanConvertUtils;
import com.cloud.util.LogAnnotation;
import com.cloud.util.Page;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;

@RestController
public class HospitalController {
	
	
	@Autowired
	private IHospitalService hospitalService;
	
	@LogAnnotation(module = "添加医院")
	@PreAuthorize("hasAuthority('back:hospital:save')")
	@PostMapping("/api-business/hospital/save")
	public void save(@RequestBody HospitalBOS hospitalBOS){
		long id = this.hospitalService.save(hospitalBOS);
		System.out.println("id:"+id);
		//TODO 应该是重定向      他们是把hospitalBO  返回去 
	}
	
	
	@LogAnnotation(module = "批量添加医院")
	@PreAuthorize("hasAuthority('back:hospital:saveList')")
	@PostMapping("/api-business/hospital/saveList")
	public void saveList(@RequestBody List<HospitalBOS> listHospitalBOS){
		long count = this.hospitalService.saveList(listHospitalBOS);
		//TODO 重定向
		
	}
	
	
	@LogAnnotation(module = "更新医院")
	@PreAuthorize("hasAuthority('back:hospital:update')")
	@PutMapping("/api-business/hospital/update")
	public void update(@RequestBody HospitalBOU hospitalBOU){
		long count = this.hospitalService.update(hospitalBOU);
		//应该是重定向  他们是把 hospitalBO 返回回去
	}
	
	
	@LogAnnotation(module = "批量更新医院")
	@PreAuthorize("hasAuthority('back:hospital:updateList')")
	@PutMapping("/api-business/hospital/updateList")
	public void updateList(@RequestBody List<HospitalBOU> listHospitalBOU){
		long count = this.hospitalService.updateList(listHospitalBOU);
		//应该是重定向  他们是把 hospitalBO 返回回去
	}
	
	
	@LogAnnotation(module = "删除医院")
	@PreAuthorize("hasAuthority('back:hospital:delete')")
	//@PutMapping("/api-business/hospital/delete")   
	@DeleteMapping("/api-business/hospital/delete/{id}") 
	public void delete( @PathVariable Long id){  //@RequestBody HospitalBOD hospitalBOD
		HospitalBOD hospitalBOD = new HospitalBOD();
		hospitalBOD.setId(id);
		long count = this.hospitalService.delete(hospitalBOD);
	}
	
	@LogAnnotation(module = "查询医院详情")
	@PreAuthorize("hasAuthority('back:hospital:queryDetail')")
	@GetMapping("/api-business/hospital/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false) HospitalBOQ hospitalBOQ){
	public HospitalVO queryDetail(@RequestParam(required=false, defaultValue="1") long id){
		HospitalBOQ hospitalBOQ = new HospitalBOQ();
		hospitalBOQ.setId(id);
		return this.hospitalService.queryDetail(hospitalBOQ);
	}
	
	
	@LogAnnotation(module = "查询医院列表")
	@PreAuthorize("hasAuthority('back:hospital:queryList')")
	@GetMapping("/api-business/hospital/queryList")
	public List<HospitalVO> queryList(@RequestBody(required=false) HospitalBOQ hospitalBO){
		return this.hospitalService.queryList(hospitalBO);
	}
	
	
	@LogAnnotation(module = "分页查询医院列表")
	@PreAuthorize("hasAuthority('back:hospital:queryListByPage')")
	@GetMapping("/api-business/hospital/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) HospitalBOQP hospitalBOP){
	public PageQuery<HospitalVO> queryListByPage(@RequestParam Map<String, Object> params){
		HospitalBOQP hospitalBOP = JSON.parseObject(JSON.toJSONString(params), HospitalBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.hospitalService.queryListByPage(hospitalBOP,pageInfo);
	}
	
	
	
	@LogAnnotation(module = "查询医院总数")
	@PreAuthorize("hasAuthority('back:hospital:queryCount')")
	@GetMapping("/api-business/hospital/queryCount")
	public long queryCount(@RequestBody HospitalBOQ hospitalBO){
		return this.hospitalService.queryCount(hospitalBO);
	}
}
