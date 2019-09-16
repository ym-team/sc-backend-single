package com.cloud.business.user;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.user.UserModel;



/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:27
 */
public interface IUserService {


	 /**
	   * 新增 用户表 信息
	   * @param UserBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(UserBOS  userBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<UserBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<UserBOS>  listUserBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param UserBOQ
	   * @return UserVO
	   * @throws Exception
	   */
	public UserVO queryDetail(UserBOQ userBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param UserBOQ
	 * @return List<UserVO>
	 * @throws Exception
	 */
	public List<UserVO> queryList(UserBOQ userBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param UserBOQP
	 * @return PageQuery<UserVO>
	 * @throws Exception
	 */
	public PageQuery<UserVO> queryListByPage(UserBOQP userBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param UserBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(UserBOU userBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<UserBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<UserBOU> listUserBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param UserBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(UserBOD userBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param UserBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(UserBOQ userBOQ)throws Exception;
	
	
	  

}
