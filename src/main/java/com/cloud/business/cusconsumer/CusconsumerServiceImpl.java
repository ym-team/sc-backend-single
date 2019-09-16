package com.cloud.business.cusconsumer;

/**
import com.cloud.business.Cusconsumer.CusconsumerModel;
import com.cloud.business.Cusconsumer.CusconsumerMapper;
import com.cloud.business.Cusconsumer.CusconsumerService;
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
public class CusconsumerServiceImpl implements ICusconsumerService  {


	  @Autowired
	  private CusconsumerMapper cusconsumerMapper;
  
  
     /**
	   * 新增
	   * @param CusconsumerModel
	   * @return long
	 */
	  @Override
	  public long save(CusconsumerBOS cusconsumerBOS) throws Exception{
	  	CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOS, CusconsumerModel.class);
		int count = this.cusconsumerMapper.save(cusconsumerModel);
	    return cusconsumerModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<CusconsumerBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<CusconsumerBOS> listCusconsumerBOS) throws Exception {
	  	List<CusconsumerModel> listCusconsumerModel = BeanConvertUtils.convertList(listCusconsumerBOS, CusconsumerModel.class);
		int count = this.cusconsumerMapper.saveList(listCusconsumerModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param CusconsumerBOQ
	   * @return CusconsumerVO
	   */
	@Override
	public CusconsumerVO queryDetail(CusconsumerBOQ cusconsumerBOQ) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOQ, CusconsumerModel.class);
		cusconsumerModel = this.cusconsumerMapper.queryDetail(cusconsumerModel);
		return BeanConvertUtils.convert(cusconsumerModel, CusconsumerVO.class);
	}
  
	/**
	 * 
	 * @param CusconsumerBOQ
	 * @return	List<CusconsumerVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<CusconsumerVO> queryList(CusconsumerBOQ cusconsumerBOQ) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOQ, CusconsumerModel.class);
		List<CusconsumerModel> listCusconsumerModel = this.cusconsumerMapper.queryList(cusconsumerModel);
		return  BeanConvertUtils.convertList(listCusconsumerModel, CusconsumerVO.class);
	}
	  
	
	/**
	 * 
	 * @param CusconsumerBOQP
	 * @param page
	 * @return PageQuery<CusconsumerVO>
	 */
	@Override
	public PageQuery<CusconsumerVO> queryListByPage(CusconsumerBOQP cusconsumerBOQP,PageInfo page) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOQP, CusconsumerModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<CusconsumerModel> queryListByPage = this.cusconsumerMapper.queryListByPage(cusconsumerModel);
		return  new PageQuery(queryListByPage, CusconsumerVO.class);
	}
	
	
	  
	/**
	 *
	 * @param CusconsumerBOU
	 * @return int
	 */
	@Override
	public int update(CusconsumerBOU cusconsumerBOU) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOU, CusconsumerModel.class);
		return this.cusconsumerMapper.update(cusconsumerModel);
	}
	
	
	/**
	 *
	 * @param List<CusconsumerBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<CusconsumerBOU> listCusconsumerBOU) throws Exception{
		List<CusconsumerModel> listCusconsumerModel = BeanConvertUtils.convertList(listCusconsumerBOU, CusconsumerModel.class);
		return this.cusconsumerMapper.updateList(listCusconsumerModel);
	}
	
	  
	 /**
	  * 
	  * @param CusconsumerBOD
	  * @return int
	  */
	  @Override
	public int delete(CusconsumerBOD cusconsumerBOD) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOD, CusconsumerModel.class);
		return this.cusconsumerMapper.delete(cusconsumerModel);
	}
	
	/**
	  * 
	  * @param CusconsumerBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(CusconsumerBOQ cusconsumerBOQ) throws Exception{
		CusconsumerModel cusconsumerModel = BeanConvertUtils.convert(cusconsumerBOQ, CusconsumerModel.class);
		return this.cusconsumerMapper.queryCount(cusconsumerModel);
	}


	
}
