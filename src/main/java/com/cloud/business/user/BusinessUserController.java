package com.cloud.business.user;


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
public class BusinessUserController{

	@Autowired
	private IUserService userService;

	/**
	   * 添加信息
	   * @param UserBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:user:save')")
	@PostMapping("/api-business/user/save")
	public void save(@RequestBody UserBOS  userBOS)throws Exception{
		long id = this.userService.save(userBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param UserBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:user:saveList')")
	@PostMapping("/api-business/user/saveList")
	public void saveList(@RequestBody List<UserBOS>  listUserBOS)throws Exception{
		long count = this.userService.saveList(listUserBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param UserBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:user:businessupdate')")
	@PutMapping("/api-business/user/businessupdate")
	public void update(@RequestBody UserBOU userBOU)throws Exception{
		long count = this.userService.update(userBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<UserBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:user:updateList')")
	@PutMapping("/api-business/user/updateList")
	public void updateList(@RequestBody List<UserBOU> listUserBOU)throws Exception{
		long count = this.userService.updateList(listUserBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param UserBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:user:delete')")
	//@PutMapping("/api-business/user/delete")   
	@DeleteMapping("/api-business/user/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody UserBOD userBOD
		UserBOD userBOD = new UserBOD();
		userBOD.setId(id);
		long count = this.userService.delete(userBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param UserQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:user:queryDetail')")
	@GetMapping("/api-business/user/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  UserBOQ userBOQ){
	public UserVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		UserBOQ userBOQ = new UserBOQ();
		userBOQ.setId(id);
		return this.userService.queryDetail(userBOQ);
	}
  
	/**
	 * 查询列表
	 * @param UserBOQ
	 * @return List<UserVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:user:queryList')")
	@GetMapping("/api-business/user/queryList")
	public List<UserVO> queryList(@RequestBody(required=false) UserBOQ userBOQ)throws Exception{
		return this.userService.queryList(userBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param UserBOQP
	 * @return	List<UserVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:user:queryListByPage')")
	@GetMapping("/api-business/user/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) UserBOQP userBOP){
	public PageQuery<UserVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		UserBOQP userBOQP = JSON.parseObject(JSON.toJSONString(params), UserBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.userService.queryListByPage(userBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param UserBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:user:queryCount')")
	@GetMapping("/api-business/user/queryCount")
	public Long queryCount(UserBOQ userBOQ)throws Exception{
		return this.userService.queryCount(userBOQ);
	}
	
	
	  
     

}