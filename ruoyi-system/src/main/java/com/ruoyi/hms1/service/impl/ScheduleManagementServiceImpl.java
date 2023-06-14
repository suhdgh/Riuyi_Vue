package com.ruoyi.hms1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms1.mapper.ScheduleManagementMapper;
import com.ruoyi.hms1.domain.ScheduleManagement;
import com.ruoyi.hms1.service.IScheduleManagementService;

/**
 * 排班管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@Service
public class ScheduleManagementServiceImpl implements IScheduleManagementService 
{
    @Autowired
    private ScheduleManagementMapper scheduleManagementMapper;

    /**
     * 查询排班管理
     * 
     * @param scheduleId 排班管理主键
     * @return 排班管理
     */
    @Override
    public ScheduleManagement selectScheduleManagementByScheduleId(String scheduleId)
    {
        return scheduleManagementMapper.selectScheduleManagementByScheduleId(scheduleId);
    }

    /**
     * 查询排班管理列表
     * 
     * @param scheduleManagement 排班管理
     * @return 排班管理
     */
    @Override
    public List<ScheduleManagement> selectScheduleManagementList(ScheduleManagement scheduleManagement)
    {
        return scheduleManagementMapper.selectScheduleManagementList(scheduleManagement);
    }

    /**
     * 新增排班管理
     * 
     * @param scheduleManagement 排班管理
     * @return 结果
     */
    @Override
    public int insertScheduleManagement(ScheduleManagement scheduleManagement)
    {
        return scheduleManagementMapper.insertScheduleManagement(scheduleManagement);
    }

    /**
     * 修改排班管理
     * 
     * @param scheduleManagement 排班管理
     * @return 结果
     */
    @Override
    public int updateScheduleManagement(ScheduleManagement scheduleManagement)
    {
        return scheduleManagementMapper.updateScheduleManagement(scheduleManagement);
    }

    /**
     * 批量删除排班管理
     * 
     * @param scheduleIds 需要删除的排班管理主键
     * @return 结果
     */
    @Override
    public int deleteScheduleManagementByScheduleIds(String[] scheduleIds)
    {
        return scheduleManagementMapper.deleteScheduleManagementByScheduleIds(scheduleIds);
    }

    /**
     * 删除排班管理信息
     * 
     * @param scheduleId 排班管理主键
     * @return 结果
     */
    @Override
    public int deleteScheduleManagementByScheduleId(String scheduleId)
    {
        return scheduleManagementMapper.deleteScheduleManagementByScheduleId(scheduleId);
    }
}
