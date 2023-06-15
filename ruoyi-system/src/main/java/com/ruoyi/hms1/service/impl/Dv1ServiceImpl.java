package com.ruoyi.hms1.service.impl;

import java.util.List;

import com.ruoyi.hms1.domain.Medication;
import com.ruoyi.hms1.domain.NurseSpecialty;
import com.ruoyi.hms1.domain.PercentageGender;
import com.ruoyi.hms1.mapper.Dv1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms1.domain.AgeNum;
import com.ruoyi.hms1.service.IDv1Service;

/**
 * 就诊年龄分段Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
@Service
public class Dv1ServiceImpl implements IDv1Service
{
    @Autowired(required = false)
    private Dv1Mapper dv1Mapper;


    /**
     * 查询就诊年龄分段列表
     * 
     * @param vo 就诊年龄分段
     * @return 就诊年龄分段
     */
    @Override
    public List<AgeNum> selectAgeNumList(AgeNum vo)
    {
        return dv1Mapper.selectAgeNumList(vo);
    }

    /**
     * 查询药品信息列表
     *
     * @param vo 药品信息
     * @return 药品信息
     */
    @Override
    public List<Medication> selectMedicationList(Medication vo)
    {
        return dv1Mapper.selectMedicationList(vo);
    }

    /**
     * 查询护士科室对应列表
     *
     * @param vo 护士科室对应
     * @return 护士科室对应
     */
    @Override
    public List<NurseSpecialty> selectNurseSpecialtyList(NurseSpecialty vo)
    {
        return dv1Mapper.selectNurseSpecialtyList(vo);
    }

    /**
     * 查询男女比例列表
     *
     * @param  vo 男女比例
     * @return 男女比例
     */
    @Override
    public List<PercentageGender> selectPercentageGenderList(PercentageGender vo)
    {
        return dv1Mapper.selectPercentageGenderList(vo);
    }

}
