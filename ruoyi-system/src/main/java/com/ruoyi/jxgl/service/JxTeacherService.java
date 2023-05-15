package com.ruoyi.jxgl.service;

import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.domain.JxTeachers;

import java.util.List;

/**
 * 岗位信息 服务层
 * 
 * @author ruoyi
 */
public interface JxTeacherService
{
    /**
     * 查询岗位信息集合
     * 
     * @param teachers 岗位信息
     * @return 岗位列表
     */
    public List<JxTeachers> selectTeacherList(JxTeachers teachers);

}
