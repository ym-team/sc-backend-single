package com.cloud.business.cfgSaleRate;

/**
import com.cloud.business.CfgSaleRate.CfgSaleRateModel;
import com.cloud.business.CfgSaleRate.CfgSaleRateMapper;
import com.cloud.business.CfgSaleRate.CfgSaleRateService;
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
 * @date  2019-09-17 01:13:25
 */
@Slf4j
@Service
public class CfgSaleRateServiceImpl implements ICfgSaleRateService  {


	  @Autowired
	  private CfgSaleRateMapper cfgSaleRateMapper;
  
  
     /**
	   * 新增
	   * @param CfgSaleRateModel
	   * @return long
	 */
	  @Override
	  public long save(CfgSaleRateBOS cfgSaleRateBOS) throws Exception{
	  	CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOS, CfgSaleRateModel.class);
		int count = this.cfgSaleRateMapper.save(cfgSaleRateModel);
	    return cfgSaleRateModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<CfgSaleRateBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<CfgSaleRateBOS> listCfgSaleRateBOS) throws Exception {
	  	List<CfgSaleRateModel> listCfgSaleRateModel = BeanConvertUtils.convertList(listCfgSaleRateBOS, CfgSaleRateModel.class);
		int count = this.cfgSaleRateMapper.saveList(listCfgSaleRateModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param CfgSaleRateBOQ
	   * @return CfgSaleRateVO
	   */
	@Override
	public CfgSaleRateVO queryDetail(CfgSaleRateBOQ cfgSaleRateBOQ) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOQ, CfgSaleRateModel.class);
		cfgSaleRateModel = this.cfgSaleRateMapper.queryDetail(cfgSaleRateModel);
		return BeanConvertUtils.convert(cfgSaleRateModel, CfgSaleRateVO.class);
	}
  
	/**
	 * 
	 * @param CfgSaleRateBOQ
	 * @return	List<CfgSaleRateVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<CfgSaleRateVO> queryList(CfgSaleRateBOQ cfgSaleRateBOQ) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOQ, CfgSaleRateModel.class);
		List<CfgSaleRateModel> listCfgSaleRateModel = this.cfgSaleRateMapper.queryList(cfgSaleRateModel);
		return  BeanConvertUtils.convertList(listCfgSaleRateModel, CfgSaleRateVO.class);
	}
	  
	
	/**
	 * 
	 * @param CfgSaleRateBOQP
	 * @param page
	 * @return PageQuery<CfgSaleRateVO>
	 */
	@Override
	public PageQuery<CfgSaleRateVO> queryListByPage(CfgSaleRateBOQP cfgSaleRateBOQP,PageInfo page) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOQP, CfgSaleRateModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<CfgSaleRateModel> queryListByPage = this.cfgSaleRateMapper.queryListByPage(cfgSaleRateModel);
		return  new PageQuery(queryListByPage, CfgSaleRateVO.class);
	}
	
	
	  
	/**
	 *
	 * @param CfgSaleRateBOU
	 * @return int
	 */
	@Override
	public int update(CfgSaleRateBOU cfgSaleRateBOU) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOU, CfgSaleRateModel.class);
		return this.cfgSaleRateMapper.update(cfgSaleRateModel);
	}
	
	
	/**
	 *
	 * @param List<CfgSaleRateBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<CfgSaleRateBOU> listCfgSaleRateBOU) throws Exception{
		List<CfgSaleRateModel> listCfgSaleRateModel = BeanConvertUtils.convertList(listCfgSaleRateBOU, CfgSaleRateModel.class);
		return this.cfgSaleRateMapper.updateList(listCfgSaleRateModel);
	}
	
	  
	 /**
	  * 
	  * @param CfgSaleRateBOD
	  * @return int
	  */
	  @Override
	public int delete(CfgSaleRateBOD cfgSaleRateBOD) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOD, CfgSaleRateModel.class);
		return this.cfgSaleRateMapper.delete(cfgSaleRateModel);
	}
	
	/**
	  * 
	  * @param CfgSaleRateBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(CfgSaleRateBOQ cfgSaleRateBOQ) throws Exception{
		CfgSaleRateModel cfgSaleRateModel = BeanConvertUtils.convert(cfgSaleRateBOQ, CfgSaleRateModel.class);
		return this.cfgSaleRateMapper.queryCount(cfgSaleRateModel);
	}


	
}
