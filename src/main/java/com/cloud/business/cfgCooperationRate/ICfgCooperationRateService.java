package com.cloud.business.cfgCooperationRate;


import java.util.List;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;


import com.cloud.business.cfgCooperationRate.CfgCooperationRateModel;



/**
 * <p>
 * 合作方提成表 服务类
 * </p>
 *
 * @author Michael
 * @since 2019-09-17 01:13:25
 */
public interface ICfgCooperationRateService {


	 /**
	   * 新增 合作方提成表 信息
	   * @param CfgCooperationRateBOS
	   * @return int
	   * @throws Exception
	   */
	public long save(CfgCooperationRateBOS  cfgCooperationRateBOS)throws Exception;
	
	

	/**
	   *批量新增
	   * @param List<CfgCooperationRateBOS>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(List<CfgCooperationRateBOS>  listCfgCooperationRateBOS)throws Exception;
	

  	 /**
	   * 查询详情
	   * @param CfgCooperationRateBOQ
	   * @return CfgCooperationRateVO
	   * @throws Exception
	   */
	public CfgCooperationRateVO queryDetail(CfgCooperationRateBOQ cfgCooperationRateBOQ)throws Exception;
  
	/**
	 * 查询列表
	 * @param CfgCooperationRateBOQ
	 * @return List<CfgCooperationRateVO>
	 * @throws Exception
	 */
	public List<CfgCooperationRateVO> queryList(CfgCooperationRateBOQ cfgCooperationRateBOQ)throws Exception;
	  
	  
	/**
	 * 分页查询列表
	 * @param CfgCooperationRateBOQP
	 * @return PageQuery<CfgCooperationRateVO>
	 * @throws Exception
	 */
	public PageQuery<CfgCooperationRateVO> queryListByPage(CfgCooperationRateBOQP cfgCooperationRateBOQP,PageInfo page)throws Exception;
	  
	  
	/**
	 * 更新
	 * @param CfgCooperationRateBOU
	 * @return int
	 * @throws Exception
	 */
	public int update(CfgCooperationRateBOU cfgCooperationRateBOU)throws Exception;
	
	
	/**
	 * 批量更新
	 * @param List<CfgCooperationRateBOU>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(List<CfgCooperationRateBOU> listCfgCooperationRateBOU)throws Exception;
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param CfgCooperationRateBOD
	  * @return int
	  * @throws Exception
	  */
	public int delete(CfgCooperationRateBOD cfgCooperationRateBOD)throws Exception;
	
	/**
	  * 根据入参条件查询 总数
	  * @param CfgCooperationRateBOQ
	  * @return Long
	  * @throws Exception
	  */
	public Long queryCount(CfgCooperationRateBOQ cfgCooperationRateBOQ)throws Exception;
	
	
	  

}
