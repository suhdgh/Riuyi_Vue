package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品信息对象 medication
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public class Medication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 药品名称 */
    @Excel(name = "药品名称")
    private String name;

    /** 库存量 */
    @Excel(name = "库存量")
    private Long stockQuantity;

    /** 药品规格 */
    @Excel(name = "药品规格")
    private String specification;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStockQuantity(Long stockQuantity) 
    {
        this.stockQuantity = stockQuantity;
    }

    public Long getStockQuantity() 
    {
        return stockQuantity;
    }
    public void setSpecification(String specification) 
    {
        this.specification = specification;
    }

    public String getSpecification() 
    {
        return specification;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("stockQuantity", getStockQuantity())
            .append("specification", getSpecification())
            .append("price", getPrice())
            .toString();
    }
}
