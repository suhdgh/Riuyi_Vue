package com.ruoyi.hms1.service.impl;

import java.util.List;

import com.ruoyi.hms1.domain.*;
import com.ruoyi.hms1.mapper.Dv2Mapper;
import com.ruoyi.hms1.service.IDv2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 各科室就诊男女Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
@Service
public class Dv2ServiceImpl implements IDv2Service
{
    @Autowired(required = false)
    private Dv2Mapper dv2Mapper;


    /**
     * 查询各科室就诊男女列表
     * 
     * @param mailFemailMedical 各科室就诊男女
     * @return 各科室就诊男女
     */
    @Override
    public List<MailFemailMedical> selectMailFemailMedicalList(MailFemailMedical mailFemailMedical)
    {
        return dv2Mapper.selectMailFemailMedicalList(mailFemailMedical);
    }

    /**
     * 查询记录排班占比最多列表
     *
     * @param maxSpecialtyNum 记录排班占比最多
     * @return 记录排班占比最多
     */
    @Override
    public List<MaxSpecialtyNum> selectMaxSpecialtyNumList(MaxSpecialtyNum maxSpecialtyNum)
    {
        return dv2Mapper.selectMaxSpecialtyNumList(maxSpecialtyNum);
    }

    /**
     * 查询就诊患者排名前五的科室列表
     *
     * @param medicalNum 就诊患者排名前五的科室
     * @return 就诊患者排名前五的科室
     */
    @Override
    public List<MedicalNum> selectMedicalNumList(MedicalNum medicalNum)
    {
        return dv2Mapper.selectMedicalNumList(medicalNum);
    }

    /**
     * 查询完成付款列表
     *
     * @param paid 完成付款
     * @return 完成付款
     */
    @Override
    public List<Paid> selectPaidList(Paid paid)
    {
        return dv2Mapper.selectPaidList(paid);
    }

    /**
     * 查询未完成付款列表
     *
     * @param pending 未完成付款
     * @return 未完成付款
     */
    @Override
    public List<Pending> selectPendingList(Pending pending)
    {
        return dv2Mapper.selectPendingList(pending);
    }

    /**
     * 查询病房占有率列表
     *
     * @param ward 病房占有率
     * @return 病房占有率
     */
    @Override
    public List<Ward> selectWardList(Ward ward)
    {
        return dv2Mapper.selectWardList(ward);
    }

}
