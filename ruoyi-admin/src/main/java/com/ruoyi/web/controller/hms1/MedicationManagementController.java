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
import com.ruoyi.hms1.domain.MedicationManagement;
import com.ruoyi.hms1.service.IMedicationManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/medication")
public class MedicationManagementController extends BaseController
{
    @Autowired
    private IMedicationManagementService medicationManagementService;

    /**
     * 查询药品管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:list')")
    @GetMapping("/list")
    public TableDataInfo list(MedicationManagement medicationManagement)
    {
//        startPage();
        List<MedicationManagement> list = medicationManagementService.selectMedicationManagementList(medicationManagement);
        return getDataTable(list);
    }

    /**
     * 导出药品管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:export')")
    @Log(title = "药品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MedicationManagement medicationManagement)
    {
        List<MedicationManagement> list = medicationManagementService.selectMedicationManagementList(medicationManagement);
        ExcelUtil<MedicationManagement> util = new ExcelUtil<MedicationManagement>(MedicationManagement.class);
        util.exportExcel(response, list, "药品管理数据");
    }

    /**
     * 获取药品管理详细信息
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:query')")
    @GetMapping(value = "/{medicationId}")
    public AjaxResult getInfo(@PathVariable("medicationId") String medicationId)
    {
        return success(medicationManagementService.selectMedicationManagementByMedicationId(medicationId));
    }

    /**
     * 新增药品管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:add')")
    @Log(title = "药品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MedicationManagement medicationManagement)
    {
        return toAjax(medicationManagementService.insertMedicationManagement(medicationManagement));
    }

    /**
     * 修改药品管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:edit')")
    @Log(title = "药品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MedicationManagement medicationManagement)
    {
        return toAjax(medicationManagementService.updateMedicationManagement(medicationManagement));
    }

    /**
     * 删除药品管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:medication:remove')")
    @Log(title = "药品管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{medicationIds}")
    public AjaxResult remove(@PathVariable String[] medicationIds)
    {
        return toAjax(medicationManagementService.deleteMedicationManagementByMedicationIds(medicationIds));
    }
}
