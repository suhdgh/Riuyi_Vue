package com.ruoyi.hms1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms1.mapper.MedicationManagementMapper;
import com.ruoyi.hms1.domain.MedicationManagement;
import com.ruoyi.hms1.service.IMedicationManagementService;

/**
 * 药品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
@Service
public class MedicationManagementServiceImpl implements IMedicationManagementService 
{
    @Autowired
    private MedicationManagementMapper medicationManagementMapper;

    /**
     * 查询药品管理
     * 
     * @param medicationId 药品管理主键
     * @return 药品管理
     */
    @Override
    public MedicationManagement selectMedicationManagementByMedicationId(String medicationId)
    {
        return medicationManagementMapper.selectMedicationManagementByMedicationId(medicationId);
    }

    /**
     * 查询药品管理列表
     * 
     * @param medicationManagement 药品管理
     * @return 药品管理
     */
    @Override
    public List<MedicationManagement> selectMedicationManagementList(MedicationManagement medicationManagement)
    {
        return medicationManagementMapper.selectMedicationManagementList(medicationManagement);
    }

    /**
     * 新增药品管理
     * 
     * @param medicationManagement 药品管理
     * @return 结果
     */
    @Override
    public int insertMedicationManagement(MedicationManagement medicationManagement)
    {
        return medicationManagementMapper.insertMedicationManagement(medicationManagement);
    }

    /**
     * 修改药品管理
     * 
     * @param medicationManagement 药品管理
     * @return 结果
     */
    @Override
    public int updateMedicationManagement(MedicationManagement medicationManagement)
    {
        return medicationManagementMapper.updateMedicationManagement(medicationManagement);
    }

    /**
     * 批量删除药品管理
     * 
     * @param medicationIds 需要删除的药品管理主键
     * @return 结果
     */
    @Override
    public int deleteMedicationManagementByMedicationIds(String[] medicationIds)
    {
        return medicationManagementMapper.deleteMedicationManagementByMedicationIds(medicationIds);
    }

    /**
     * 删除药品管理信息
     * 
     * @param medicationId 药品管理主键
     * @return 结果
     */
    @Override
    public int deleteMedicationManagementByMedicationId(String medicationId)
    {
        return medicationManagementMapper.deleteMedicationManagementByMedicationId(medicationId);
    }
}
