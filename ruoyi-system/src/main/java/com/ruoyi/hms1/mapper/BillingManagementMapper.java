package com.ruoyi.hms1.mapper;

import java.util.List;
import com.ruoyi.hms1.domain.BillingManagement;

/**
 * 费用管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface BillingManagementMapper 
{
    /**
     * 查询费用管理
     * 
     * @param billingId 费用管理主键
     * @return 费用管理
     */
    public BillingManagement selectBillingManagementByBillingId(String billingId);

    /**
     * 查询费用管理列表
     * 
     * @param billingManagement 费用管理
     * @return 费用管理集合
     */
    public List<BillingManagement> selectBillingManagementList(BillingManagement billingManagement);

    /**
     * 新增费用管理
     * 
     * @param billingManagement 费用管理
     * @return 结果
     */
    public int insertBillingManagement(BillingManagement billingManagement);

    /**
     * 修改费用管理
     * 
     * @param billingManagement 费用管理
     * @return 结果
     */
    public int updateBillingManagement(BillingManagement billingManagement);

    /**
     * 删除费用管理
     * 
     * @param billingId 费用管理主键
     * @return 结果
     */
    public int deleteBillingManagementByBillingId(String billingId);

    /**
     * 批量删除费用管理
     * 
     * @param billingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBillingManagementByBillingIds(String[] billingIds);
}
