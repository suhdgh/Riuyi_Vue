package com.ruoyi.hms1.mapper;

import java.util.List;
import com.ruoyi.hms1.domain.ScheduleManagement;

/**
 * 排班管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface ScheduleManagementMapper 
{
    /**
     * 查询排班管理
     * 
     * @param scheduleId 排班管理主键
     * @return 排班管理
     */
    public ScheduleManagement selectScheduleManagementByScheduleId(String scheduleId);

    /**
     * 查询排班管理列表
     * 
     * @param scheduleManagement 排班管理
     * @return 排班管理集合
     */
    public List<ScheduleManagement> selectScheduleManagementList(ScheduleManagement scheduleManagement);

    /**
     * 新增排班管理
     * 
     * @param scheduleManagement 排班管理
     * @return 结果
     */
    public int insertScheduleManagement(ScheduleManagement scheduleManagement);

    /**
     * 修改排班管理
     * 
     * @param scheduleManagement 排班管理
     * @return 结果
     */
    public int updateScheduleManagement(ScheduleManagement scheduleManagement);

    /**
     * 删除排班管理
     * 
     * @param scheduleId 排班管理主键
     * @return 结果
     */
    public int deleteScheduleManagementByScheduleId(String scheduleId);

    /**
     * 批量删除排班管理
     * 
     * @param scheduleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScheduleManagementByScheduleIds(String[] scheduleIds);
}
