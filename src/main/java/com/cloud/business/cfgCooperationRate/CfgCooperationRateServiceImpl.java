package com.cloud.business.cfgCooperationRate;

/**
import com.cloud.business.CfgCooperationRate.CfgCooperationRateModel;
import com.cloud.business.CfgCooperationRate.CfgCooperationRateMapper;
import com.cloud.business.CfgCooperationRate.CfgCooperationRateService;
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
public class CfgCooperationRateServiceImpl implements ICfgCooperationRateService  {


	  @Autowired
	  private CfgCooperationRateMapper cfgCooperationRateMapper;
  
  
     /**
	   * 新增
	   * @param CfgCooperationRateModel
	   * @return long
	 */
	  @Override
	  public long save(CfgCooperationRateBOS cfgCooperationRateBOS) throws Exception{
	  	CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOS, CfgCooperationRateModel.class);
		int count = this.cfgCooperationRateMapper.save(cfgCooperationRateModel);
	    return cfgCooperationRateModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<CfgCooperationRateBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<CfgCooperationRateBOS> listCfgCooperationRateBOS) throws Exception {
	  	List<CfgCooperationRateModel> listCfgCooperationRateModel = BeanConvertUtils.convertList(listCfgCooperationRateBOS, CfgCooperationRateModel.class);
		int count = this.cfgCooperationRateMapper.saveList(listCfgCooperationRateModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param CfgCooperationRateBOQ
	   * @return CfgCooperationRateVO
	   */
	@Override
	public CfgCooperationRateVO queryDetail(CfgCooperationRateBOQ cfgCooperationRateBOQ) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOQ, CfgCooperationRateModel.class);
		cfgCooperationRateModel = this.cfgCooperationRateMapper.queryDetail(cfgCooperationRateModel);
		return BeanConvertUtils.convert(cfgCooperationRateModel, CfgCooperationRateVO.class);
	}
  
	/**
	 * 
	 * @param CfgCooperationRateBOQ
	 * @return	List<CfgCooperationRateVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<CfgCooperationRateVO> queryList(CfgCooperationRateBOQ cfgCooperationRateBOQ) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOQ, CfgCooperationRateModel.class);
		List<CfgCooperationRateModel> listCfgCooperationRateModel = this.cfgCooperationRateMapper.queryList(cfgCooperationRateModel);
		return  BeanConvertUtils.convertList(listCfgCooperationRateModel, CfgCooperationRateVO.class);
	}
	  
	
	/**
	 * 
	 * @param CfgCooperationRateBOQP
	 * @param page
	 * @return PageQuery<CfgCooperationRateVO>
	 */
	@Override
	public PageQuery<CfgCooperationRateVO> queryListByPage(CfgCooperationRateBOQP cfgCooperationRateBOQP,PageInfo page) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOQP, CfgCooperationRateModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<CfgCooperationRateModel> queryListByPage = this.cfgCooperationRateMapper.queryListByPage(cfgCooperationRateModel);
		return  new PageQuery(queryListByPage, CfgCooperationRateVO.class);
	}
	
	
	  
	/**
	 *
	 * @param CfgCooperationRateBOU
	 * @return int
	 */
	@Override
	public int update(CfgCooperationRateBOU cfgCooperationRateBOU) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOU, CfgCooperationRateModel.class);
		return this.cfgCooperationRateMapper.update(cfgCooperationRateModel);
	}
	
	
	/**
	 *
	 * @param List<CfgCooperationRateBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<CfgCooperationRateBOU> listCfgCooperationRateBOU) throws Exception{
		List<CfgCooperationRateModel> listCfgCooperationRateModel = BeanConvertUtils.convertList(listCfgCooperationRateBOU, CfgCooperationRateModel.class);
		return this.cfgCooperationRateMapper.updateList(listCfgCooperationRateModel);
	}
	
	  
	 /**
	  * 
	  * @param CfgCooperationRateBOD
	  * @return int
	  */
	  @Override
	public int delete(CfgCooperationRateBOD cfgCooperationRateBOD) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOD, CfgCooperationRateModel.class);
		return this.cfgCooperationRateMapper.delete(cfgCooperationRateModel);
	}
	
	/**
	  * 
	  * @param CfgCooperationRateBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(CfgCooperationRateBOQ cfgCooperationRateBOQ) throws Exception{
		CfgCooperationRateModel cfgCooperationRateModel = BeanConvertUtils.convert(cfgCooperationRateBOQ, CfgCooperationRateModel.class);
		return this.cfgCooperationRateMapper.queryCount(cfgCooperationRateModel);
	}


	
}
