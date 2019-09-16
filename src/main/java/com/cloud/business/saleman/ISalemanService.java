package com.cloud.business.saleman;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.saleman.SalemanModel;



/**
 * <p>
 * 业务员表 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:27
 */
public interface ISalemanService {


	 /**
	   * 新增 业务员表 信息
	   * @param SalemanBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(SalemanBOS  salemanBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<SalemanBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<SalemanBOS>  listSalemanBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param SalemanBOQ
	   * @return SalemanVO
	   * @throws Exception
	   */
	public SalemanVO queryDetail(SalemanBOQ salemanBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param SalemanBOQ
	 * @return List<SalemanVO>
	 * @throws Exception
	 */
	public List<SalemanVO> queryList(SalemanBOQ salemanBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param SalemanBOQP
	 * @return PageQuery<SalemanVO>
	 * @throws Exception
	 */
	public PageQuery<SalemanVO> queryListByPage(SalemanBOQP salemanBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param SalemanBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(SalemanBOU salemanBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<SalemanBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<SalemanBOU> listSalemanBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param SalemanBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(SalemanBOD salemanBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param SalemanBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(SalemanBOQ salemanBOQ)throws Exception;
	
	
	  

}
