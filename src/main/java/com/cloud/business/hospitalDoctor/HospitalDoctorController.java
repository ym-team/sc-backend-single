package com.cloud.business.hospitalDoctor;


import com.alibaba.fastjson.JSON;
import com.cloud.util.LogAnnotation;
import com.cloud.util.page.PageInfo;
import com.cloud.util.page.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * <p>
 *
 * </p>
 *
 * @author Michael
 * @date 2019-09-17 01:13:28
 */
@RestController
public class HospitalDoctorController {
    @Autowired
    private IHospitalDoctorService hospitalDoctorService;

    /**
     * 添加信息
     *
     * @param hospitalDoctorBOS
     * @return long
     * @throws Exception
     */
    @LogAnnotation(module = " 添加信息")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:save')")
    @PostMapping("/api-business/hospitalDoctor/save")
    public void save(@RequestBody HospitalDoctorBOS hospitalDoctorBOS) throws Exception {
        long id = this.hospitalDoctorService.save(hospitalDoctorBOS);
    }


    /**
     * 批量添加信息
     *
     * @param listHospitalDoctorBOS
     * @return
     * @throws Exception
     */
    @LogAnnotation(module = "批量添加信息")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:saveList')")
    @PostMapping("/api-business/hospitalDoctor/saveList")
    public void saveList(@RequestBody List<HospitalDoctorBOS> listHospitalDoctorBOS) throws Exception {
        long count = this.hospitalDoctorService.saveList(listHospitalDoctorBOS);
    }


    /**
     * 更新信息
     *
     * @param hospitalDoctorBOU
     * @throws Exception
     */
    @LogAnnotation(module = "更新信息")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:update')")
    @PutMapping("/api-business/hospitalDoctor/update")
    public void update(@RequestBody HospitalDoctorBOU hospitalDoctorBOU) throws Exception {
        long count = this.hospitalDoctorService.update(hospitalDoctorBOU);
    }

    /**
     * 批量更新信息
     *
     * @param listHospitalDoctorBOU
     * @throws Exception
     */
    @LogAnnotation(module = "批量更新")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:updateList')")
    @PutMapping("/api-business/hospitalDoctor/updateList")
    public void updateList(@RequestBody List<HospitalDoctorBOU> listHospitalDoctorBOU) throws Exception {
        long count = this.hospitalDoctorService.updateList(listHospitalDoctorBOU);
    }


    /**
     * 删除信息
     *
     * @param HospitalDoctorBOD
     * @throws Exception
     */
    @LogAnnotation(module = "删除信息")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:delete')")
    @DeleteMapping("/api-business/hospitalDoctor/delete/{id}")
    public void delete(@PathVariable Long id) throws Exception {
        HospitalDoctorBOD hospitalDoctorBOD = new HospitalDoctorBOD();
        hospitalDoctorBOD.setId(id);
        long count = this.hospitalDoctorService.delete(hospitalDoctorBOD);
    }


    /**
     * 查询详情信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @LogAnnotation(module = "查询详情信息")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:queryDetail')")
    @GetMapping("/api-business/hospitalDoctor/queryDetail")
    public HospitalDoctorVO queryDetail(@RequestParam(required = false) long id) throws Exception {
        HospitalDoctorBOQ hospitalDoctorBOQ = new HospitalDoctorBOQ();
        hospitalDoctorBOQ.setId(id);
        return this.hospitalDoctorService.queryDetail(hospitalDoctorBOQ);
    }

    /**
     * 查询列表
     *
     * @param hospitalDoctorBOQ
     * @return List<HospitalDoctorVO>
     * @throws Exception
     */
    @LogAnnotation(module = "查询列表")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:queryList')")
    @GetMapping("/api-business/hospitalDoctor/queryList")
    public List<HospitalDoctorVO> queryList(@RequestBody(required = false) HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception {
        return this.hospitalDoctorService.queryList(hospitalDoctorBOQ);
    }

    /**
     * 分页查询列表
     *
     * @param params
     * @return List<HospitalDoctorVO>
     * @throws Exception
     */
    @LogAnnotation(module = "分页查询列表")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:queryListByPage')")
    @GetMapping("/api-business/hospitalDoctor/queryListByPage")
    public PageQuery<HospitalDoctorVO> queryListByPage(@RequestParam Map<String, Object> params) throws Exception {
        HospitalDoctorBOQP hospitalDoctorBOQP = JSON.parseObject(JSON.toJSONString(params), HospitalDoctorBOQP.class);
        PageInfo pageInfo = new PageInfo();
        pageInfo.setStart(Integer.valueOf(params.get("start").toString()));
        pageInfo.setPageSize(Integer.valueOf(params.get("length").toString()));
        return this.hospitalDoctorService.queryListByPage(hospitalDoctorBOQP, pageInfo);
    }

    /**
     * 查询总数
     *
     * @param hospitalDoctorBOQ
     * @return Long
     * @throws Exception
     */
    @LogAnnotation(module = "查询总数")
    @PreAuthorize("hasAuthority('back:hospitalDoctor:queryCount')")
    @GetMapping("/api-business/hospitalDoctor/queryCount")
    public Long queryCount(HospitalDoctorBOQ hospitalDoctorBOQ) throws Exception {
        return this.hospitalDoctorService.queryCount(hospitalDoctorBOQ);
    }
}