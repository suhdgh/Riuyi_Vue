package com.ruoyi.dooring.mapper;

import java.util.List;
import com.ruoyi.dooring.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface UserMapper 
{
    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    public User selectUserById(String id);


    /**
     * 查询用户管理列表
     * 
     * @param user 用户管理
     * @return 用户管理集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增用户管理
     * 
     * @param user 用户管理
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改用户管理
     * 
     * @param user 用户管理
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除用户管理
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    public int deleteUserById(String id);

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserByIds(String[] ids);

    User selectUserNCo(@Param("n") String n, @Param("co") String co);
}
