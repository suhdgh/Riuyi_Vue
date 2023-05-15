package com.ruoyi.web.controller.jxgl;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.jxgl.domain.JxCourse;
import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.service.JxCourseService;
import com.ruoyi.jxgl.service.JxStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 岗位信息操作处理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/jxgl/course")
public class JxCourseController extends BaseController {
    @Autowired(required = false)
    private JxCourseService courseService;

    /**
     * 获取岗位列表
     */
//    @PreAuthorize("@ss.hasPermi('system:post:list')")
    @GetMapping("/list")
    public TableDataInfo list(JxCourse course) {
        startPage();
        List<JxCourse> list = courseService.selectCourseList(course);
        return getDataTable(list);
    }

}
