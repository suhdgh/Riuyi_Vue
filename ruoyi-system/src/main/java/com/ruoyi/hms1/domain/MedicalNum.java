package com.ruoyi.hms1.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 就诊患者排名前五的科室对象 medical_num
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class MedicalNum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生专业 */
    @Excel(name = "医生专业")
    private String specialty;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long patientCount;

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setPatientCount(Long patientCount) 
    {
        this.patientCount = patientCount;
    }

    public Long getPatientCount() 
    {
        return patientCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("specialty", getSpecialty())
            .append("patientCount", getPatientCount())
            .toString();
    }
}
