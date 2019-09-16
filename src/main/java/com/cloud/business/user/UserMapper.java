package com.cloud.business.user;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 用户表
 *
 * @author Michael
 * @date 2019-09-17 01:13:27
 */
@Mapper
public interface UserMapper {

	 /**
	   * 新增 用户表 信息
	   * @param UserModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("userModel")UserModel  userModel);
	
	

	/**
	   *批量新增
	   * @param List<UserModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listUserModel")List<UserModel>  listUserModel);
	

  	 /**
	   * 查询详情
	   * @param UserModel
	   * @return UserModel
	   * @throws Exception
	   */
	public UserModel queryDetail(@Param("userModel")UserModel userModel);
  
	/**
	 * 查询列表
	 * @param UserModel
	 * @return List<UserModel>
	 * @throws Exception
	 */
	public List<UserModel> queryList(@Param("userModel")UserModel userModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param UserModel
	 * @return Page<UserModel>
	 * @throws Exception
	 */
	public Page<UserModel> queryListByPage(@Param("userModel")UserModel userModel);
	  
	  
	/**
	 * 更新
	 * @param UserModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("userModel")UserModel userModel);
	
	
	/**
	 * 批量更新
	 * @param List<UserModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listUserModel")List<UserModel> listUserModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param UserModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("userModel")UserModel userModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param UserModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("userModel")UserModel userModel);
	
	
	  

}