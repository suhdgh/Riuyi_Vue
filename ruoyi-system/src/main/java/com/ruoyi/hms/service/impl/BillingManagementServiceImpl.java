package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.BillingManagementMapper;
import com.ruoyi.hms.domain.BillingManagement;
import com.ruoyi.hms.service.IBillingManagementService;

/**
 * 费用管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class BillingManagementServiceImpl implements IBillingManagementService 
{
    @Autowired
    private BillingManagementMapper billingManagementMapper;

    /**
     * 查询费用管理
     * 
     * @param billingId 费用管理主键
     * @return 费用管理
     */
    @Override
    public BillingManagement selectBillingManagementByBillingId(Long billingId)
    {
        return billingManagementMapper.selectBillingManagementByBillingId(billingId);
    }

    /**
     * 查询费用管理列表
     * 
     * @param billingManagement 费用管理
     * @return 费用管理
     */
    @Override
    public List<BillingManagement> selectBillingManagementList(BillingManagement billingManagement)
    {
        return billingManagementMapper.selectBillingManagementList(billingManagement);
    }

    /**
     * 新增费用管理
     * 
     * @param billingManagement 费用管理
     * @return 结果
     */
    @Override
    public int insertBillingManagement(BillingManagement billingManagement)
    {
        return billingManagementMapper.insertBillingManagement(billingManagement);
    }

    /**
     * 修改费用管理
     * 
     * @param billingManagement 费用管理
     * @return 结果
     */
    @Override
    public int updateBillingManagement(BillingManagement billingManagement)
    {
        return billingManagementMapper.updateBillingManagement(billingManagement);
    }

    /**
     * 批量删除费用管理
     * 
     * @param billingIds 需要删除的费用管理主键
     * @return 结果
     */
    @Override
    public int deleteBillingManagementByBillingIds(Long[] billingIds)
    {
        return billingManagementMapper.deleteBillingManagementByBillingIds(billingIds);
    }

    /**
     * 删除费用管理信息
     * 
     * @param billingId 费用管理主键
     * @return 结果
     */
    @Override
    public int deleteBillingManagementByBillingId(Long billingId)
    {
        return billingManagementMapper.deleteBillingManagementByBillingId(billingId);
    }
}
