package com.ruoyi.web.controller.hms1;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.hms1.domain.ScheduleManagement;
import com.ruoyi.hms1.service.IScheduleManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 排班管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/schedule")
public class ScheduleManagementController extends BaseController
{
    @Autowired
    private IScheduleManagementService scheduleManagementService;

    /**
     * 查询排班管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScheduleManagement scheduleManagement)
    {
        startPage();
        List<ScheduleManagement> list = scheduleManagementService.selectScheduleManagementList(scheduleManagement);
        return getDataTable(list);
    }

    /**
     * 导出排班管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:export')")
    @Log(title = "排班管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScheduleManagement scheduleManagement)
    {
        List<ScheduleManagement> list = scheduleManagementService.selectScheduleManagementList(scheduleManagement);
        ExcelUtil<ScheduleManagement> util = new ExcelUtil<ScheduleManagement>(ScheduleManagement.class);
        util.exportExcel(response, list, "排班管理数据");
    }

    /**
     * 获取排班管理详细信息
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:query')")
    @GetMapping(value = "/{scheduleId}")
    public AjaxResult getInfo(@PathVariable("scheduleId") String scheduleId)
    {
        return success(scheduleManagementService.selectScheduleManagementByScheduleId(scheduleId));
    }

    /**
     * 新增排班管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:add')")
    @Log(title = "排班管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScheduleManagement scheduleManagement)
    {
        return toAjax(scheduleManagementService.insertScheduleManagement(scheduleManagement));
    }

    /**
     * 修改排班管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:edit')")
    @Log(title = "排班管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScheduleManagement scheduleManagement)
    {
        return toAjax(scheduleManagementService.updateScheduleManagement(scheduleManagement));
    }

    /**
     * 删除排班管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:schedule:remove')")
    @Log(title = "排班管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{scheduleIds}")
    public AjaxResult remove(@PathVariable String[] scheduleIds)
    {
        return toAjax(scheduleManagementService.deleteScheduleManagementByScheduleIds(scheduleIds));
    }
}
