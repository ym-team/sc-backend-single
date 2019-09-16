package com.cloud.business.cfgSaleRate;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.cfgSaleRate.CfgSaleRateModel;



/**
 * <p>
 * 业务员/团队提成配置表 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:25
 */
public interface ICfgSaleRateService {


	 /**
	   * 新增 业务员/团队提成配置表 信息
	   * @param CfgSaleRateBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CfgSaleRateBOS  cfgSaleRateBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CfgSaleRateBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CfgSaleRateBOS>  listCfgSaleRateBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CfgSaleRateBOQ
	   * @return CfgSaleRateVO
	   * @throws Exception
	   */
	public CfgSaleRateVO queryDetail(CfgSaleRateBOQ cfgSaleRateBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CfgSaleRateBOQ
	 * @return List<CfgSaleRateVO>
	 * @throws Exception
	 */
	public List<CfgSaleRateVO> queryList(CfgSaleRateBOQ cfgSaleRateBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CfgSaleRateBOQP
	 * @return PageQuery<CfgSaleRateVO>
	 * @throws Exception
	 */
	public PageQuery<CfgSaleRateVO> queryListByPage(CfgSaleRateBOQP cfgSaleRateBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CfgSaleRateBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CfgSaleRateBOU cfgSaleRateBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CfgSaleRateBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CfgSaleRateBOU> listCfgSaleRateBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CfgSaleRateBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CfgSaleRateBOD cfgSaleRateBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CfgSaleRateBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CfgSaleRateBOQ cfgSaleRateBOQ)throws Exception;
	
	
	  

}
