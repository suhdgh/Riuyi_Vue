package com.ruoyi.jxgl.mapper;

import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.domain.JxTeachers;

import java.util.List;

/**
 * 岗位信息 数据层
 *
 * @author ruoyi
 */
public interface JxTeacherMapper
{
    /**
     * 取得学生信息
     *
     * @param teachers 学生信息
     * @return 学生信息
     */
    public List<JxTeachers> selectTeacherList(JxTeachers teachers);


}
