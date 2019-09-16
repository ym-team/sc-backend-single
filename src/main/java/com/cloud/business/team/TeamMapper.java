package com.cloud.business.team;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:25
 */
@Mapper
public interface TeamMapper {

	 /**
	   * 新增  信息
	   * @param TeamModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("teamModel")TeamModel  teamModel);
	
	

	/**
	   *批量新增
	   * @param List<TeamModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listTeamModel")List<TeamModel>  listTeamModel);
	

  	 /**
	   * 查询详情
	   * @param TeamModel
	   * @return TeamModel
	   * @throws Exception
	   */
	public TeamModel queryDetail(@Param("teamModel")TeamModel teamModel);
  
	/**
	 * 查询列表
	 * @param TeamModel
	 * @return List<TeamModel>
	 * @throws Exception
	 */
	public List<TeamModel> queryList(@Param("teamModel")TeamModel teamModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param TeamModel
	 * @return Page<TeamModel>
	 * @throws Exception
	 */
	public Page<TeamModel> queryListByPage(@Param("teamModel")TeamModel teamModel);
	  
	  
	/**
	 * 更新
	 * @param TeamModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("teamModel")TeamModel teamModel);
	
	
	/**
	 * 批量更新
	 * @param List<TeamModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listTeamModel")List<TeamModel> listTeamModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param TeamModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("teamModel")TeamModel teamModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param TeamModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("teamModel")TeamModel teamModel);
	
	
	  

}