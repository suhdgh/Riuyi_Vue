package com.ruoyi.hms1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms1.mapper.WardManagementMapper;
import com.ruoyi.hms1.domain.WardManagement;
import com.ruoyi.hms1.service.IWardManagementService;

/**
 * 病房管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@Service
public class WardManagementServiceImpl implements IWardManagementService 
{
    @Autowired
    private WardManagementMapper wardManagementMapper;

    /**
     * 查询病房管理
     * 
     * @param wardId 病房管理主键
     * @return 病房管理
     */
    @Override
    public WardManagement selectWardManagementByWardId(String wardId)
    {
        return wardManagementMapper.selectWardManagementByWardId(wardId);
    }

    /**
     * 查询病房管理列表
     * 
     * @param wardManagement 病房管理
     * @return 病房管理
     */
    @Override
    public List<WardManagement> selectWardManagementList(WardManagement wardManagement)
    {
        return wardManagementMapper.selectWardManagementList(wardManagement);
    }

    /**
     * 新增病房管理
     * 
     * @param wardManagement 病房管理
     * @return 结果
     */
    @Override
    public int insertWardManagement(WardManagement wardManagement)
    {
        return wardManagementMapper.insertWardManagement(wardManagement);
    }

    /**
     * 修改病房管理
     * 
     * @param wardManagement 病房管理
     * @return 结果
     */
    @Override
    public int updateWardManagement(WardManagement wardManagement)
    {
        return wardManagementMapper.updateWardManagement(wardManagement);
    }

    /**
     * 批量删除病房管理
     * 
     * @param wardIds 需要删除的病房管理主键
     * @return 结果
     */
    @Override
    public int deleteWardManagementByWardIds(String[] wardIds)
    {
        return wardManagementMapper.deleteWardManagementByWardIds(wardIds);
    }

    /**
     * 删除病房管理信息
     * 
     * @param wardId 病房管理主键
     * @return 结果
     */
    @Override
    public int deleteWardManagementByWardId(String wardId)
    {
        return wardManagementMapper.deleteWardManagementByWardId(wardId);
    }
}
