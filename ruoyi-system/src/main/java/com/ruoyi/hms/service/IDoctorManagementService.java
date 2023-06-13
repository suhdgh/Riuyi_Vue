package com.ruoyi.hms.service;

import java.util.List;
import com.ruoyi.hms.domain.DoctorManagement;

/**
 * 医生管理Service接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface IDoctorManagementService 
{
    /**
     * 查询医生管理
     * 
     * @param doctorId 医生管理主键
     * @return 医生管理
     */
    public DoctorManagement selectDoctorManagementByDoctorId(Long doctorId);

    /**
     * 查询医生管理列表
     * 
     * @param doctorManagement 医生管理
     * @return 医生管理集合
     */
    public List<DoctorManagement> selectDoctorManagementList(DoctorManagement doctorManagement);

    /**
     * 新增医生管理
     * 
     * @param doctorManagement 医生管理
     * @return 结果
     */
    public int insertDoctorManagement(DoctorManagement doctorManagement);

    /**
     * 修改医生管理
     * 
     * @param doctorManagement 医生管理
     * @return 结果
     */
    public int updateDoctorManagement(DoctorManagement doctorManagement);

    /**
     * 批量删除医生管理
     * 
     * @param doctorIds 需要删除的医生管理主键集合
     * @return 结果
     */
    public int deleteDoctorManagementByDoctorIds(Long[] doctorIds);

    /**
     * 删除医生管理信息
     * 
     * @param doctorId 医生管理主键
     * @return 结果
     */
    public int deleteDoctorManagementByDoctorId(Long doctorId);
}
