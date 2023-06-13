package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.DoctorManagementMapper;
import com.ruoyi.hms.domain.DoctorManagement;
import com.ruoyi.hms.service.IDoctorManagementService;

/**
 * 医生管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class DoctorManagementServiceImpl implements IDoctorManagementService 
{
    @Autowired
    private DoctorManagementMapper doctorManagementMapper;

    /**
     * 查询医生管理
     * 
     * @param doctorId 医生管理主键
     * @return 医生管理
     */
    @Override
    public DoctorManagement selectDoctorManagementByDoctorId(Long doctorId)
    {
        return doctorManagementMapper.selectDoctorManagementByDoctorId(doctorId);
    }

    /**
     * 查询医生管理列表
     * 
     * @param doctorManagement 医生管理
     * @return 医生管理
     */
    @Override
    public List<DoctorManagement> selectDoctorManagementList(DoctorManagement doctorManagement)
    {
        return doctorManagementMapper.selectDoctorManagementList(doctorManagement);
    }

    /**
     * 新增医生管理
     * 
     * @param doctorManagement 医生管理
     * @return 结果
     */
    @Override
    public int insertDoctorManagement(DoctorManagement doctorManagement)
    {
        return doctorManagementMapper.insertDoctorManagement(doctorManagement);
    }

    /**
     * 修改医生管理
     * 
     * @param doctorManagement 医生管理
     * @return 结果
     */
    @Override
    public int updateDoctorManagement(DoctorManagement doctorManagement)
    {
        return doctorManagementMapper.updateDoctorManagement(doctorManagement);
    }

    /**
     * 批量删除医生管理
     * 
     * @param doctorIds 需要删除的医生管理主键
     * @return 结果
     */
    @Override
    public int deleteDoctorManagementByDoctorIds(Long[] doctorIds)
    {
        return doctorManagementMapper.deleteDoctorManagementByDoctorIds(doctorIds);
    }

    /**
     * 删除医生管理信息
     * 
     * @param doctorId 医生管理主键
     * @return 结果
     */
    @Override
    public int deleteDoctorManagementByDoctorId(Long doctorId)
    {
        return doctorManagementMapper.deleteDoctorManagementByDoctorId(doctorId);
    }
}
