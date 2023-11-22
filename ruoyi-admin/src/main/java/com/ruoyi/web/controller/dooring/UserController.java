package com.ruoyi.web.controller.dooring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.dooring.domain.User;
import com.ruoyi.dooring.service.IUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户管理Controller
 *
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/vip")
public class UserController extends BaseController
{
    @Autowired
    private IUserService userService;

    /**
    * 登录
     */
    @PostMapping("/check")
    @CrossOrigin
    public AjaxResult login(@RequestBody User user , HttpServletResponse response)
    {
        // 添加跨域配置
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        // 根据用户名和密码查询用户
        User loginUser = userService.selectUserNCO(user.getN(), user.getCo());

        if (loginUser != null)
        {
            // 构建成功响应
            Map<String, Object> responseData = new HashMap<>();
            responseData.put("n", loginUser.getN());
            responseData.put("h5", loginUser.getH5());
            // 登录成功，返回用户信息
            return success(loginUser);
        }
        else
        {
            // 登录失败，返回错误信息
            return AjaxResult.error("用户名或密码错误");
        }
    }

    /**
     * 查询用户管理列表
     */
    @PostMapping("/list")
    public TableDataInfo list(User user)
    {
        startPage();
        List<User> list = userService.selectUserList(user);
        return getDataTable(list);
    }

    /**
     * 导出用户管理列表
     */
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, User user)
    {
        List<User> list = userService.selectUserList(user);
        ExcelUtil<User> util = new ExcelUtil<User>(User.class);
        util.exportExcel(response, list, "用户管理数据");
    }

    /**
     * 获取用户管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(userService.selectUserById(id));
    }

    /**
     * 新增用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody User user)
    {
        return toAjax(userService.insertUser(user));
    }

    /**
     * 修改用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody User user)
    {
        return toAjax(userService.updateUser(user));
    }

    /**
     * 删除用户管理
     */
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(userService.deleteUserByIds(ids));
    }
}
