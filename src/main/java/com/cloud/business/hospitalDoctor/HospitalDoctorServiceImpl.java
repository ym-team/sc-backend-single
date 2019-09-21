package com.cloud.business.hospitalDoctor;

/**
 * import com.cloud.business.HospitalDoctor.HospitalDoctorModel;
 * import com.cloud.business.HospitalDoctor.HospitalDoctorMapper;
 * import com.cloud.business.HospitalDoctor.HospitalDoctorService;
 */

import com.cloud.business.hospital.HospitalMapper;
import com.cloud.business.hospital.HospitalModel;
import com.cloud.business.user.UserMapper;
import com.cloud.business.user.UserModel;
import com.cloud.user.model.LoginAppUser;
import com.cloud.util.AppUserUtil;
import com.cloud.util.BeanConvertUtils;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * ${comments} 服务实现类
 * </p>
 *
 * @author Michael
 * @date 2019-09-17 01:13:28
 */
@Slf4j
@Service
public class HospitalDoctorServiceImpl implements IHospitalDoctorService {
    @Autowired
    private HospitalDoctorMapper hospitalDoctorMapper;
    @Autowired
    private HospitalMapper hospitalMapper;

    /**
     * 新增
     *
     * @param hospitalDoctorBOS
     * @return long
     */
    @Override
    public long save(HospitalDoctorBOS hospitalDoctorBOS) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOS, HospitalDoctorModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        hospitalDoctorModel.setCreateId(user.getId());
        hospitalDoctorModel.setUpdateId(user.getId());
        //hospitalModel.setCreateTime(new Date());
        //hospitalModel.setUpdateTime(new Date());
        int count = this.hospitalDoctorMapper.save(hospitalDoctorModel);
        return hospitalDoctorModel.getId();
    }

    /**
     * 批量新增
     *
     * @param listHospitalDoctorBOS
     * @return int
     */
    @Override
    public int saveList(List<HospitalDoctorBOS> listHospitalDoctorBOS) throws Exception {
        List<HospitalDoctorModel> listHospitalDoctorModel = BeanConvertUtils.convertList(listHospitalDoctorBOS, HospitalDoctorModel.class);
        int count = this.hospitalDoctorMapper.saveList(listHospitalDoctorModel);
        return count;
    }


    /**
     * 查询详情
     *
     * @param hospitalDoctorBOQ
     * @return HospitalDoctorVO
     */
    @Override
    public HospitalDoctorVO queryDetail(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
        hospitalDoctorModel = this.hospitalDoctorMapper.queryDetail(hospitalDoctorModel);
        return BeanConvertUtils.convert(hospitalDoctorModel, HospitalDoctorVO.class);
    }

    /**
     * @param hospitalDoctorBOQ
     * @return List<HospitalDoctorVO>
     * ${table.JavaName}
     */
    @Override
    public List<HospitalDoctorVO> queryList(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
        List<HospitalDoctorModel> listHospitalDoctorModel = this.hospitalDoctorMapper.queryList(hospitalDoctorModel);
        return BeanConvertUtils.convertList(listHospitalDoctorModel, HospitalDoctorVO.class);
    }


    /**
     * @param hospitalDoctorBOQP
     * @param page
     * @return PageQuery<HospitalDoctorVO>
     */
    @Override
    public PageQuery<HospitalDoctorVO> queryListByPage(HospitalDoctorBOQP hospitalDoctorBOQP, PageInfo page) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQP, HospitalDoctorModel.class);
        PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
        Page<HospitalDoctorModel> queryListByPage = this.hospitalDoctorMapper.queryListByPage(hospitalDoctorModel);
        for (HospitalDoctorModel model : queryListByPage.getResult()) {
            HospitalModel hm = new HospitalModel();
            hm.setId(model.getHospitalId());
            HospitalModel hospitalModel = hospitalMapper.queryDetail(hm);
            if (hospitalModel != null) {
                model.setHospitalName(hospitalModel.getName());
            }
        }
        return new PageQuery(queryListByPage, HospitalDoctorVO.class);
    }


    /**
     * @param hospitalDoctorBOU
     * @return int
     */
    @Override
    public int update(HospitalDoctorBOU hospitalDoctorBOU) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOU, HospitalDoctorModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        hospitalDoctorModel.setUpdateId(user.getId());
        //hospitalModel.setUpdateTime(new Date());

        return this.hospitalDoctorMapper.update(hospitalDoctorModel);
    }


    /**
     * @param listHospitalDoctorBOU
     * @return int
     */
    @Override
    public int updateList(List<HospitalDoctorBOU> listHospitalDoctorBOU) throws Exception {
        List<HospitalDoctorModel> listHospitalDoctorModel = BeanConvertUtils.convertList(listHospitalDoctorBOU, HospitalDoctorModel.class);
        return this.hospitalDoctorMapper.updateList(listHospitalDoctorModel);
    }


    /**
     * @param hospitalDoctorBOD
     * @return int
     */
    @Override
    public int delete(HospitalDoctorBOD hospitalDoctorBOD) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOD, HospitalDoctorModel.class);
        return this.hospitalDoctorMapper.delete(hospitalDoctorModel);
    }

    /**
     * @param hospitalDoctorBOQ
     * @return Long
     */
    @Override
    public Long queryCount(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception {
        HospitalDoctorModel hospitalDoctorModel = BeanConvertUtils.convert(hospitalDoctorBOQ, HospitalDoctorModel.class);
        return this.hospitalDoctorMapper.queryCount(hospitalDoctorModel);
    }
}