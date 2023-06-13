package com.ruoyi.hms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生管理对象 doctor_management
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public class DoctorManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生id */
    private Long doctorId;

    /** 医生姓名 */
    @Excel(name = "医生姓名")
    private String fullName;

    /** 医生专业 */
    @Excel(name = "医生专业")
    private String specialty;

    /** 医生资质 */
    @Excel(name = "医生资质")
    private String qualification;

    public void setDoctorId(Long doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Long getDoctorId() 
    {
        return doctorId;
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
            .append("doctorId", getDoctorId())
            .append("fullName", getFullName())
            .append("specialty", getSpecialty())
            .append("qualification", getQualification())
            .toString();
    }
}
