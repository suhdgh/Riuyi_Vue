package com.ruoyi.hms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 护士管理对象 nurse_management
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public class NurseManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 护士ID */
    private Long nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    private String fullName;

    /** 护士专业 */
    @Excel(name = "护士专业")
    private String specialty;

    /** 护士资质 */
    @Excel(name = "护士资质")
    private String qualification;

    public void setNurseId(Long nurseId) 
    {
        this.nurseId = nurseId;
    }

    public Long getNurseId() 
    {
        return nurseId;
    }
    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    public String getFullName() 
    {
        return fullName;
    }
    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }

    public String getSpecialty() 
    {
        return specialty;
    }
    public void setQualification(String qualification) 
    {
        this.qualification = qualification;
    }

    public String getQualification() 
    {
        return qualification;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("nurseId", getNurseId())
            .append("fullName", getFullName())
            .append("specialty", getSpecialty())
            .append("qualification", getQualification())
            .toString();
    }
}
