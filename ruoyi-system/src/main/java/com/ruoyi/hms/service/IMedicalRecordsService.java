package com.ruoyi.hms.service;

import java.util.List;
import com.ruoyi.hms.domain.MedicalRecords;

/**
 * 就诊记录Service接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface IMedicalRecordsService 
{
    /**
     * 查询就诊记录
     * 
     * @param recordId 就诊记录主键
     * @return 就诊记录
     */
    public MedicalRecords selectMedicalRecordsByRecordId(Long recordId);

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
     * 批量删除就诊记录
     * 
     * @param recordIds 需要删除的就诊记录主键集合
     * @return 结果
     */
    public int deleteMedicalRecordsByRecordIds(Long[] recordIds);

    /**
     * 删除就诊记录信息
     * 
     * @param recordId 就诊记录主键
     * @return 结果
     */
    public int deleteMedicalRecordsByRecordId(Long recordId);
}
