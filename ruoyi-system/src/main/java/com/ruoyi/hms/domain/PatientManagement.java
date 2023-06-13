package com.ruoyi.hms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者管理对象 patient_management
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public class PatientManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 患者id */
    private Long patientId;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String fullName;

    /** 患者性别 */
    @Excel(name = "患者性别")
    private String gender;

    /** 患者年龄 */
    @Excel(name = "患者年龄")
    private Long age;

    /** 患者联系方式 */
    @Excel(name = "患者联系方式")
    private String contact;

    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    public String getFullName() 
    {
        return fullName;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("patientId", getPatientId())
            .append("fullName", getFullName())
            .append("gender", getGender())
            .append("age", getAge())
            .append("contact", getContact())
            .toString();
    }
}
