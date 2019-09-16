package com.cloud.business.team;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.team.TeamModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:25
 */
public interface ITeamService {


	 /**
	   * 新增  信息
	   * @param TeamBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(TeamBOS  teamBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<TeamBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<TeamBOS>  listTeamBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param TeamBOQ
	   * @return TeamVO
	   * @throws Exception
	   */
	public TeamVO queryDetail(TeamBOQ teamBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param TeamBOQ
	 * @return List<TeamVO>
	 * @throws Exception
	 */
	public List<TeamVO> queryList(TeamBOQ teamBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param TeamBOQP
	 * @return PageQuery<TeamVO>
	 * @throws Exception
	 */
	public PageQuery<TeamVO> queryListByPage(TeamBOQP teamBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param TeamBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(TeamBOU teamBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<TeamBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<TeamBOU> listTeamBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param TeamBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(TeamBOD teamBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param TeamBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(TeamBOQ teamBOQ)throws Exception;
	
	
	  

}
