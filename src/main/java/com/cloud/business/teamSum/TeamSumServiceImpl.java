package com.cloud.business.teamSum;

/**
import com.cloud.business.TeamSum.TeamSumModel;
import com.cloud.business.TeamSum.TeamSumMapper;
import com.cloud.business.TeamSum.TeamSumService;
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
 * @date  2019-09-17 01:13:24
 */
@Slf4j
@Service
public class TeamSumServiceImpl implements ITeamSumService  {


	  @Autowired
	  private TeamSumMapper teamSumMapper;
  
  
     /**
	   * 新增
	   * @param TeamSumModel
	   * @return long
	 */
	  @Override
	  public long save(TeamSumBOS teamSumBOS) throws Exception{
	  	TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOS, TeamSumModel.class);
		int count = this.teamSumMapper.save(teamSumModel);
	    return teamSumModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<TeamSumBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<TeamSumBOS> listTeamSumBOS) throws Exception {
	  	List<TeamSumModel> listTeamSumModel = BeanConvertUtils.convertList(listTeamSumBOS, TeamSumModel.class);
		int count = this.teamSumMapper.saveList(listTeamSumModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param TeamSumBOQ
	   * @return TeamSumVO
	   */
	@Override
	public TeamSumVO queryDetail(TeamSumBOQ teamSumBOQ) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOQ, TeamSumModel.class);
		teamSumModel = this.teamSumMapper.queryDetail(teamSumModel);
		return BeanConvertUtils.convert(teamSumModel, TeamSumVO.class);
	}
  
	/**
	 * 
	 * @param TeamSumBOQ
	 * @return	List<TeamSumVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<TeamSumVO> queryList(TeamSumBOQ teamSumBOQ) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOQ, TeamSumModel.class);
		List<TeamSumModel> listTeamSumModel = this.teamSumMapper.queryList(teamSumModel);
		return  BeanConvertUtils.convertList(listTeamSumModel, TeamSumVO.class);
	}
	  
	
	/**
	 * 
	 * @param TeamSumBOQP
	 * @param page
	 * @return PageQuery<TeamSumVO>
	 */
	@Override
	public PageQuery<TeamSumVO> queryListByPage(TeamSumBOQP teamSumBOQP,PageInfo page) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOQP, TeamSumModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<TeamSumModel> queryListByPage = this.teamSumMapper.queryListByPage(teamSumModel);
		return  new PageQuery(queryListByPage, TeamSumVO.class);
	}
	
	
	  
	/**
	 *
	 * @param TeamSumBOU
	 * @return int
	 */
	@Override
	public int update(TeamSumBOU teamSumBOU) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOU, TeamSumModel.class);
		return this.teamSumMapper.update(teamSumModel);
	}
	
	
	/**
	 *
	 * @param List<TeamSumBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<TeamSumBOU> listTeamSumBOU) throws Exception{
		List<TeamSumModel> listTeamSumModel = BeanConvertUtils.convertList(listTeamSumBOU, TeamSumModel.class);
		return this.teamSumMapper.updateList(listTeamSumModel);
	}
	
	  
	 /**
	  * 
	  * @param TeamSumBOD
	  * @return int
	  */
	  @Override
	public int delete(TeamSumBOD teamSumBOD) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOD, TeamSumModel.class);
		return this.teamSumMapper.delete(teamSumModel);
	}
	
	/**
	  * 
	  * @param TeamSumBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(TeamSumBOQ teamSumBOQ) throws Exception{
		TeamSumModel teamSumModel = BeanConvertUtils.convert(teamSumBOQ, TeamSumModel.class);
		return this.teamSumMapper.queryCount(teamSumModel);
	}


	
}
