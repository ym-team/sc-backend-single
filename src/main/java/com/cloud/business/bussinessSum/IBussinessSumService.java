package com.cloud.business.bussinessSum;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.bussinessSum.BussinessSumModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:24
 */
public interface IBussinessSumService {


	 /**
	   * 新增  信息
	   * @param BussinessSumBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(BussinessSumBOS  bussinessSumBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<BussinessSumBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<BussinessSumBOS>  listBussinessSumBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param BussinessSumBOQ
	   * @return BussinessSumVO
	   * @throws Exception
	   */
	public BussinessSumVO queryDetail(BussinessSumBOQ bussinessSumBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param BussinessSumBOQ
	 * @return List<BussinessSumVO>
	 * @throws Exception
	 */
	public List<BussinessSumVO> queryList(BussinessSumBOQ bussinessSumBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param BussinessSumBOQP
	 * @return PageQuery<BussinessSumVO>
	 * @throws Exception
	 */
	public PageQuery<BussinessSumVO> queryListByPage(BussinessSumBOQP bussinessSumBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param BussinessSumBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(BussinessSumBOU bussinessSumBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<BussinessSumBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<BussinessSumBOU> listBussinessSumBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param BussinessSumBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(BussinessSumBOD bussinessSumBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param BussinessSumBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(BussinessSumBOQ bussinessSumBOQ)throws Exception;
	
	
	  

}
