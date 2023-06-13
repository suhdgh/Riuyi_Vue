package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.MedicalRecordsMapper;
import com.ruoyi.hms.domain.MedicalRecords;
import com.ruoyi.hms.service.IMedicalRecordsService;

/**
 * 就诊记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class MedicalRecordsServiceImpl implements IMedicalRecordsService 
{
    @Autowired
    private MedicalRecordsMapper medicalRecordsMapper;

    /**
     * 查询就诊记录
     * 
     * @param recordId 就诊记录主键
     * @return 就诊记录
     */
    @Override
    public MedicalRecords selectMedicalRecordsByRecordId(Long recordId)
    {
        return medicalRecordsMapper.selectMedicalRecordsByRecordId(recordId);
    }

    /**
     * 查询就诊记录列表
     * 
     * @param medicalRecords 就诊记录
     * @return 就诊记录
     */
    @Override
    public List<MedicalRecords> selectMedicalRecordsList(MedicalRecords medicalRecords)
    {
        return medicalRecordsMapper.selectMedicalRecordsList(medicalRecords);
    }

    /**
     * 新增就诊记录
     * 
     * @param medicalRecords 就诊记录
     * @return 结果
     */
    @Override
    public int insertMedicalRecords(MedicalRecords medicalRecords)
    {
        return medicalRecordsMapper.insertMedicalRecords(medicalRecords);
    }

    /**
     * 修改就诊记录
     * 
     * @param medicalRecords 就诊记录
     * @return 结果
     */
    @Override
    public int updateMedicalRecords(MedicalRecords medicalRecords)
    {
        return medicalRecordsMapper.updateMedicalRecords(medicalRecords);
    }

    /**
     * 批量删除就诊记录
     * 
     * @param recordIds 需要删除的就诊记录主键
     * @return 结果
     */
    @Override
    public int deleteMedicalRecordsByRecordIds(Long[] recordIds)
    {
        return medicalRecordsMapper.deleteMedicalRecordsByRecordIds(recordIds);
    }

    /**
     * 删除就诊记录信息
     * 
     * @param recordId 就诊记录主键
     * @return 结果
     */
    @Override
    public int deleteMedicalRecordsByRecordId(Long recordId)
    {
        return medicalRecordsMapper.deleteMedicalRecordsByRecordId(recordId);
    }
}
