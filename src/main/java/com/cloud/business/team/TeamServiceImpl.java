package com.cloud.business.team;

/**
import com.cloud.business.Team.TeamModel;
import com.cloud.business.Team.TeamMapper;
import com.cloud.business.Team.TeamService;
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.util.BeanConvertUtils;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * ${comments} 服务实现类
 * </p>
 
 *
 * @author Michael
 * @date  2019-09-17 01:13:25
 */
@Slf4j
@Service
public class TeamServiceImpl implements ITeamService  {


	  @Autowired
	  private TeamMapper teamMapper;
  
  
     /**
	   * 新增
	   * @param TeamModel
	   * @return long
	 */
	  @Override
	  public long save(TeamBOS teamBOS) throws Exception{
	  	TeamModel teamModel = BeanConvertUtils.convert(teamBOS, TeamModel.class);
		int count = this.teamMapper.save(teamModel);
	    return teamModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<TeamBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<TeamBOS> listTeamBOS) throws Exception {
	  	List<TeamModel> listTeamModel = BeanConvertUtils.convertList(listTeamBOS, TeamModel.class);
		int count = this.teamMapper.saveList(listTeamModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param TeamBOQ
	   * @return TeamVO
	   */
	@Override
	public TeamVO queryDetail(TeamBOQ teamBOQ) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOQ, TeamModel.class);
		teamModel = this.teamMapper.queryDetail(teamModel);
		return BeanConvertUtils.convert(teamModel, TeamVO.class);
	}
  
	/**
	 * 
	 * @param TeamBOQ
	 * @return	List<TeamVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<TeamVO> queryList(TeamBOQ teamBOQ) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOQ, TeamModel.class);
		List<TeamModel> listTeamModel = this.teamMapper.queryList(teamModel);
		return  BeanConvertUtils.convertList(listTeamModel, TeamVO.class);
	}
	  
	
	/**
	 * 
	 * @param TeamBOQP
	 * @param page
	 * @return PageQuery<TeamVO>
	 */
	@Override
	public PageQuery<TeamVO> queryListByPage(TeamBOQP teamBOQP,PageInfo page) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOQP, TeamModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<TeamModel> queryListByPage = this.teamMapper.queryListByPage(teamModel);
		return  new PageQuery(queryListByPage, TeamVO.class);
	}
	
	
	  
	/**
	 *
	 * @param TeamBOU
	 * @return int
	 */
	@Override
	public int update(TeamBOU teamBOU) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOU, TeamModel.class);
		return this.teamMapper.update(teamModel);
	}
	
	
	/**
	 *
	 * @param List<TeamBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<TeamBOU> listTeamBOU) throws Exception{
		List<TeamModel> listTeamModel = BeanConvertUtils.convertList(listTeamBOU, TeamModel.class);
		return this.teamMapper.updateList(listTeamModel);
	}
	
	  
	 /**
	  * 
	  * @param TeamBOD
	  * @return int
	  */
	  @Override
	public int delete(TeamBOD teamBOD) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOD, TeamModel.class);
		return this.teamMapper.delete(teamModel);
	}
	
	/**
	  * 
	  * @param TeamBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(TeamBOQ teamBOQ) throws Exception{
		TeamModel teamModel = BeanConvertUtils.convert(teamBOQ, TeamModel.class);
		return this.teamMapper.queryCount(teamModel);
	}


	
}
