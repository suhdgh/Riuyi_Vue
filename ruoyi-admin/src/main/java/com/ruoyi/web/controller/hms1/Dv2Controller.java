package com.ruoyi.web.controller.hms1;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.hms1.domain.*;
import com.ruoyi.hms1.service.IDv2Service;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 各科室就诊男女Controller
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
@RestController
@RequestMapping("/hms1/dv2")
public class Dv2Controller extends BaseController
{
    @Autowired
    private IDv2Service dv2Service;

    /**
     * 查询各科室就诊男女列表
     */
    @GetMapping("/MailFemailMedical")
    public TableDataInfo list(MailFemailMedical mailFemailMedical)
    {
        startPage();
        List<MailFemailMedical> list = dv2Service.selectMailFemailMedicalList(mailFemailMedical);
        return getDataTable(list);
    }

    /**
     * 查询记录排班占比最多列表
     */
    @GetMapping("/MaxSpecialtyNum")
    public TableDataInfo list(MaxSpecialtyNum maxSpecialtyNum)
    {
        startPage();
        List<MaxSpecialtyNum> list = dv2Service.selectMaxSpecialtyNumList(maxSpecialtyNum);
        return getDataTable(list);
    }

    /**
     * 查询就诊患者排名前五的科室列表
     */
    @GetMapping("/MedicalNum")
    public TableDataInfo list(MedicalNum medicalNum)
    {
        startPage();
        List<MedicalNum> list = dv2Service.selectMedicalNumList(medicalNum);
        return getDataTable(list);
    }

    /**
     * 查询完成付款列表
     */
    @GetMapping("/Paid")
    public TableDataInfo list(Paid paid)
    {
        startPage();
        List<Paid> list = dv2Service.selectPaidList(paid);
        return getDataTable(list);
    }

    /**
     * 查询未完成付款列表
     */
    @GetMapping("/Pending")
    public TableDataInfo list(Pending pending)
    {
        startPage();
        List<Pending> list = dv2Service.selectPendingList(pending);
        return getDataTable(list);
    }

    /**
     * 查询病房占有率列表
     */
    @GetMapping("/Ward")
    public TableDataInfo list(Ward ward)
    {
        startPage();
        List<Ward> list = dv2Service.selectWardList(ward);
        return getDataTable(list);
    }

}
