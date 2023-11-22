package com.ruoyi.dooring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.dooring.mapper.UserMapper;
import com.ruoyi.dooring.domain.User;
import com.ruoyi.dooring.service.IUserService;

/**
 * 用户管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class UserServiceImpl implements IUserService 
{
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    @Override
    public User selectUserById(String id)
    {
        return userMapper.selectUserById(id);
    }

    @Override
    public User selectUserNCO(String n, String co){
        return userMapper.selectUserNCo(n, co);
    }
    /**
     * 查询用户管理列表
     * 
     * @param user 用户管理
     * @return 用户管理
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增用户管理
     * 
     * @param user 用户管理
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userMapper.insertUser(user);
    }

    /**
     * 修改用户管理
     * 
     * @param user 用户管理
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUserByIds(String[] ids)
    {
        return userMapper.deleteUserByIds(ids);
    }

    /**
     * 删除用户管理信息
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteUserById(String id)
    {
        return userMapper.deleteUserById(id);
    }
}
