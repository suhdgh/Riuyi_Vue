package com.ruoyi.hms1.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 费用管理对象 billing_management
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public class BillingManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 费用ID */
    private String billingId;

    /** 记录id */
    @Excel(name = "记录id")
    private String recordId;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 支付状态 */
    @Excel(name = "支付状态")
    private String paymentStatus;

    public void setBillingId(String billingId) 
    {
        this.billingId = billingId;
    }

    public String getBillingId() 
    {
        return billingId;
    }
    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setPaymentStatus(String paymentStatus) 
    {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() 
    {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("billingId", getBillingId())
            .append("recordId", getRecordId())
            .append("amount", getAmount())
            .append("paymentStatus", getPaymentStatus())
            .toString();
    }
}
