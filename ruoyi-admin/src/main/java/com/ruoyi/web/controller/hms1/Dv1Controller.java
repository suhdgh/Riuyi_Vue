package com.ruoyi.web.controller.hms1;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.hms1.domain.Medication;
import com.ruoyi.hms1.domain.NurseSpecialty;
import com.ruoyi.hms1.domain.PercentageGender;
import com.ruoyi.hms1.service.IDv1Service;
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
import com.ruoyi.hms1.domain.AgeNum;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 就诊年龄分段Controller
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
@RestController
@RequestMapping("/hms1/dv1")
public class Dv1Controller extends BaseController
{
    @Autowired
    private IDv1Service dv1Service;

    /**
     * 查询就诊年龄分段列表
     */
    @GetMapping("/AgeNum")
    public TableDataInfo list(AgeNum ageNum)
    {
        startPage();
        List<AgeNum> list = dv1Service.selectAgeNumList(ageNum);
        return getDataTable(list);
    }

    /**
     * 查询药品信息列表
     */
    @GetMapping("/Medication")
    public TableDataInfo list(Medication medication)
    {
        startPage();
        List<Medication> list = dv1Service.selectMedicationList(medication);
        return getDataTable(list);
    }

    /**
     * 查询护士科室对应列表
     */
    @GetMapping("/NurseSpecialty")
    public TableDataInfo list(NurseSpecialty nurseSpecialty)
    {
        startPage();
        List<NurseSpecialty> list = dv1Service.selectNurseSpecialtyList(nurseSpecialty);
        return getDataTable(list);
    }

    /**
     * 查询男女比例列表
     */
    @GetMapping("/PercentageGender")
    public TableDataInfo list(PercentageGender percentageGender)
    {
        startPage();
        List<PercentageGender> list = dv1Service.selectPercentageGenderList(percentageGender);
        return getDataTable(list);
    }

}
