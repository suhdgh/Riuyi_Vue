package com.ruoyi.jxgl.service;

import com.ruoyi.jxgl.domain.JxStudent;

import java.util.List;

/**
 * 岗位信息 服务层
 * 
 * @author ruoyi
 */
public interface JxStudentService
{
    /**
     * 查询岗位信息集合
     * 
     * @param student 岗位信息
     * @return 岗位列表
     */
    public List<JxStudent> selectStudentList(JxStudent student);

}
