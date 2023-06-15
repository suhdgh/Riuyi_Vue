package com.ruoyi.hms1.service;

import java.util.List;
import com.ruoyi.hms1.domain.AgeNum;
import com.ruoyi.hms1.domain.Medication;
import com.ruoyi.hms1.domain.NurseSpecialty;
import com.ruoyi.hms1.domain.PercentageGender;

/**
 * 就诊年龄分段Service接口
 * 
 * @author ruoyi
 * @date 2023-06-15
 */
public interface IDv1Service
{

    /**
     * 查询就诊年龄分段列表
     * 
     * @param ageNum 就诊年龄分段
     * @return 就诊年龄分段集合
     */
    public List<AgeNum> selectAgeNumList(AgeNum ageNum);

    /**
     * 查询药品信息列表
     *
     * @param medication 药品信息
     * @return 药品信息集合
     */
    public List<Medication> selectMedicationList(Medication medication);

    /**
     * 查询护士科室对应列表
     *
     * @param nurseSpecialty 护士科室对应
     * @return 护士科室对应集合
     */
    public List<NurseSpecialty> selectNurseSpecialtyList(NurseSpecialty nurseSpecialty);


    /**
     * 查询男女比例列表
     *
     * @param percentageGender 男女比例
     * @return 男女比例集合
     */
    public List<PercentageGender> selectPercentageGenderList(PercentageGender percentageGender);

}
