package com.ruoyi.web.controller.hms;

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
import com.ruoyi.hms.domain.BillingManagement;
import com.ruoyi.hms.service.IBillingManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 费用管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@RestController
@RequestMapping("/hms/billing")
public class BillingManagementController extends BaseController
{
    @Autowired
    private IBillingManagementService billingManagementService;

    /**
     * 查询费用管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(BillingManagement billingManagement)
    {
        startPage();
        List<BillingManagement> list = billingManagementService.selectBillingManagementList(billingManagement);
        return getDataTable(list);
    }

    /**
     * 导出费用管理列表
     */
    @PreAuthorize("@ss.hasPermi('hms:management:export')")
    @Log(title = "费用管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BillingManagement billingManagement)
    {
        List<BillingManagement> list = billingManagementService.selectBillingManagementList(billingManagement);
        ExcelUtil<BillingManagement> util = new ExcelUtil<BillingManagement>(BillingManagement.class);
        util.exportExcel(response, list, "费用管理数据");
    }

    /**
     * 获取费用管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('hms:management:query')")
    @GetMapping(value = "/{billingId}")
    public AjaxResult getInfo(@PathVariable("billingId") Long billingId)
    {
        return success(billingManagementService.selectBillingManagementByBillingId(billingId));
    }

    /**
     * 新增费用管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:add')")
    @Log(title = "费用管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BillingManagement billingManagement)
    {
        return toAjax(billingManagementService.insertBillingManagement(billingManagement));
    }

    /**
     * 修改费用管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:edit')")
    @Log(title = "费用管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BillingManagement billingManagement)
    {
        return toAjax(billingManagementService.updateBillingManagement(billingManagement));
    }

    /**
     * 删除费用管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:remove')")
    @Log(title = "费用管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{billingIds}")
    public AjaxResult remove(@PathVariable Long[] billingIds)
    {
        return toAjax(billingManagementService.deleteBillingManagementByBillingIds(billingIds));
    }
}
