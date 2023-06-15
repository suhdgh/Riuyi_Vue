package com.ruoyi.hms1.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 各科室就诊男女对象 mail_femail_medical
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class MailFemailMedical extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生专业 */
    @Excel(name = "医生专业")
    private String specialty;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long malePatientCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long femalePatientCount;

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setMalePatientCount(Long malePatientCount) 
    {
        this.malePatientCount = malePatientCount;
    }

    public Long getMalePatientCount() 
    {
        return malePatientCount;
    }
    public void setFemalePatientCount(Long femalePatientCount) 
    {
        this.femalePatientCount = femalePatientCount;
    }

    public Long getFemalePatientCount() 
    {
        return femalePatientCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("specialty", getSpecialty())
            .append("malePatientCount", getMalePatientCount())
            .append("femalePatientCount", getFemalePatientCount())
            .toString();
    }
}
