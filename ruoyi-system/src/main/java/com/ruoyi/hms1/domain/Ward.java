package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病房占有率对象 ward
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class Ward extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal occupancyRate;

    public void setOccupancyRate(BigDecimal occupancyRate) 
    {
        this.occupancyRate = occupancyRate;
    }

    public BigDecimal getOccupancyRate() 
    {
        return occupancyRate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("occupancyRate", getOccupancyRate())
            .toString();
    }
}
