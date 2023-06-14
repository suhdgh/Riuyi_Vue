package com.ruoyi.hms1.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 排班管理对象 schedule_management
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public class ScheduleManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 排班ID */
    private String scheduleId;

    /** 医生ID */
    @Excel(name = "医生ID")
    private String doctorId;

    /** 护士ID */
    @Excel(name = "护士ID")
    private String nurseId;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scheduleDate;

    /** 时间段 */
    @Excel(name = "时间段")
    private String timeSlot;

    public void setScheduleId(String scheduleId) 
    {
        this.scheduleId = scheduleId;
    }

    public String getScheduleId() 
    {
        return scheduleId;
    }
    public void setDoctorId(String doctorId) 
    {
        this.doctorId = doctorId;
    }

    public String getDoctorId() 
    {
        return doctorId;
    }
    public void setNurseId(String nurseId) 
    {
        this.nurseId = nurseId;
    }

    public String getNurseId() 
    {
        return nurseId;
    }
    public void setScheduleDate(Date scheduleDate) 
    {
        this.scheduleDate = scheduleDate;
    }

    public Date getScheduleDate() 
    {
        return scheduleDate;
    }
    public void setTimeSlot(String timeSlot) 
    {
        this.timeSlot = timeSlot;
    }

    public String getTimeSlot() 
    {
        return timeSlot;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("scheduleId", getScheduleId())
            .append("doctorId", getDoctorId())
            .append("nurseId", getNurseId())
            .append("scheduleDate", getScheduleDate())
            .append("timeSlot", getTimeSlot())
            .toString();
    }
}
