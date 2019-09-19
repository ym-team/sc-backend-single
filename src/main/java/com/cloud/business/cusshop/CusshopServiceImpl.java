package com.cloud.business.cusshop;

/**
 * import com.cloud.business.Cusshop.CusshopModel;
 * import com.cloud.business.Cusshop.CusshopMapper;
 * import com.cloud.business.Cusshop.CusshopService;
 */

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
 * @date 2019-09-17 01:13:26
 */
@Slf4j
@Service
public class CusshopServiceImpl implements ICusshopService {
    @Autowired
    private CusshopMapper cusshopMapper;

    /**
     * 新增
     *
     * @param cusshopBOS
     * @return long
     */
    @Override
    public long save(CusshopBOS cusshopBOS) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOS, CusshopModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        cusshopModel.setCreateId(user.getId());
        cusshopModel.setUpdateId(user.getId());

        int count = this.cusshopMapper.save(cusshopModel);
        return cusshopModel.getId();
    }

    /**
     * 批量新增
     *
     * @param listCusshopBOS
     * @return int
     */
    @Override
    public int saveList(List<CusshopBOS> listCusshopBOS) throws Exception {
        List<CusshopModel> listCusshopModel = BeanConvertUtils.convertList(listCusshopBOS, CusshopModel.class);
        int count = this.cusshopMapper.saveList(listCusshopModel);
        return count;
    }


    /**
     * 查询详情
     *
     * @param cusshopBOQ
     * @return CusshopVO
     */
    @Override
    public CusshopVO queryDetail(CusshopBOQ cusshopBOQ) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOQ, CusshopModel.class);
        cusshopModel = this.cusshopMapper.queryDetail(cusshopModel);
        return BeanConvertUtils.convert(cusshopModel, CusshopVO.class);
    }

    /**
     * @param cusshopBOQ
     * @return List<CusshopVO>
     * ${table.JavaName}
     */
    @Override
    public List<CusshopVO> queryList(CusshopBOQ cusshopBOQ) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOQ, CusshopModel.class);
        List<CusshopModel> listCusshopModel = this.cusshopMapper.queryList(cusshopModel);
        return BeanConvertUtils.convertList(listCusshopModel, CusshopVO.class);
    }


    /**
     * @param cusshopBOQP
     * @param page
     * @return PageQuery<CusshopVO>
     */
    @Override
    public PageQuery<CusshopVO> queryListByPage(CusshopBOQP cusshopBOQP, PageInfo page) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOQP, CusshopModel.class);
        PageHelper.startPage(page.getCurrPage(), page.getPageSize(), page.getOrderby());
        Page<CusshopModel> queryListByPage = this.cusshopMapper.queryListByPage(cusshopModel);
        return new PageQuery(queryListByPage, CusshopVO.class);
    }


    /**
     * @param cusshopBOU
     * @return int
     */
    @Override
    public int update(CusshopBOU cusshopBOU) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOU, CusshopModel.class);
        LoginAppUser user = AppUserUtil.getLoginAppUser();
        cusshopModel.setUpdateId(user.getId());

        return this.cusshopMapper.update(cusshopModel);
    }


    /**
     * @param listCusshopBOU
     * @return int
     */
    @Override
    public int updateList(List<CusshopBOU> listCusshopBOU) throws Exception {
        List<CusshopModel> listCusshopModel = BeanConvertUtils.convertList(listCusshopBOU, CusshopModel.class);
        return this.cusshopMapper.updateList(listCusshopModel);
    }


    /**
     * @param cusshopBOD
     * @return int
     */
    @Override
    public int delete(CusshopBOD cusshopBOD) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOD, CusshopModel.class);
        return this.cusshopMapper.delete(cusshopModel);
    }

    /**
     * @param cusshopBOQ
     * @return Long
     */
    @Override
    public Long queryCount(CusshopBOQ cusshopBOQ) throws Exception {
        CusshopModel cusshopModel = BeanConvertUtils.convert(cusshopBOQ, CusshopModel.class);
        return this.cusshopMapper.queryCount(cusshopModel);
    }
}
