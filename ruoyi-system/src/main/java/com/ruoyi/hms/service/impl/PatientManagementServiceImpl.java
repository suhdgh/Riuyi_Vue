package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.PatientManagementMapper;
import com.ruoyi.hms.domain.PatientManagement;
import com.ruoyi.hms.service.IPatientManagementService;

/**
 * 患者管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class PatientManagementServiceImpl implements IPatientManagementService 
{
    @Autowired
    private PatientManagementMapper patientManagementMapper;

    /**
     * 查询患者管理
     * 
     * @param patientId 患者管理主键
     * @return 患者管理
     */
    @Override
    public PatientManagement selectPatientManagementByPatientId(Long patientId)
    {
        return patientManagementMapper.selectPatientManagementByPatientId(patientId);
    }

    /**
     * 查询患者管理列表
     * 
     * @param patientManagement 患者管理
     * @return 患者管理
     */
    @Override
    public List<PatientManagement> selectPatientManagementList(PatientManagement patientManagement)
    {
        return patientManagementMapper.selectPatientManagementList(patientManagement);
    }

    /**
     * 新增患者管理
     * 
     * @param patientManagement 患者管理
     * @return 结果
     */
    @Override
    public int insertPatientManagement(PatientManagement patientManagement)
    {
        return patientManagementMapper.insertPatientManagement(patientManagement);
    }

    /**
     * 修改患者管理
     * 
     * @param patientManagement 患者管理
     * @return 结果
     */
    @Override
    public int updatePatientManagement(PatientManagement patientManagement)
    {
        return patientManagementMapper.updatePatientManagement(patientManagement);
    }

    /**
     * 批量删除患者管理
     * 
     * @param patientIds 需要删除的患者管理主键
     * @return 结果
     */
    @Override
    public int deletePatientManagementByPatientIds(Long[] patientIds)
    {
        return patientManagementMapper.deletePatientManagementByPatientIds(patientIds);
    }

    /**
     * 删除患者管理信息
     * 
     * @param patientId 患者管理主键
     * @return 结果
     */
    @Override
    public int deletePatientManagementByPatientId(Long patientId)
    {
        return patientManagementMapper.deletePatientManagementByPatientId(patientId);
    }
}
