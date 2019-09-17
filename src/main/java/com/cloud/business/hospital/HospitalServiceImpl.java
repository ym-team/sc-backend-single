package com.cloud.business.hospital;

import com.cloud.user.model.LoginAppUser;
import com.cloud.util.AppUserUtil;
import com.cloud.util.BeanConvertUtils;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * ${comments} 服务实现类
 * </p>
 *
 * @author Michael
 * @date 2019-09-17 01:13:29
 */
@Slf4j
@Service
public class HospitalServiceImpl implements IHospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;

    /**
     * 新增
     *
     * @param hospitalBOS
     * @return long
     */
    @Override
    public long save(HospitalBOS hospitalBOS) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOS, HospitalModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        hospitalModel.setCreateId(user.getId());
        hospitalModel.setUpdateId(user.getId());
        //hospitalModel.setCreateTime(new Date());
        //hospitalModel.setUpdateTime(new Date());

        int count = this.hospitalMapper.save(hospitalModel);
        return hospitalModel.getId();
    }

    /**
     * 批量新增
     *
     * @param listHospitalBOS
     * @return int
     */
    @Override
    public int saveList(List<HospitalBOS> listHospitalBOS) throws Exception {
        List<HospitalModel> listHospitalModel = BeanConvertUtils.convertList(listHospitalBOS, HospitalModel.class);
        int count = this.hospitalMapper.saveList(listHospitalModel);
        return count;
    }

    /**
     * 查询详情
     *
     * @param hospitalBOQ
     * @return HospitalVO
     */
    @Override
    public HospitalVO queryDetail(HospitalBOQ hospitalBOQ) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
        hospitalModel = this.hospitalMapper.queryDetail(hospitalModel);
        return BeanConvertUtils.convert(hospitalModel, HospitalVO.class);
    }

    /**
     * @param hospitalBOQ
     * @return List<HospitalVO>
     * ${table.JavaName}
     */
    @Override
    public List<HospitalVO> queryList(HospitalBOQ hospitalBOQ) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
        List<HospitalModel> listHospitalModel = this.hospitalMapper.queryList(hospitalModel);
        return BeanConvertUtils.convertList(listHospitalModel, HospitalVO.class);
    }


    /**
     * @param hospitalBOQP
     * @param page
     * @return PageQuery<HospitalVO>
     */
    @Override
    public PageQuery<HospitalVO> queryListByPage(HospitalBOQP hospitalBOQP, PageInfo page) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQP, HospitalModel.class);
        PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
        Page<HospitalModel> queryListByPage = this.hospitalMapper.queryListByPage(hospitalModel);
        return new PageQuery(queryListByPage, HospitalVO.class);
    }


    /**
     * @param hospitalBOU
     * @return int
     */
    @Override
    public int update(HospitalBOU hospitalBOU) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOU, HospitalModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        hospitalModel.setUpdateId(user.getId());
        //hospitalModel.setUpdateTime(new Date());

        return this.hospitalMapper.update(hospitalModel);
    }


    /**
     * @param listHospitalBOU
     * @return int
     */
    @Override
    public int updateList(List<HospitalBOU> listHospitalBOU) throws Exception {
        List<HospitalModel> listHospitalModel = BeanConvertUtils.convertList(listHospitalBOU, HospitalModel.class);
        return this.hospitalMapper.updateList(listHospitalModel);
    }


    /**
     * @param hospitalBOD
     * @return int
     */
    @Override
    public int delete(HospitalBOD hospitalBOD) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOD, HospitalModel.class);
        return this.hospitalMapper.delete(hospitalModel);
    }

    /**
     * @param hospitalBOQ
     * @return Long
     */
    @Override
    public Long queryCount(HospitalBOQ hospitalBOQ) throws Exception {
        HospitalModel hospitalModel = BeanConvertUtils.convert(hospitalBOQ, HospitalModel.class);
        return this.hospitalMapper.queryCount(hospitalModel);
    }
}
