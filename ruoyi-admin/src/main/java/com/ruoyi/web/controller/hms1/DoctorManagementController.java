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
import com.ruoyi.hms1.domain.DoctorManagement;
import com.ruoyi.hms1.service.IDoctorManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/doctor")
public class DoctorManagementController extends BaseController
{
    @Autowired
    private IDoctorManagementService doctorManagementService;

    /**
     * 查询医生管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:doctor:list')")
    @GetMapping("/list")
    public TableDataInfo list(DoctorManagement doctorManagement)
    {
        startPage();
        List<DoctorManagement> list = doctorManagementService.selectDoctorManagementList(doctorManagement);
        return getDataTable(list);
    }

    /**
     * 导出医生管理列表
     */
    @PreAuthorize("@ss.hasPermi('hms1:doctor:export')")
    @Log(title = "医生管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DoctorManagement doctorManagement)
    {
        List<DoctorManagement> list = doctorManagementService.selectDoctorManagementList(doctorManagement);
        ExcelUtil<DoctorManagement> util = new ExcelUtil<DoctorManagement>(DoctorManagement.class);
        util.exportExcel(response, list, "医生管理数据");
    }

    /**
     * 获取医生管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('hms1:doctor:query')")
    @GetMapping(value = "/{doctorId}")
    public AjaxResult getInfo(@PathVariable("doctorId") String doctorId)
    {
        return success(doctorManagementService.selectDoctorManagementByDoctorId(doctorId));
    }

    /**
     * 新增医生管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:doctor:add')")
    @Log(title = "医生管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DoctorManagement doctorManagement)
    {
        return toAjax(doctorManagementService.insertDoctorManagement(doctorManagement));
    }

    /**
     * 修改医生管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:doctor:edit')")
    @Log(title = "医生管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DoctorManagement doctorManagement)
    {
        return toAjax(doctorManagementService.updateDoctorManagement(doctorManagement));
    }

    /**
     * 删除医生管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:doctor:remove')")
    @Log(title = "医生管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{doctorIds}")
    public AjaxResult remove(@PathVariable String[] doctorIds)
    {
        return toAjax(doctorManagementService.deleteDoctorManagementByDoctorIds(doctorIds));
    }
}
