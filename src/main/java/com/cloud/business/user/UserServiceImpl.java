package com.cloud.business.user;

/**
import com.cloud.business.User.UserModel;
import com.cloud.business.User.UserMapper;
import com.cloud.business.User.UserService;
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
 * @date  2019-09-17 01:13:27
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService  {


	  @Autowired
	  private UserMapper userMapper;
  
  
     /**
	   * 新增
	   * @param UserModel
	   * @return long
	 */
	  @Override
	  public long save(UserBOS userBOS) throws Exception{
	  	UserModel userModel = BeanConvertUtils.convert(userBOS, UserModel.class);
		int count = this.userMapper.save(userModel);
	    return userModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<UserBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<UserBOS> listUserBOS) throws Exception {
	  	List<UserModel> listUserModel = BeanConvertUtils.convertList(listUserBOS, UserModel.class);
		int count = this.userMapper.saveList(listUserModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param UserBOQ
	   * @return UserVO
	   */
	@Override
	public UserVO queryDetail(UserBOQ userBOQ) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOQ, UserModel.class);
		userModel = this.userMapper.queryDetail(userModel);
		return BeanConvertUtils.convert(userModel, UserVO.class);
	}
  
	/**
	 * 
	 * @param UserBOQ
	 * @return	List<UserVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<UserVO> queryList(UserBOQ userBOQ) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOQ, UserModel.class);
		List<UserModel> listUserModel = this.userMapper.queryList(userModel);
		return  BeanConvertUtils.convertList(listUserModel, UserVO.class);
	}
	  
	
	/**
	 * 
	 * @param UserBOQP
	 * @param page
	 * @return PageQuery<UserVO>
	 */
	@Override
	public PageQuery<UserVO> queryListByPage(UserBOQP userBOQP,PageInfo page) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOQP, UserModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<UserModel> queryListByPage = this.userMapper.queryListByPage(userModel);
		return  new PageQuery(queryListByPage, UserVO.class);
	}
	
	
	  
	/**
	 *
	 * @param UserBOU
	 * @return int
	 */
	@Override
	public int update(UserBOU userBOU) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOU, UserModel.class);
		return this.userMapper.update(userModel);
	}
	
	
	/**
	 *
	 * @param List<UserBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<UserBOU> listUserBOU) throws Exception{
		List<UserModel> listUserModel = BeanConvertUtils.convertList(listUserBOU, UserModel.class);
		return this.userMapper.updateList(listUserModel);
	}
	
	  
	 /**
	  * 
	  * @param UserBOD
	  * @return int
	  */
	  @Override
	public int delete(UserBOD userBOD) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOD, UserModel.class);
		return this.userMapper.delete(userModel);
	}
	
	/**
	  * 
	  * @param UserBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(UserBOQ userBOQ) throws Exception{
		UserModel userModel = BeanConvertUtils.convert(userBOQ, UserModel.class);
		return this.userMapper.queryCount(userModel);
	}


	
}
