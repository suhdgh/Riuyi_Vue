package com.ruoyi.hms1.mapper;

import java.util.List;

import com.ruoyi.hms1.domain.*;

/**
 * 各科室就诊男女Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public interface Dv2Mapper
{

    /**
     * 查询各科室就诊男女列表
     * 
     * @param mailFemailMedical 各科室就诊男女
     * @return 各科室就诊男女集合
     */
    public List<MailFemailMedical> selectMailFemailMedicalList(MailFemailMedical mailFemailMedical);

    /**
     * 查询记录排班占比最多列表
     *
     * @param maxSpecialtyNum 记录排班占比最多
     * @return 记录排班占比最多集合
     */
    public List<MaxSpecialtyNum> selectMaxSpecialtyNumList(MaxSpecialtyNum maxSpecialtyNum);

    /**
     * 查询就诊患者排名前五的科室列表
     *
     * @param medicalNum 就诊患者排名前五的科室
     * @return 就诊患者排名前五的科室集合
     */
    public List<MedicalNum> selectMedicalNumList(MedicalNum medicalNum);

    /**
     * 查询完成付款列表
     *
     * @param paid 完成付款
     * @return 完成付款集合
     */
    public List<Paid> selectPaidList(Paid paid);

    /**
     * 查询未完成付款列表
     *
     * @param pending 未完成付款
     * @return 未完成付款集合
     */
    public List<Pending> selectPendingList(Pending pending);

    /**
     * 查询病房占有率列表
     *
     * @param ward 病房占有率
     * @return 病房占有率集合
     */
    public List<Ward> selectWardList(Ward ward);

}
