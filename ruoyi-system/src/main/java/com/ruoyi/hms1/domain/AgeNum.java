package com.ruoyi.hms1.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 就诊年龄分段对象 age_num
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class AgeNum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 年龄段 */
    @Excel(name = "年龄段")
    private String ageGroup;

    /** 总数 */
    @Excel(name = "总数")
    private Long recordCount;

    public void setAgeGroup(String ageGroup) 
    {
        this.ageGroup = ageGroup;
    }

    public String getAgeGroup() 
    {
        return ageGroup;
    }
    public void setRecordCount(Long recordCount) 
    {
        this.recordCount = recordCount;
    }

    public Long getRecordCount() 
    {
        return recordCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ageGroup", getAgeGroup())
            .append("recordCount", getRecordCount())
            .toString();
    }
}
