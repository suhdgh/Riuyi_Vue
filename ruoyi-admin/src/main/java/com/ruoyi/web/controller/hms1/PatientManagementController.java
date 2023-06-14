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
import com.ruoyi.hms1.domain.PatientManagement;
import com.ruoyi.hms1.service.IPatientManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 患者管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/patient")
public class PatientManagementController extends BaseController
{
    @Autowired
    private IPatientManagementService patientManagementService;

    /**
     * 查询患者管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:list')")
    @GetMapping("/list")
    public TableDataInfo list(PatientManagement patientManagement)
    {
        startPage();
        List<PatientManagement> list = patientManagementService.selectPatientManagementList(patientManagement);
        return getDataTable(list);
    }

    /**
     * 导出患者管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:export')")
    @Log(title = "患者管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PatientManagement patientManagement)
    {
        List<PatientManagement> list = patientManagementService.selectPatientManagementList(patientManagement);
        ExcelUtil<PatientManagement> util = new ExcelUtil<PatientManagement>(PatientManagement.class);
        util.exportExcel(response, list, "患者管理数据");
    }

    /**
     * 获取患者管理详细信息
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:query')")
    @GetMapping(value = "/{patientId}")
    public AjaxResult getInfo(@PathVariable("patientId") String patientId)
    {
        return success(patientManagementService.selectPatientManagementByPatientId(patientId));
    }

    /**
     * 新增患者管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:add')")
    @Log(title = "患者管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PatientManagement patientManagement)
    {
        return toAjax(patientManagementService.insertPatientManagement(patientManagement));
    }

    /**
     * 修改患者管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:edit')")
    @Log(title = "患者管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PatientManagement patientManagement)
    {
        return toAjax(patientManagementService.updatePatientManagement(patientManagement));
    }

    /**
     * 删除患者管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:patient:remove')")
    @Log(title = "患者管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{patientIds}")
    public AjaxResult remove(@PathVariable String[] patientIds)
    {
        return toAjax(patientManagementService.deletePatientManagementByPatientIds(patientIds));
    }
}
