package com.ruoyi.hms1.mapper;

import java.util.List;
import com.ruoyi.hms1.domain.MedicalRecords;

/**
 * 就诊记录Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface MedicalRecordsMapper 
{
    /**
     * 查询就诊记录
     * 
     * @param recordId 就诊记录主键
     * @return 就诊记录
     */
    public MedicalRecords selectMedicalRecordsByRecordId(String recordId);

    /**
     * 查询就诊记录列表
     * 
     * @param medicalRecords 就诊记录
     * @return 就诊记录集合
     */
    public List<MedicalRecords> selectMedicalRecordsList(MedicalRecords medicalRecords);

    /**
     * 新增就诊记录
     * 
     * @param medicalRecords 就诊记录
     * @return 结果
     */
    public int insertMedicalRecords(MedicalRecords medicalRecords);

    /**
     * 修改就诊记录
     * 
     * @param medicalRecords 就诊记录
     * @return 结果
     */
    public int updateMedicalRecords(MedicalRecords medicalRecords);

    /**
     * 删除就诊记录
     * 
     * @param recordId 就诊记录主键
     * @return 结果
     */
    public int deleteMedicalRecordsByRecordId(String recordId);

    /**
     * 批量删除就诊记录
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMedicalRecordsByRecordIds(String[] recordIds);
}
