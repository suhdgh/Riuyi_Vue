package com.ruoyi.jxgl.mapper;

import com.ruoyi.jxgl.domain.JxCourse;
import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.domain.JxTeachers;

import java.util.List;

/**
 * 岗位信息 数据层
 *
 * @author ruoyi
 */
public interface JxCourseMapper
{
    /**
     * 取得学生信息
     *
     * @param course 学生信息
     * @return 学生信息
     */
    public List<JxCourse> selectCourseList(JxCourse course);

}
