package com.morning.star.scm.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.morning.star.scm.open.entity.warehouse.stock.InReportEntity;
import com.morning.star.scm.open.vo.warehouse.InReportBillInfoVo;

/**
 * 入库预报表的dao类
 * @author jiazhiqiang124
 *
 */
public interface InReportDao {

	/**
	 * 分页查询入库预报数据
	 * @param params
	 * @return
	 */
	public abstract List<InReportEntity>  selectDepotByPage(Map<String, Object> params);
	public abstract List<InReportEntity> selectAllByParams(Map<String, Object> params);
	/**
	 * 根据入库单号，(采购单号，),自增id查询具体的信息！
	 */
	public InReportEntity selectInReportEnByOrderCodeAndId(Map<String, Object> params);
	/**
	 * 根据pid和仓库编码,拿到最新的一个批次号和skuCode,仓库编码
	 */
	public InReportBillInfoVo getBillInfo(Map<String, Object> params) ;
	/**
	 * 根据采购单号，更改当前采购单对应的入库状态
	 * @param orderCode
	 * @param status
	 * @return
	 */
	public int updatePushDepotStatus(Map<String, Object> params);
	
	public void test();
	
	public void test1(String str);
}
