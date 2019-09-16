package com.cloud.business.cusconsumer;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.cusconsumer.CusconsumerModel;



/**
 * <p>
 * 顾客信息 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:26
 */
public interface ICusconsumerService {


	 /**
	   * 新增 顾客信息 信息
	   * @param CusconsumerBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CusconsumerBOS  cusconsumerBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CusconsumerBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CusconsumerBOS>  listCusconsumerBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CusconsumerBOQ
	   * @return CusconsumerVO
	   * @throws Exception
	   */
	public CusconsumerVO queryDetail(CusconsumerBOQ cusconsumerBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CusconsumerBOQ
	 * @return List<CusconsumerVO>
	 * @throws Exception
	 */
	public List<CusconsumerVO> queryList(CusconsumerBOQ cusconsumerBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CusconsumerBOQP
	 * @return PageQuery<CusconsumerVO>
	 * @throws Exception
	 */
	public PageQuery<CusconsumerVO> queryListByPage(CusconsumerBOQP cusconsumerBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CusconsumerBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CusconsumerBOU cusconsumerBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CusconsumerBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CusconsumerBOU> listCusconsumerBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CusconsumerBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CusconsumerBOD cusconsumerBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CusconsumerBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CusconsumerBOQ cusconsumerBOQ)throws Exception;
	
	
	  

}
