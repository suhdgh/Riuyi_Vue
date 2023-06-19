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
import com.ruoyi.hms1.domain.WardManagement;
import com.ruoyi.hms1.service.IWardManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病房管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@RestController
@RequestMapping("/hms1/ward")
public class WardManagementController extends BaseController
{
    @Autowired
    private IWardManagementService wardManagementService;

    /**
     * 查询病房管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:list')")
    @GetMapping("/list")
    public TableDataInfo list(WardManagement wardManagement)
    {
//        startPage();
        List<WardManagement> list = wardManagementService.selectWardManagementList(wardManagement);
        return getDataTable(list);
    }

    /**
     * 导出病房管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:export')")
    @Log(title = "病房管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WardManagement wardManagement)
    {
        List<WardManagement> list = wardManagementService.selectWardManagementList(wardManagement);
        ExcelUtil<WardManagement> util = new ExcelUtil<WardManagement>(WardManagement.class);
        util.exportExcel(response, list, "病房管理数据");
    }

    /**
     * 获取病房管理详细信息
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:query')")
    @GetMapping(value = "/{wardId}")
    public AjaxResult getInfo(@PathVariable("wardId") String wardId)
    {
        return success(wardManagementService.selectWardManagementByWardId(wardId));
    }

    /**
     * 新增病房管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:add')")
    @Log(title = "病房管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WardManagement wardManagement)
    {
        return toAjax(wardManagementService.insertWardManagement(wardManagement));
    }

    /**
     * 修改病房管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:edit')")
    @Log(title = "病房管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WardManagement wardManagement)
    {
        return toAjax(wardManagementService.updateWardManagement(wardManagement));
    }

    /**
     * 删除病房管理
     */
//    @PreAuthorize("@ss.hasPermi('hms1:ward:remove')")
    @Log(title = "病房管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{wardIds}")
    public AjaxResult remove(@PathVariable String[] wardIds)
    {
        return toAjax(wardManagementService.deleteWardManagementByWardIds(wardIds));
    }
}
