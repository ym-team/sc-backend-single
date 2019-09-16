package com.cloud.business.bussinessSum;

/**
import com.cloud.business.BussinessSum.BussinessSumModel;
import com.cloud.business.BussinessSum.BussinessSumMapper;
import com.cloud.business.BussinessSum.BussinessSumService;
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
 * @date  2019-09-17 01:13:24
 */
@Slf4j
@Service
public class BussinessSumServiceImpl implements IBussinessSumService  {


	  @Autowired
	  private BussinessSumMapper bussinessSumMapper;
  
  
     /**
	   * 新增
	   * @param BussinessSumModel
	   * @return long
	 */
	  @Override
	  public long save(BussinessSumBOS bussinessSumBOS) throws Exception{
	  	BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOS, BussinessSumModel.class);
		int count = this.bussinessSumMapper.save(bussinessSumModel);
	    return bussinessSumModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<BussinessSumBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<BussinessSumBOS> listBussinessSumBOS) throws Exception {
	  	List<BussinessSumModel> listBussinessSumModel = BeanConvertUtils.convertList(listBussinessSumBOS, BussinessSumModel.class);
		int count = this.bussinessSumMapper.saveList(listBussinessSumModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param BussinessSumBOQ
	   * @return BussinessSumVO
	   */
	@Override
	public BussinessSumVO queryDetail(BussinessSumBOQ bussinessSumBOQ) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOQ, BussinessSumModel.class);
		bussinessSumModel = this.bussinessSumMapper.queryDetail(bussinessSumModel);
		return BeanConvertUtils.convert(bussinessSumModel, BussinessSumVO.class);
	}
  
	/**
	 * 
	 * @param BussinessSumBOQ
	 * @return	List<BussinessSumVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<BussinessSumVO> queryList(BussinessSumBOQ bussinessSumBOQ) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOQ, BussinessSumModel.class);
		List<BussinessSumModel> listBussinessSumModel = this.bussinessSumMapper.queryList(bussinessSumModel);
		return  BeanConvertUtils.convertList(listBussinessSumModel, BussinessSumVO.class);
	}
	  
	
	/**
	 * 
	 * @param BussinessSumBOQP
	 * @param page
	 * @return PageQuery<BussinessSumVO>
	 */
	@Override
	public PageQuery<BussinessSumVO> queryListByPage(BussinessSumBOQP bussinessSumBOQP,PageInfo page) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOQP, BussinessSumModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<BussinessSumModel> queryListByPage = this.bussinessSumMapper.queryListByPage(bussinessSumModel);
		return  new PageQuery(queryListByPage, BussinessSumVO.class);
	}
	
	
	  
	/**
	 *
	 * @param BussinessSumBOU
	 * @return int
	 */
	@Override
	public int update(BussinessSumBOU bussinessSumBOU) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOU, BussinessSumModel.class);
		return this.bussinessSumMapper.update(bussinessSumModel);
	}
	
	
	/**
	 *
	 * @param List<BussinessSumBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<BussinessSumBOU> listBussinessSumBOU) throws Exception{
		List<BussinessSumModel> listBussinessSumModel = BeanConvertUtils.convertList(listBussinessSumBOU, BussinessSumModel.class);
		return this.bussinessSumMapper.updateList(listBussinessSumModel);
	}
	
	  
	 /**
	  * 
	  * @param BussinessSumBOD
	  * @return int
	  */
	  @Override
	public int delete(BussinessSumBOD bussinessSumBOD) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOD, BussinessSumModel.class);
		return this.bussinessSumMapper.delete(bussinessSumModel);
	}
	
	/**
	  * 
	  * @param BussinessSumBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(BussinessSumBOQ bussinessSumBOQ) throws Exception{
		BussinessSumModel bussinessSumModel = BeanConvertUtils.convert(bussinessSumBOQ, BussinessSumModel.class);
		return this.bussinessSumMapper.queryCount(bussinessSumModel);
	}


	
}
