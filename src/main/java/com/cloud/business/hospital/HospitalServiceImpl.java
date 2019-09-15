package com.cloud.business.hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.util.BeanConvertUtils;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HospitalServiceImpl implements IHospitalService{
	
	@Autowired
	private HospitalMapper hospitalMapper;
	

	@Override
	public long save(HospitalBOS hospitalBOS) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOS, HospitalModel.class);
		long count = this.hospitalMapper.save(hospitalModel);
		return hospitalModel.getId();
	}

	@Override
	public long saveList(List<HospitalBOS> listHospitalBOS) {
		List<HospitalModel> listHospitalModel = BeanConvertUtils.convertList(listHospitalBOS, HospitalModel.class);
		return this.hospitalMapper.saveList(listHospitalModel);
	}

	@Override
	public long update(HospitalBOU hospitalBOU) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOU, HospitalModel.class);
		return this.hospitalMapper.update(hospitalModel);
	}

	@Override
	public long updateList(List<HospitalBOU> listHospitalBOU) {
		List<HospitalModel> listHospitalModel = BeanConvertUtils.convertList(listHospitalBOU, HospitalModel.class);
		return this.hospitalMapper.updateList(listHospitalModel);
	}

	@Override
	public long delete(HospitalBOD hospitalBOD) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOD, HospitalModel.class);
		return this.hospitalMapper.delete(hospitalModel);
	}

	@Override
	public List<HospitalVO> queryList(HospitalBOQ hospitalBOQ) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
		List<HospitalModel> listHospitalModel = this.hospitalMapper.queryList(hospitalModel);
		return BeanConvertUtils.convertList(listHospitalModel, HospitalVO.class);
	}

	@Override
	public PageQuery<HospitalVO> queryListByPage(HospitalBOQP hospitalBOP,PageInfo page) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOP, HospitalModel.class);
		PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
		Page<HospitalModel> queryListByPage = this.hospitalMapper.queryListByPage(hospitalModel);
		
		return  new PageQuery(queryListByPage, HospitalVO.class);
	}

	@Override
	public HospitalVO queryDetail(HospitalBOQ hospitalBOQ) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
		HospitalModel queryDetail = this.hospitalMapper.queryDetail(hospitalModel);
		return BeanConvertUtils.convert(queryDetail, HospitalVO.class);
	}

	@Override
	public Long queryCount(HospitalBOQ hospitalBOQ) {
		HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
		return this.hospitalMapper.queryCount(hospitalModel);
	}
	
	


}
