package com.cloud.business.saleman;

/**
import com.cloud.business.Saleman.SalemanModel;
import com.cloud.business.Saleman.SalemanMapper;
import com.cloud.business.Saleman.SalemanService;
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
 * @date  2019-09-17 01:13:27
 */
@Slf4j
@Service
public class SalemanServiceImpl implements ISalemanService  {


	  @Autowired
	  private SalemanMapper salemanMapper;
  
  
     /**
	   * 新增
	   * @param SalemanModel
	   * @return long
	 */
	  @Override
	  public long save(SalemanBOS salemanBOS) throws Exception{
	  	SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOS, SalemanModel.class);
		int count = this.salemanMapper.save(salemanModel);
	    return salemanModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<SalemanBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<SalemanBOS> listSalemanBOS) throws Exception {
	  	List<SalemanModel> listSalemanModel = BeanConvertUtils.convertList(listSalemanBOS, SalemanModel.class);
		int count = this.salemanMapper.saveList(listSalemanModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param SalemanBOQ
	   * @return SalemanVO
	   */
	@Override
	public SalemanVO queryDetail(SalemanBOQ salemanBOQ) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOQ, SalemanModel.class);
		salemanModel = this.salemanMapper.queryDetail(salemanModel);
		return BeanConvertUtils.convert(salemanModel, SalemanVO.class);
	}
  
	/**
	 * 
	 * @param SalemanBOQ
	 * @return	List<SalemanVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<SalemanVO> queryList(SalemanBOQ salemanBOQ) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOQ, SalemanModel.class);
		List<SalemanModel> listSalemanModel = this.salemanMapper.queryList(salemanModel);
		return  BeanConvertUtils.convertList(listSalemanModel, SalemanVO.class);
	}
	  
	
	/**
	 * 
	 * @param SalemanBOQP
	 * @param page
	 * @return PageQuery<SalemanVO>
	 */
	@Override
	public PageQuery<SalemanVO> queryListByPage(SalemanBOQP salemanBOQP,PageInfo page) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOQP, SalemanModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<SalemanModel> queryListByPage = this.salemanMapper.queryListByPage(salemanModel);
		return  new PageQuery(queryListByPage, SalemanVO.class);
	}
	
	
	  
	/**
	 *
	 * @param SalemanBOU
	 * @return int
	 */
	@Override
	public int update(SalemanBOU salemanBOU) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOU, SalemanModel.class);
		return this.salemanMapper.update(salemanModel);
	}
	
	
	/**
	 *
	 * @param List<SalemanBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<SalemanBOU> listSalemanBOU) throws Exception{
		List<SalemanModel> listSalemanModel = BeanConvertUtils.convertList(listSalemanBOU, SalemanModel.class);
		return this.salemanMapper.updateList(listSalemanModel);
	}
	
	  
	 /**
	  * 
	  * @param SalemanBOD
	  * @return int
	  */
	  @Override
	public int delete(SalemanBOD salemanBOD) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOD, SalemanModel.class);
		return this.salemanMapper.delete(salemanModel);
	}
	
	/**
	  * 
	  * @param SalemanBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(SalemanBOQ salemanBOQ) throws Exception{
		SalemanModel salemanModel = BeanConvertUtils.convert(salemanBOQ, SalemanModel.class);
		return this.salemanMapper.queryCount(salemanModel);
	}


	
}
