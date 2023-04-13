package com.ruoyi.jxgl.mapper;

import java.util.List;
import com.ruoyi.jxgl.domain.JxStudent;

/**
 * 岗位信息 数据层
 *
 * @author ruoyi
 */
public interface JxStudentMapper
{
    /**
     * 取得学生信息
     *
     * @param student 学生信息
     * @return 学生信息
     */
    public List<JxStudent> selectStudentList(JxStudent student);


}
