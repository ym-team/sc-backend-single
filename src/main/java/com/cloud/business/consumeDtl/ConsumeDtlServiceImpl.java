package com.cloud.business.consumeDtl;

/**
import com.cloud.business.ConsumeDtl.ConsumeDtlModel;
import com.cloud.business.ConsumeDtl.ConsumeDtlMapper;
import com.cloud.business.ConsumeDtl.ConsumeDtlService;
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
 * @date  2019-09-17 01:13:26
 */
@Slf4j
@Service
public class ConsumeDtlServiceImpl implements IConsumeDtlService  {


	  @Autowired
	  private ConsumeDtlMapper consumeDtlMapper;
  
  
     /**
	   * 新增
	   * @param ConsumeDtlModel
	   * @return long
	 */
	  @Override
	  public long save(ConsumeDtlBOS consumeDtlBOS) throws Exception{
	  	ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOS, ConsumeDtlModel.class);
		int count = this.consumeDtlMapper.save(consumeDtlModel);
	    return consumeDtlModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<ConsumeDtlBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<ConsumeDtlBOS> listConsumeDtlBOS) throws Exception {
	  	List<ConsumeDtlModel> listConsumeDtlModel = BeanConvertUtils.convertList(listConsumeDtlBOS, ConsumeDtlModel.class);
		int count = this.consumeDtlMapper.saveList(listConsumeDtlModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param ConsumeDtlBOQ
	   * @return ConsumeDtlVO
	   */
	@Override
	public ConsumeDtlVO queryDetail(ConsumeDtlBOQ consumeDtlBOQ) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOQ, ConsumeDtlModel.class);
		consumeDtlModel = this.consumeDtlMapper.queryDetail(consumeDtlModel);
		return BeanConvertUtils.convert(consumeDtlModel, ConsumeDtlVO.class);
	}
  
	/**
	 * 
	 * @param ConsumeDtlBOQ
	 * @return	List<ConsumeDtlVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<ConsumeDtlVO> queryList(ConsumeDtlBOQ consumeDtlBOQ) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOQ, ConsumeDtlModel.class);
		List<ConsumeDtlModel> listConsumeDtlModel = this.consumeDtlMapper.queryList(consumeDtlModel);
		return  BeanConvertUtils.convertList(listConsumeDtlModel, ConsumeDtlVO.class);
	}
	  
	
	/**
	 * 
	 * @param ConsumeDtlBOQP
	 * @param page
	 * @return PageQuery<ConsumeDtlVO>
	 */
	@Override
	public PageQuery<ConsumeDtlVO> queryListByPage(ConsumeDtlBOQP consumeDtlBOQP,PageInfo page) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOQP, ConsumeDtlModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<ConsumeDtlModel> queryListByPage = this.consumeDtlMapper.queryListByPage(consumeDtlModel);
		return  new PageQuery(queryListByPage, ConsumeDtlVO.class);
	}
	
	
	  
	/**
	 *
	 * @param ConsumeDtlBOU
	 * @return int
	 */
	@Override
	public int update(ConsumeDtlBOU consumeDtlBOU) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOU, ConsumeDtlModel.class);
		return this.consumeDtlMapper.update(consumeDtlModel);
	}
	
	
	/**
	 *
	 * @param List<ConsumeDtlBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<ConsumeDtlBOU> listConsumeDtlBOU) throws Exception{
		List<ConsumeDtlModel> listConsumeDtlModel = BeanConvertUtils.convertList(listConsumeDtlBOU, ConsumeDtlModel.class);
		return this.consumeDtlMapper.updateList(listConsumeDtlModel);
	}
	
	  
	 /**
	  * 
	  * @param ConsumeDtlBOD
	  * @return int
	  */
	  @Override
	public int delete(ConsumeDtlBOD consumeDtlBOD) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOD, ConsumeDtlModel.class);
		return this.consumeDtlMapper.delete(consumeDtlModel);
	}
	
	/**
	  * 
	  * @param ConsumeDtlBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(ConsumeDtlBOQ consumeDtlBOQ) throws Exception{
		ConsumeDtlModel consumeDtlModel = BeanConvertUtils.convert(consumeDtlBOQ, ConsumeDtlModel.class);
		return this.consumeDtlMapper.queryCount(consumeDtlModel);
	}


	
}
