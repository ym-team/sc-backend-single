package com.cloud.business.hospitalDoctor;

/**
import com.cloud.business.HospitalDoctor.HospitalDoctorModel;
import com.cloud.business.HospitalDoctor.HospitalDoctorMapper;
import com.cloud.business.HospitalDoctor.HospitalDoctorService;
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
 * @date  2019-09-17 01:13:28
 */
@Slf4j
@Service
public class HospitalDoctorServiceImpl implements IHospitalDoctorService  {


	  @Autowired
	  private HospitalDoctorMapper hospitalDoctorMapper;
  
  
     /**
	   * 新增
	   * @param HospitalDoctorModel
	   * @return long
	 */
	  @Override
	  public long save(HospitalDoctorBOS hospitalDoctorBOS) throws Exception{
	  	HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOS, HospitalDoctorModel.class);
		int count = this.hospitalDoctorMapper.save(hospitalDoctorModel);
	    return hospitalDoctorModel.getId();
	  }
  
	   /**
		 *批量新增
		 * @param List<HospitalDoctorBOS>
		 * @return	int
		*/
	  @Override
	  public int saveList(List<HospitalDoctorBOS> listHospitalDoctorBOS) throws Exception {
	  	List<HospitalDoctorModel> listHospitalDoctorModel = BeanConvertUtils.convertList(listHospitalDoctorBOS, HospitalDoctorModel.class);
		int count = this.hospitalDoctorMapper.saveList(listHospitalDoctorModel);
	    return count;
	  }

  
  
  	/**
	   *查询详情
	   * @param HospitalDoctorBOQ
	   * @return HospitalDoctorVO
	   */
	@Override
	public HospitalDoctorVO queryDetail(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
		hospitalDoctorModel = this.hospitalDoctorMapper.queryDetail(hospitalDoctorModel);
		return BeanConvertUtils.convert(hospitalDoctorModel, HospitalDoctorVO.class);
	}
  
	/**
	 * 
	 * @param HospitalDoctorBOQ
	 * @return	List<HospitalDoctorVO>
	 * ${table.JavaName}
	 */
	@Override
	public List<HospitalDoctorVO> queryList(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
		List<HospitalDoctorModel> listHospitalDoctorModel = this.hospitalDoctorMapper.queryList(hospitalDoctorModel);
		return  BeanConvertUtils.convertList(listHospitalDoctorModel, HospitalDoctorVO.class);
	}
	  
	
	/**
	 * 
	 * @param HospitalDoctorBOQP
	 * @param page
	 * @return PageQuery<HospitalDoctorVO>
	 */
	@Override
	public PageQuery<HospitalDoctorVO> queryListByPage(HospitalDoctorBOQP hospitalDoctorBOQP,PageInfo page) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQP, HospitalDoctorModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<HospitalDoctorModel> queryListByPage = this.hospitalDoctorMapper.queryListByPage(hospitalDoctorModel);
		return  new PageQuery(queryListByPage, HospitalDoctorVO.class);
	}
	
	
	  
	/**
	 *
	 * @param HospitalDoctorBOU
	 * @return int
	 */
	@Override
	public int update(HospitalDoctorBOU hospitalDoctorBOU) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOU, HospitalDoctorModel.class);
		return this.hospitalDoctorMapper.update(hospitalDoctorModel);
	}
	
	
	/**
	 *
	 * @param List<HospitalDoctorBOU>
	 * @return int
	 */
	@Override
	public int updateList(List<HospitalDoctorBOU> listHospitalDoctorBOU) throws Exception{
		List<HospitalDoctorModel> listHospitalDoctorModel = BeanConvertUtils.convertList(listHospitalDoctorBOU, HospitalDoctorModel.class);
		return this.hospitalDoctorMapper.updateList(listHospitalDoctorModel);
	}
	
	  
	 /**
	  * 
	  * @param HospitalDoctorBOD
	  * @return int
	  */
	  @Override
	public int delete(HospitalDoctorBOD hospitalDoctorBOD) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOD, HospitalDoctorModel.class);
		return this.hospitalDoctorMapper.delete(hospitalDoctorModel);
	}
	
	/**
	  * 
	  * @param HospitalDoctorBOQ
	  * @return Long
	  */
	 @Override
	public Long queryCount(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception{
		HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
		return this.hospitalDoctorMapper.queryCount(hospitalDoctorModel);
	}


	
}
