package com.ruoyi.hms1.service;

import java.util.List;
import com.ruoyi.hms1.domain.WardManagement;

/**
 * 病房管理Service接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface IWardManagementService 
{
    /**
     * 查询病房管理
     * 
     * @param wardId 病房管理主键
     * @return 病房管理
     */
    public WardManagement selectWardManagementByWardId(String wardId);

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
     * 批量删除病房管理
     * 
     * @param wardIds 需要删除的病房管理主键集合
     * @return 结果
     */
    public int deleteWardManagementByWardIds(String[] wardIds);

    /**
     * 删除病房管理信息
     * 
     * @param wardId 病房管理主键
     * @return 结果
     */
    public int deleteWardManagementByWardId(String wardId);
}
