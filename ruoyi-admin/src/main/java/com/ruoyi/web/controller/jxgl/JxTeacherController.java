package com.ruoyi.web.controller.jxgl;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.jxgl.domain.JxStudent;
import com.ruoyi.jxgl.domain.JxTeachers;
import com.ruoyi.jxgl.service.JxStudentService;
import com.ruoyi.jxgl.service.JxTeacherService;
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
@RequestMapping("/jxgl/teacher")
public class JxTeacherController extends BaseController {
    @Autowired(required = false)
    private JxTeacherService teacherService;

    /**
     * 获取岗位列表
     */
    @PreAuthorize("@ss.hasPermi('system:post:list')")
    @GetMapping("/list")
    public TableDataInfo list(JxTeachers teachers) {
        startPage();
        List<JxTeachers> list = teacherService.selectTeacherList(teachers);
        return getDataTable(list);
    }

}
