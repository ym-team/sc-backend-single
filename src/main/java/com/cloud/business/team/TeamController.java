package com.cloud.business.team;


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
public class TeamController{

	@Autowired
	private ITeamService teamService;

	/**
	   * 添加信息
	   * @param TeamBOS
	   * @return long
	   * @throws Exception
	   */
	@LogAnnotation(module = " 添加信息")
	@PreAuthorize("hasAuthority('back:team:save')")
	@PostMapping("/api-business/team/save")
	public void save(@RequestBody TeamBOS  teamBOS)throws Exception{
		long id = this.teamService.save(teamBOS);
	}
	
	
	

	/**
	   * 批量添加信息
	   * @param TeamBOS
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "批量添加信息")
	@PreAuthorize("hasAuthority('back:team:saveList')")
	@PostMapping("/api-business/team/saveList")
	public void saveList(@RequestBody List<TeamBOS>  listTeamBOS)throws Exception{
		long count = this.teamService.saveList(listTeamBOS);
	}
	
	
	
	/**
	 * 更新信息
	 * @param TeamBOU
	 * @throws Exception
	 */
	@LogAnnotation(module = "更新信息")
	@PreAuthorize("hasAuthority('back:team:update')")
	@PutMapping("/api-business/team/update")
	public void update(@RequestBody TeamBOU teamBOU)throws Exception{
		long count = this.teamService.update(teamBOU);
	}
	
	/**
	 * 批量更新信息
	 * @param List<TeamBOU>
	 * @throws Exception
	 */
	@LogAnnotation(module = "批量更新")
	@PreAuthorize("hasAuthority('back:team:updateList')")
	@PutMapping("/api-business/team/updateList")
	public void updateList(@RequestBody List<TeamBOU> listTeamBOU)throws Exception{
		long count = this.teamService.updateList(listTeamBOU);
	}
	  
	  
	 /**
	  *删除信息
	  * @param TeamBOD
	  * @throws Exception
	  */
	@LogAnnotation(module = "删除信息")
	@PreAuthorize("hasAuthority('back:team:delete')")
	//@PutMapping("/api-business/team/delete")   
	@DeleteMapping("/api-business/team/delete/{id}") 
	public void delete(@PathVariable Long id)throws Exception{	 //@RequestBody TeamBOD teamBOD
		TeamBOD teamBOD = new TeamBOD();
		teamBOD.setId(id);
		long count = this.teamService.delete(teamBOD);
	}
	
	

  	 /**
	   * 查询详情信息
	   * @param TeamQueryVo
	   * @return
	   * @throws Exception
	   */
	@LogAnnotation(module = "查询详情信息")
	@PreAuthorize("hasAuthority('back:team:queryDetail')")
	@GetMapping("/api-business/team/queryDetail")
	//public HospitalVO queryDetail(@RequestBody(required=false)  TeamBOQ teamBOQ){
	public TeamVO queryDetail(@RequestParam(required=false) long id)throws Exception{
		TeamBOQ teamBOQ = new TeamBOQ();
		teamBOQ.setId(id);
		return this.teamService.queryDetail(teamBOQ);
	}
  
	/**
	 * 查询列表
	 * @param TeamBOQ
	 * @return List<TeamVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "查询列表")
	@PreAuthorize("hasAuthority('back:team:queryList')")
	@GetMapping("/api-business/team/queryList")
	public List<TeamVO> queryList(@RequestBody(required=false) TeamBOQ teamBOQ)throws Exception{
		return this.teamService.queryList(teamBOQ);
	}
	  
	/**
	 * 分页查询列表
	 * @param TeamBOQP
	 * @return	List<TeamVO>
	 * @throws Exception
	 */
	@LogAnnotation(module = "分页查询列表")
	@PreAuthorize("hasAuthority('back:team:queryListByPage')")
	@GetMapping("/api-business/team/queryListByPage")	
	//public PageQuery<HospitalVO> queryListByPage(@RequestBody(required=false) TeamBOQP teamBOP){
	public PageQuery<TeamVO> queryListByPage(@RequestParam Map<String, Object> params)throws Exception{
		TeamBOQP teamBOQP = JSON.parseObject(JSON.toJSONString(params), TeamBOQP.class);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
		pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
		return this.teamService.queryListByPage(teamBOQP,pageInfo);
	}
	  

	/**
	  * 查询总数
	  * @param TeamBOQ
	  * @return Long
	  * @throws Exception
	  */
	@LogAnnotation(module = "查询总数")
	@PreAuthorize("hasAuthority('back:team:queryCount')")
	@GetMapping("/api-business/team/queryCount")
	public Long queryCount(TeamBOQ teamBOQ)throws Exception{
		return this.teamService.queryCount(teamBOQ);
	}
	
	
	  
     

}