package com.cloud.business.consumeDtl;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.consumeDtl.ConsumeDtlModel;



/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:26
 */
public interface IConsumeDtlService {


	 /**
	   * 新增  信息
	   * @param ConsumeDtlBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(ConsumeDtlBOS  consumeDtlBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<ConsumeDtlBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<ConsumeDtlBOS>  listConsumeDtlBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param ConsumeDtlBOQ
	   * @return ConsumeDtlVO
	   * @throws Exception
	   */
	public ConsumeDtlVO queryDetail(ConsumeDtlBOQ consumeDtlBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param ConsumeDtlBOQ
	 * @return List<ConsumeDtlVO>
	 * @throws Exception
	 */
	public List<ConsumeDtlVO> queryList(ConsumeDtlBOQ consumeDtlBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param ConsumeDtlBOQP
	 * @return PageQuery<ConsumeDtlVO>
	 * @throws Exception
	 */
	public PageQuery<ConsumeDtlVO> queryListByPage(ConsumeDtlBOQP consumeDtlBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param ConsumeDtlBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(ConsumeDtlBOU consumeDtlBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<ConsumeDtlBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<ConsumeDtlBOU> listConsumeDtlBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param ConsumeDtlBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(ConsumeDtlBOD consumeDtlBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param ConsumeDtlBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(ConsumeDtlBOQ consumeDtlBOQ)throws Exception;
	
	
	  

}
