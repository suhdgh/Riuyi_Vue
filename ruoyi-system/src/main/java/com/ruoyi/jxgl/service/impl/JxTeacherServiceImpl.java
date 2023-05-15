package com.ruoyi.jxgl.service.impl;

import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.domain.JxTeachers;
import com.ruoyi.jxgl.mapper.JxStudentMapper;
import com.ruoyi.jxgl.mapper.JxTeacherMapper;
import com.ruoyi.jxgl.service.JxStudentService;
import com.ruoyi.jxgl.service.JxTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 岗位信息 服务层处理
 * 
 * @author ruoyi
 */
@Service
public class JxTeacherServiceImpl implements JxTeacherService
{
    @Autowired(required = false)
    private JxTeacherMapper teacherMapper;


    /**
     * 查询岗位信息集合
     * 
     * @param teachers 岗位信息
     * @return 岗位信息集合
     */
    @Override
    public List<JxTeachers> selectTeacherList(JxTeachers teachers) {
        return teacherMapper.selectTeacherList(teachers);
    }
}
