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
import com.ruoyi.hms1.domain.MedicalRecords;
import com.ruoyi.hms1.service.IMedicalRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 就诊记录Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/records")
public class MedicalRecordsController extends BaseController
{
    @Autowired
    private IMedicalRecordsService medicalRecordsService;

    /**
     * 查询就诊记录列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:records:list')")
    @GetMapping("/list")
    public TableDataInfo list(MedicalRecords medicalRecords)
    {
        startPage();
        List<MedicalRecords> list = medicalRecordsService.selectMedicalRecordsList(medicalRecords);
        return getDataTable(list);
    }

    /**
     * 导出就诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('hms1:records:export')")
    @Log(title = "就诊记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MedicalRecords medicalRecords)
    {
        List<MedicalRecords> list = medicalRecordsService.selectMedicalRecordsList(medicalRecords);
        ExcelUtil<MedicalRecords> util = new ExcelUtil<MedicalRecords>(MedicalRecords.class);
        util.exportExcel(response, list, "就诊记录数据");
    }

    /**
     * 获取就诊记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('hms1:records:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") String recordId)
    {
        return success(medicalRecordsService.selectMedicalRecordsByRecordId(recordId));
    }

    /**
     * 新增就诊记录
     */
    @PreAuthorize("@ss.hasPermi('hms1:records:add')")
    @Log(title = "就诊记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MedicalRecords medicalRecords)
    {
        return toAjax(medicalRecordsService.insertMedicalRecords(medicalRecords));
    }

    /**
     * 修改就诊记录
     */
    @PreAuthorize("@ss.hasPermi('hms1:records:edit')")
    @Log(title = "就诊记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MedicalRecords medicalRecords)
    {
        return toAjax(medicalRecordsService.updateMedicalRecords(medicalRecords));
    }

    /**
     * 删除就诊记录
     */
    @PreAuthorize("@ss.hasPermi('hms1:records:remove')")
    @Log(title = "就诊记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable String[] recordIds)
    {
        return toAjax(medicalRecordsService.deleteMedicalRecordsByRecordIds(recordIds));
    }
}
