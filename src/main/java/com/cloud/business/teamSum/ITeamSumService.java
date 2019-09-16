package com.cloud.business.teamSum;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.teamSum.TeamSumModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:24
 */
public interface ITeamSumService {


	 /**
	   * 新增  信息
	   * @param TeamSumBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(TeamSumBOS  teamSumBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<TeamSumBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<TeamSumBOS>  listTeamSumBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param TeamSumBOQ
	   * @return TeamSumVO
	   * @throws Exception
	   */
	public TeamSumVO queryDetail(TeamSumBOQ teamSumBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param TeamSumBOQ
	 * @return List<TeamSumVO>
	 * @throws Exception
	 */
	public List<TeamSumVO> queryList(TeamSumBOQ teamSumBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param TeamSumBOQP
	 * @return PageQuery<TeamSumVO>
	 * @throws Exception
	 */
	public PageQuery<TeamSumVO> queryListByPage(TeamSumBOQP teamSumBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param TeamSumBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(TeamSumBOU teamSumBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<TeamSumBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<TeamSumBOU> listTeamSumBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param TeamSumBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(TeamSumBOD teamSumBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param TeamSumBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(TeamSumBOQ teamSumBOQ)throws Exception;
	
	
	  

}
