package com.ruoyi.hms.mapper;

import java.util.List;
import com.ruoyi.hms.domain.WardManagement;

/**
 * 病房管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface WardManagementMapper 
{
    /**
     * 查询病房管理
     * 
     * @param wardId 病房管理主键
     * @return 病房管理
     */
    public WardManagement selectWardManagementByWardId(Long wardId);

    /**
     * 查询病房管理列表
     * 
     * @param wardManagement 病房管理
     * @return 病房管理集合
     */
    public List<WardManagement> selectWardManagementList(WardManagement wardManagement);

    /**
     * 新增病房管理
     * 
     * @param wardManagement 病房管理
     * @return 结果
     */
    public int insertWardManagement(WardManagement wardManagement);

    /**
     * 修改病房管理
     * 
     * @param wardManagement 病房管理
     * @return 结果
     */
    public int updateWardManagement(WardManagement wardManagement);

    /**
     * 删除病房管理
     * 
     * @param wardId 病房管理主键
     * @return 结果
     */
    public int deleteWardManagementByWardId(Long wardId);

    /**
     * 批量删除病房管理
     * 
     * @param wardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWardManagementByWardIds(Long[] wardIds);
}
