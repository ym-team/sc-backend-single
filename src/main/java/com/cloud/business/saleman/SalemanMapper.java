package com.cloud.business.saleman;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.github.pagehelper.Page;

/**
 *
 * 业务员表
 *
 * @author Michael
 * @date 2019-09-17 01:13:27
 */
@Mapper
public interface SalemanMapper {

	 /**
	   * 新增 业务员表 信息
	   * @param SalemanModel
	   * @return int
	   * @throws Exception
	   */
	public int save(@Param("salemanModel")SalemanModel  salemanModel);
	
	

	/**
	   *批量新增
	   * @param List<SalemanModel>
	   * @return int
	   * @throws Exception
	   */
	public int saveList(@Param("listSalemanModel")List<SalemanModel>  listSalemanModel);
	

  	 /**
	   * 查询详情
	   * @param SalemanModel
	   * @return SalemanModel
	   * @throws Exception
	   */
	public SalemanModel queryDetail(@Param("salemanModel")SalemanModel salemanModel);
  
	/**
	 * 查询列表
	 * @param SalemanModel
	 * @return List<SalemanModel>
	 * @throws Exception
	 */
	public List<SalemanModel> queryList(@Param("salemanModel")SalemanModel salemanModel);
	  
	  
	/**
	 * 分页查询列表
	 * @param SalemanModel
	 * @return Page<SalemanModel>
	 * @throws Exception
	 */
	public Page<SalemanModel> queryListByPage(@Param("salemanModel")SalemanModel salemanModel);
	  
	  
	/**
	 * 更新
	 * @param SalemanModel
	 * @return int
	 * @throws Exception
	 */
	public int update(@Param("salemanModel")SalemanModel salemanModel);
	
	
	/**
	 * 批量更新
	 * @param List<SalemanModel>
	 * @return int
	 * @throws Exception
	 */
	public int updateList(@Param("listSalemanModel")List<SalemanModel> listSalemanModel);
	  
	  
	    
	 /**
	  * 物理删除 
	  * @param SalemanModel
	  * @return int
	  * @throws Exception
	  */
	public int delete(@Param("salemanModel")SalemanModel salemanModel);
	
	/**
	  * 根据入参条件查询 总数
	  * @param SalemanModel
	  * @throws Exception
	  */
	public Long queryCount(@Param("salemanModel")SalemanModel salemanModel);
	
	
	  

}