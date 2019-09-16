package com.cloud.business.teamSum;


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
 * @date  2019-09-17 01:13:24
 */
@RestController
public class TeamSumController{

	@Autowired
	private ITeamSumService teamSumService;

	/**
	   * 添加信息
	   * @param TeamSumBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:teamSum:save')")
	@PostMapping("/api-business/teamSum/save")
	public void save(@RequestBody TeamSumBOS  teamSumBOS)throws Exception{
		long id = this.teamSumService.save(teamSumBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param TeamSumBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:teamSum:saveList')")
	@PostMapping("/api-business/teamSum/saveList")
	public void saveList(@RequestBody List<TeamSumBOS>  listTeamSumBOS)throws Exception{
		long count = this.teamSumService.saveList(listTeamSumBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param TeamSumBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:teamSum:update')")
	@PutMapping("/api-business/teamSum/update")
	public void update(@RequestBody TeamSumBOU teamSumBOU)throws Exception{
		long count = this.teamSumService.update(teamSumBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<TeamSumBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:teamSum:updateList')")
	@PutMapping("/api-business/teamSum/updateList")
	public void updateList(@RequestBody List<TeamSumBOU> listTeamSumBOU)throws Exception{
		long count = this.teamSumService.updateList(listTeamSumBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param TeamSumBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:teamSum:delete')")
	//@PutMapping("/api-business/teamSum/delete")   
	@DeleteMapping("/api-business/teamSum/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody TeamSumBOD teamSumBOD
		TeamSumBOD teamSumBOD = new TeamSumBOD();
		teamSumBOD.setId(id);
		long count = this.teamSumService.delete(teamSumBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param TeamSumQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:teamSum:queryDetail')")
	@GetMapping("/api-business/teamSum/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  TeamSumBOQ teamSumBOQ){
	public TeamSumVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		TeamSumBOQ teamSumBOQ = new TeamSumBOQ();
		teamSumBOQ.setId(id);
		return this.teamSumService.queryDetail(teamSumBOQ);
	}
  
	/**
	 * 查询列表
	 * @param TeamSumBOQ
	 * @return List<TeamSumVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:teamSum:queryList')")
	@GetMapping("/api-business/teamSum/queryList")
	public List<TeamSumVO> queryList(@RequestBody(required=false) TeamSumBOQ teamSumBOQ)throws Exception{
		return this.teamSumService.queryList(teamSumBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param TeamSumBOQP
	 * @return	List<TeamSumVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:teamSum:queryListByPage')")
	@GetMapping("/api-business/teamSum/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) TeamSumBOQP teamSumBOP){
	public PageQuery<TeamSumVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		TeamSumBOQP teamSumBOQP = JSON.parseObject(JSON.toJSONString(params), TeamSumBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.teamSumService.queryListByPage(teamSumBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param TeamSumBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:teamSum:queryCount')")
	@GetMapping("/api-business/teamSum/queryCount")
	public Long queryCount(TeamSumBOQ teamSumBOQ)throws Exception{
		return this.teamSumService.queryCount(teamSumBOQ);
	}
	
	
	  
     

}