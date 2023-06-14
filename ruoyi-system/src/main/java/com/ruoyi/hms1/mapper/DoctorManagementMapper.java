package com.ruoyi.hms1.mapper;

import java.util.List;
import com.ruoyi.hms1.domain.DoctorManagement;

/**
 * 医生管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface DoctorManagementMapper 
{
    /**
     * 查询医生管理
     * 
     * @param doctorId 医生管理主键
     * @return 医生管理
     */
    public DoctorManagement selectDoctorManagementByDoctorId(String doctorId);

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
     * 删除医生管理
     * 
     * @param doctorId 医生管理主键
     * @return 结果
     */
    public int deleteDoctorManagementByDoctorId(String doctorId);

    /**
     * 批量删除医生管理
     * 
     * @param doctorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDoctorManagementByDoctorIds(String[] doctorIds);
}
