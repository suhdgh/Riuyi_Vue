package com.ruoyi.hms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 就诊记录对象 medical_records
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public class MedicalRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录ID */
    private Long recordId;

    /** 患者ID */
    @Excel(name = "患者ID")
    private Long patientId;

    /** 医生ID */
    @Excel(name = "医生ID")
    private Long doctorId;

    /** 诊断结果 */
    @Excel(name = "诊断结果")
    private String diagnosisResult;

    /** 处方药物 */
    @Excel(name = "处方药物")
    private String prescription;

    public void setRecordId(Long recordId) 
    {
        this.recordId = recordId;
    }

    public Long getRecordId() 
    {
        return recordId;
    }
    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setDoctorId(Long doctorId) 
    {
        this.doctorId = doctorId;
    }

    public Long getDoctorId() 
    {
        return doctorId;
    }
    public void setDiagnosisResult(String diagnosisResult) 
    {
        this.diagnosisResult = diagnosisResult;
    }

    public String getDiagnosisResult() 
    {
        return diagnosisResult;
    }
    public void setPrescription(String prescription) 
    {
        this.prescription = prescription;
    }

    public String getPrescription() 
    {
        return prescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("patientId", getPatientId())
            .append("doctorId", getDoctorId())
            .append("diagnosisResult", getDiagnosisResult())
            .append("prescription", getPrescription())
            .toString();
    }
}
