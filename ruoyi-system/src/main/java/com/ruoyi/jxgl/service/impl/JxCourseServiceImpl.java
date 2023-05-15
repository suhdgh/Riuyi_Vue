package com.ruoyi.jxgl.service.impl;

import com.ruoyi.jxgl.domain.JxCourse;
import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.mapper.JxCourseMapper;
import com.ruoyi.jxgl.mapper.JxStudentMapper;
import com.ruoyi.jxgl.service.JxCourseService;
import com.ruoyi.jxgl.service.JxStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 岗位信息 服务层处理
 * 
 * @author ruoyi
 */
@Service
public class JxCourseServiceImpl implements JxCourseService
{
    @Autowired(required = false)
    private JxCourseMapper courseMapper;


    /**
     * 查询岗位信息集合
     * 
     * @param course 岗位信息
     * @return 岗位信息集合
     */
    @Override
    public List<JxCourse> selectCourseList(JxCourse course) {
        return courseMapper.selectCourseList(course);
    }
}
