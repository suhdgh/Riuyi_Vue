package com.ruoyi.jxgl.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教师表
 *
 * @author ruoyi
 */
public class JxTeachers extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    /** 教师工号 */
    @Excel(name = "教师工号")
    private String tno;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String tname;

    /** 专业职称  */
    @Excel(name = "专业职称")
    private String ps;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String tbirthday;

    /** 所在部门  */
    @Excel(name = "所在部门")
    private String tdept;

    /** 性别 */
    @Excel(name = "性别")
    private String tsex;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public String getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(String tbirthday) {
        this.tbirthday = tbirthday;
    }

    public String getTdept() {
        return tdept;
    }

    public void setTdept(String tdept) {
        this.tdept = tdept;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    @Override
    public String toString() {
        return "JxTeachers{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", ps='" + ps + '\'' +
                ", tbirthday='" + tbirthday + '\'' +
                ", tdept='" + tdept + '\'' +
                ", tsex='" + tsex + '\'' +
                '}';
    }
}

