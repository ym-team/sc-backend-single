package com.cloud.business.teamSum;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 
 *
 * @author Michael
 * @date 2019-09-17 01:13:24
 */
@Mapper
public interface TeamSumMapper {

	 /**
	   * 新增  信息
	   * @param TeamSumModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("teamSumModel")TeamSumModel  teamSumModel);
	
	

	/**
	   *批量新增
	   * @param List<TeamSumModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listTeamSumModel")List<TeamSumModel>  listTeamSumModel);
	

  	 /**
	   * 查询详情
	   * @param TeamSumModel
	   * @return TeamSumModel
	   * @throws Exception
	   */
	public TeamSumModel queryDetail(@Param("teamSumModel")TeamSumModel teamSumModel);
  
	/**
	 * 查询列表
	 * @param TeamSumModel
	 * @return List<TeamSumModel>
	 * @throws Exception
	 */
	public List<TeamSumModel> queryList(@Param("teamSumModel")TeamSumModel teamSumModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param TeamSumModel
	 * @return Page<TeamSumModel>
	 * @throws Exception
	 */
	public Page<TeamSumModel> queryListByPage(@Param("teamSumModel")TeamSumModel teamSumModel);
	  
	  
	/**
	 * 更新
	 * @param TeamSumModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("teamSumModel")TeamSumModel teamSumModel);
	
	
	/**
	 * 批量更新
	 * @param List<TeamSumModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listTeamSumModel")List<TeamSumModel> listTeamSumModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param TeamSumModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("teamSumModel")TeamSumModel teamSumModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param TeamSumModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("teamSumModel")TeamSumModel teamSumModel);
	
	
	  

}