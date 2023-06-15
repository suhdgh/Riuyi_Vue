package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 记录排班占比最多对象 max_specialty_num
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class MaxSpecialtyNum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 科室 */
    @Excel(name = "科室")
    private String specialty;

    /** 医生数量 */
    @Excel(name = "医生数量")
    private Long doctorCount;

    /** 护士数量 */
    @Excel(name = "护士数量")
    private Long nurseCount;

    /** 总人数 */
    @Excel(name = "总人数")
    private Long totalCount;

    /** 百分比 */
    @Excel(name = "百分比")
    private BigDecimal percentage;

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setDoctorCount(Long doctorCount) 
    {
        this.doctorCount = doctorCount;
    }

    public Long getDoctorCount() 
    {
        return doctorCount;
    }
    public void setNurseCount(Long nurseCount) 
    {
        this.nurseCount = nurseCount;
    }

    public Long getNurseCount() 
    {
        return nurseCount;
    }
    public void setTotalCount(Long totalCount) 
    {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() 
    {
        return totalCount;
    }
    public void setPercentage(BigDecimal percentage) 
    {
        this.percentage = percentage;
    }

    public BigDecimal getPercentage() 
    {
        return percentage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("specialty", getSpecialty())
            .append("doctorCount", getDoctorCount())
            .append("nurseCount", getNurseCount())
            .append("totalCount", getTotalCount())
            .append("percentage", getPercentage())
            .toString();
    }
}
