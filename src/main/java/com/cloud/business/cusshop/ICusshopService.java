package com.cloud.business.cusshop;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.cusshop.CusshopModel;



/**
 * <p>
 * 店面入驻 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:26
 */
public interface ICusshopService {


	 /**
	   * 新增 店面入驻 信息
	   * @param CusshopBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CusshopBOS  cusshopBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CusshopBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CusshopBOS>  listCusshopBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CusshopBOQ
	   * @return CusshopVO
	   * @throws Exception
	   */
	public CusshopVO queryDetail(CusshopBOQ cusshopBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CusshopBOQ
	 * @return List<CusshopVO>
	 * @throws Exception
	 */
	public List<CusshopVO> queryList(CusshopBOQ cusshopBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CusshopBOQP
	 * @return PageQuery<CusshopVO>
	 * @throws Exception
	 */
	public PageQuery<CusshopVO> queryListByPage(CusshopBOQP cusshopBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CusshopBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CusshopBOU cusshopBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CusshopBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CusshopBOU> listCusshopBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CusshopBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CusshopBOD cusshopBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CusshopBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CusshopBOQ cusshopBOQ)throws Exception;
	
	
	  

}
