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
import com.ruoyi.hms.domain.UserManagement;
import com.ruoyi.hms.service.IUserManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户管理Controller
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@RestController
@RequestMapping("/hms/user")
public class UserManagementController extends BaseController
{
    @Autowired
    private IUserManagementService userManagementService;

    /**
     * 查询用户管理列表
     */
//    @PreAuthorize("@ss.hasPermi('hms:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserManagement userManagement)
    {
        startPage();
        List<UserManagement> list = userManagementService.selectUserManagementList(userManagement);
        return getDataTable(list);
    }

    /**
     * 导出用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('hms:management:export')")
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserManagement userManagement)
    {
        List<UserManagement> list = userManagementService.selectUserManagementList(userManagement);
        ExcelUtil<UserManagement> util = new ExcelUtil<UserManagement>(UserManagement.class);
        util.exportExcel(response, list, "用户管理数据");
    }

    /**
     * 获取用户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('hms:management:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(userManagementService.selectUserManagementByUserId(userId));
    }

    /**
     * 新增用户管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:add')")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserManagement userManagement)
    {
        return toAjax(userManagementService.insertUserManagement(userManagement));
    }

    /**
     * 修改用户管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:edit')")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserManagement userManagement)
    {
        return toAjax(userManagementService.updateUserManagement(userManagement));
    }

    /**
     * 删除用户管理
     */
    @PreAuthorize("@ss.hasPermi('hms:management:remove')")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(userManagementService.deleteUserManagementByUserIds(userIds));
    }
}
