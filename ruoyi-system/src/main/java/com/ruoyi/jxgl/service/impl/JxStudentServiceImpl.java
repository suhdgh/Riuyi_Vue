package com.ruoyi.jxgl.service.impl;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.mapper.JxStudentMapper;

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
public class JxStudentServiceImpl implements JxStudentService
{
    @Autowired(required = false)
    private JxStudentMapper studentMapper;


    /**
     * 查询岗位信息集合
     * 
     * @param student 岗位信息
     * @return 岗位信息集合
     */
    @Override
    public List<JxStudent> selectStudentList(JxStudent student) {
        return studentMapper.selectStudentList(student);
    }
}
