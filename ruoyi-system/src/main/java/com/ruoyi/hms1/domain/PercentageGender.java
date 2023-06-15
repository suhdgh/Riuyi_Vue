package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 男女比例对象 percentage_gender
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class PercentageGender extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 患者性别 */
    @Excel(name = "患者性别")
    private String gender;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal percentage;

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
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
            .append("gender", getGender())
            .append("totalCount", getTotalCount())
            .append("percentage", getPercentage())
            .toString();
    }
}
