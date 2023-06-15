package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 完成付款对象 paid
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class Paid extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal percentage;

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
            .append("percentage", getPercentage())
            .toString();
    }
}
