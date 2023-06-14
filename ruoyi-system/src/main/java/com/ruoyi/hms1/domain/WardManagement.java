package com.ruoyi.hms1.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病房管理对象 ward_management
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public class WardManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病房号 */
    private String wardId;

    /** 床位数量 */
    @Excel(name = "床位数量")
    private Long bedCount;

    /** 病房状态 */
    @Excel(name = "病房状态")
    private String wardStatus;

    public void setWardId(String wardId) 
    {
        this.wardId = wardId;
    }

    public String getWardId() 
    {
        return wardId;
    }
    public void setBedCount(Long bedCount) 
    {
        this.bedCount = bedCount;
    }

    public Long getBedCount() 
    {
        return bedCount;
    }
    public void setWardStatus(String wardStatus) 
    {
        this.wardStatus = wardStatus;
    }

    public String getWardStatus() 
    {
        return wardStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("wardId", getWardId())
            .append("bedCount", getBedCount())
            .append("wardStatus", getWardStatus())
            .toString();
    }
}
