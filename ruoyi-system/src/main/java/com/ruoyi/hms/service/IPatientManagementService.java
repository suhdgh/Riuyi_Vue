package com.ruoyi.hms.service;

import java.util.List;
import com.ruoyi.hms.domain.PatientManagement;

/**
 * 患者管理Service接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface IPatientManagementService 
{
    /**
     * 查询患者管理
     * 
     * @param patientId 患者管理主键
     * @return 患者管理
     */
    public PatientManagement selectPatientManagementByPatientId(Long patientId);

    /**
     * 查询患者管理列表
     * 
     * @param patientManagement 患者管理
     * @return 患者管理集合
     */
    public List<PatientManagement> selectPatientManagementList(PatientManagement patientManagement);

    /**
     * 新增患者管理
     * 
     * @param patientManagement 患者管理
     * @return 结果
     */
    public int insertPatientManagement(PatientManagement patientManagement);

    /**
     * 修改患者管理
     * 
     * @param patientManagement 患者管理
     * @return 结果
     */
    public int updatePatientManagement(PatientManagement patientManagement);

    /**
     * 批量删除患者管理
     * 
     * @param patientIds 需要删除的患者管理主键集合
     * @return 结果
     */
    public int deletePatientManagementByPatientIds(Long[] patientIds);

    /**
     * 删除患者管理信息
     * 
     * @param patientId 患者管理主键
     * @return 结果
     */
    public int deletePatientManagementByPatientId(Long patientId);
}
