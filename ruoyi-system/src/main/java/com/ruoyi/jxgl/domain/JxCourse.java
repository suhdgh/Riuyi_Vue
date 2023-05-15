package com.ruoyi.jxgl.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程表
 *
 * @author ruoyi
 */
public class JxCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 课程编码 */
    @Excel(name = "课程编码")
    private String cno;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String cname;

    /** 先修课号 */
    @Excel(name = "先修课号")
    private String cpno;

    /** 学分 */
    @Excel(name = "学分")
    private String ccredit;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public String getCcredit() {
        return ccredit;
    }

    public void setCcredit(String ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "JxCourse{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cpno='" + cpno + '\'' +
                ", ccredit='" + ccredit + '\'' +
                '}';
    }
}

