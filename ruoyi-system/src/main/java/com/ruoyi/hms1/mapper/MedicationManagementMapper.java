package com.ruoyi.hms1.mapper;

import java.util.List;
import com.ruoyi.hms1.domain.MedicationManagement;

/**
 * 药品管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-14
 */
public interface MedicationManagementMapper 
{
    /**
     * 查询药品管理
     * 
     * @param medicationId 药品管理主键
     * @return 药品管理
     */
    public MedicationManagement selectMedicationManagementByMedicationId(String medicationId);

    /**
     * 查询药品管理列表
     * 
     * @param medicationManagement 药品管理
     * @return 药品管理集合
     */
    public List<MedicationManagement> selectMedicationManagementList(MedicationManagement medicationManagement);

    /**
     * 新增药品管理
     * 
     * @param medicationManagement 药品管理
     * @return 结果
     */
    public int insertMedicationManagement(MedicationManagement medicationManagement);

    /**
     * 修改药品管理
     * 
     * @param medicationManagement 药品管理
     * @return 结果
     */
    public int updateMedicationManagement(MedicationManagement medicationManagement);

    /**
     * 删除药品管理
     * 
     * @param medicationId 药品管理主键
     * @return 结果
     */
    public int deleteMedicationManagementByMedicationId(String medicationId);

    /**
     * 批量删除药品管理
     * 
     * @param medicationIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMedicationManagementByMedicationIds(String[] medicationIds);
}
