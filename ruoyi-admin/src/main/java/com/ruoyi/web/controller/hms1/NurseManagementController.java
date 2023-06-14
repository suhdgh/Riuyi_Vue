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
import com.ruoyi.hms1.domain.NurseManagement;
import com.ruoyi.hms1.service.INurseManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 护士管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/nurse")
public class NurseManagementController extends BaseController
{
    @Autowired
    private INurseManagementService nurseManagementService;

    /**
     * 查询护士管理列表
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:list')")
    @GetMapping("/list")
    public TableDataInfo list(NurseManagement nurseManagement)
    {
        startPage();
        List<NurseManagement> list = nurseManagementService.selectNurseManagementList(nurseManagement);
        return getDataTable(list);
    }

    /**
     * 导出护士管理列表
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:export')")
    @Log(title = "护士管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NurseManagement nurseManagement)
    {
        List<NurseManagement> list = nurseManagementService.selectNurseManagementList(nurseManagement);
        ExcelUtil<NurseManagement> util = new ExcelUtil<NurseManagement>(NurseManagement.class);
        util.exportExcel(response, list, "护士管理数据");
    }

    /**
     * 获取护士管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:query')")
    @GetMapping(value = "/{nurseId}")
    public AjaxResult getInfo(@PathVariable("nurseId") String nurseId)
    {
        return success(nurseManagementService.selectNurseManagementByNurseId(nurseId));
    }

    /**
     * 新增护士管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:add')")
    @Log(title = "护士管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NurseManagement nurseManagement)
    {
        return toAjax(nurseManagementService.insertNurseManagement(nurseManagement));
    }

    /**
     * 修改护士管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:edit')")
    @Log(title = "护士管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NurseManagement nurseManagement)
    {
        return toAjax(nurseManagementService.updateNurseManagement(nurseManagement));
    }

    /**
     * 删除护士管理
     */
    @PreAuthorize("@ss.hasPermi('hms1:nurse:remove')")
    @Log(title = "护士管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{nurseIds}")
    public AjaxResult remove(@PathVariable String[] nurseIds)
    {
        return toAjax(nurseManagementService.deleteNurseManagementByNurseIds(nurseIds));
    }
}
