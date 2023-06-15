package com.ruoyi.hms1.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 护士科室对应对象 nurse_specialty
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class NurseSpecialty extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 护士专业 */
    @Excel(name = "护士专业")
    private String specialty;

    /** 护士数量 */
    @Excel(name = "护士数量")
    private Long nurseCount;

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setNurseCount(Long nurseCount) 
    {
        this.nurseCount = nurseCount;
    }

    public Long getNurseCount() 
    {
        return nurseCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("specialty", getSpecialty())
            .append("nurseCount", getNurseCount())
            .toString();
    }
}
