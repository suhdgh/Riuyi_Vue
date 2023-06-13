package com.ruoyi.hms.mapper;

import java.util.List;
import com.ruoyi.hms.domain.UserManagement;

/**
 * 用户管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface UserManagementMapper 
{
    /**
     * 查询用户管理
     * 
     * @param userId 用户管理主键
     * @return 用户管理
     */
    public UserManagement selectUserManagementByUserId(Long userId);

    /**
     * 查询用户管理列表
     * 
     * @param userManagement 用户管理
     * @return 用户管理集合
     */
    public List<UserManagement> selectUserManagementList(UserManagement userManagement);

    /**
     * 新增用户管理
     * 
     * @param userManagement 用户管理
     * @return 结果
     */
    public int insertUserManagement(UserManagement userManagement);

    /**
     * 修改用户管理
     * 
     * @param userManagement 用户管理
     * @return 结果
     */
    public int updateUserManagement(UserManagement userManagement);

    /**
     * 删除用户管理
     * 
     * @param userId 用户管理主键
     * @return 结果
     */
    public int deleteUserManagementByUserId(Long userId);

    /**
     * 批量删除用户管理
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserManagementByUserIds(Long[] userIds);
}
