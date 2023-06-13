package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.UserManagementMapper;
import com.ruoyi.hms.domain.UserManagement;
import com.ruoyi.hms.service.IUserManagementService;

/**
 * 用户管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class UserManagementServiceImpl implements IUserManagementService 
{
    @Autowired
    private UserManagementMapper userManagementMapper;

    /**
     * 查询用户管理
     * 
     * @param userId 用户管理主键
     * @return 用户管理
     */
    @Override
    public UserManagement selectUserManagementByUserId(Long userId)
    {
        return userManagementMapper.selectUserManagementByUserId(userId);
    }

    /**
     * 查询用户管理列表
     * 
     * @param userManagement 用户管理
     * @return 用户管理
     */
    @Override
    public List<UserManagement> selectUserManagementList(UserManagement userManagement)
    {
        return userManagementMapper.selectUserManagementList(userManagement);
    }

    /**
     * 新增用户管理
     * 
     * @param userManagement 用户管理
     * @return 结果
     */
    @Override
    public int insertUserManagement(UserManagement userManagement)
    {
        return userManagementMapper.insertUserManagement(userManagement);
    }

    /**
     * 修改用户管理
     * 
     * @param userManagement 用户管理
     * @return 结果
     */
    @Override
    public int updateUserManagement(UserManagement userManagement)
    {
        return userManagementMapper.updateUserManagement(userManagement);
    }

    /**
     * 批量删除用户管理
     * 
     * @param userIds 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUserManagementByUserIds(Long[] userIds)
    {
        return userManagementMapper.deleteUserManagementByUserIds(userIds);
    }

    /**
     * 删除用户管理信息
     * 
     * @param userId 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUserManagementByUserId(Long userId)
    {
        return userManagementMapper.deleteUserManagementByUserId(userId);
    }
}
