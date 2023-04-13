package com.ruoyi.jxgl.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 岗位表 sys_post
 *
 * @author ruoyi
 */
public class JxStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 学号 */
    @Excel(name = "学号")
    private String sno;

    /** 姓名 */
    @Excel(name = "姓名")
    private String sname;

    /** 姓名 */
    @Excel(name = "班级")
    private String stuclass;

    /** 性别 */
    @Excel(name = "性别")
    private String ssex;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String bday;

    /** 生源地 */
    @Excel(name = "生源地")
    private String bplace;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String IDNum;

    /** 身份证号 */
    @Excel(name = "系别")
    private String sdept;

    /** 电话 */
    @Excel(name = "电话号码")
    private String phone;


    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getBplace() {
        return bplace;
    }

    public void setBplace(String bplace) {
        this.bplace = bplace;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "JxStudent{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", stuclass='" + stuclass + '\'' +
                ", ssex='" + ssex + '\'' +
                ", bday='" + bday + '\'' +
                ", bplace='" + bplace + '\'' +
                ", IDNum='" + IDNum + '\'' +
                ", sdept='" + sdept + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

