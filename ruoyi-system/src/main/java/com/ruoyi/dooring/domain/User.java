package com.ruoyi.dooring.domain;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户管理对象 user
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户唯一ID */
    private String id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String n;

    /** 微信号 */
    @Excel(name = "微信号")
    private String wx;

    /** 密码 */
    @Excel(name = "密码")
    private String co;

    /** 存储订单数据的字段 */
    @Excel(name = "存储订单数据的字段")
    private String od;

    /** 身份信息 */
    @Excel(name = "身份信息")
    private String rp;

    /** 存储H5数据的字段 */
    @Excel(name = "存储H5数据的字段")
    private String h5;

    /** 存储模板数据的字段 */
    @Excel(name = "存储模板数据的字段")
    private String tpl;

    /** H5数量 */
    @Excel(name = "H5数量")
    private Long h5Num;

    /** 模板数量 */
    @Excel(name = "模板数量")
    private Long tplNum;

    public User() {
        // 在这里初始化 JSON 格式的数据
        String jsonData = "{\"name\":\"John\", \"age\":30}";

        try {
            // 使用 FastJSON 将 JSON 字符串转换为 JSONObject
            JSONObject jsonObject = JSON.parseObject(jsonData);

            // 从 JSONObject 中获取属性值并赋给实体类的属性
            this.h5 = jsonObject.getString("h5");
            this.od = jsonObject.getString("od");
            this.tpl = jsonObject.getString("tpl");
            // 其他属性的处理...

        } catch (Exception e) {
            e.printStackTrace();
            // 处理异常，例如打印日志或抛出自定义异常
        }
    }
    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setN(String n) 
    {
        this.n = n;
    }

    public String getN() 
    {
        return n;
    }
    public void setWx(String wx) 
    {
        this.wx = wx;
    }

    public String getWx() 
    {
        return wx;
    }
    public void setCo(String co) 
    {
        this.co = co;
    }

    public String getCo() 
    {
        return co;
    }
    public void setOd(String od) 
    {
        this.od = od;
    }

    public String getOd() 
    {
        return od;
    }
    public void setRp(String rp) 
    {
        this.rp = rp;
    }

    public String getRp() 
    {
        return rp;
    }
    public void setH5(String h5) 
    {
        this.h5 = h5;
    }

    public String getH5() 
    {
        return h5;
    }
    public void setTpl(String tpl) 
    {
        this.tpl = tpl;
    }

    public String getTpl() 
    {
        return tpl;
    }
    public void setH5Num(Long h5Num) 
    {
        this.h5Num = h5Num;
    }

    public Long getH5Num() 
    {
        return h5Num;
    }
    public void setTplNum(Long tplNum) 
    {
        this.tplNum = tplNum;
    }

    public Long getTplNum() 
    {
        return tplNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("n", getN())
            .append("wx", getWx())
            .append("co", getCo())
            .append("od", getOd())
            .append("rp", getRp())
            .append("h5", getH5())
            .append("tpl", getTpl())
            .append("h5Num", getH5Num())
            .append("tplNum", getTplNum())
            .toString();
    }
}
