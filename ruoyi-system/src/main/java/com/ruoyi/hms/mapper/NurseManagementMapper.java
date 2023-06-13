package com.ruoyi.hms.mapper;

import java.util.List;
import com.ruoyi.hms.domain.NurseManagement;

/**
 * 护士管理Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
public interface NurseManagementMapper 
{
    /**
     * 查询护士管理
     * 
     * @param nurseId 护士管理主键
     * @return 护士管理
     */
    public NurseManagement selectNurseManagementByNurseId(Long nurseId);

    /**
     * 查询护士管理列表
     * 
     * @param nurseManagement 护士管理
     * @return 护士管理集合
     */
    public List<NurseManagement> selectNurseManagementList(NurseManagement nurseManagement);

    /**
     * 新增护士管理
     * 
     * @param nurseManagement 护士管理
     * @return 结果
     */
    public int insertNurseManagement(NurseManagement nurseManagement);

    /**
     * 修改护士管理
     * 
     * @param nurseManagement 护士管理
     * @return 结果
     */
    public int updateNurseManagement(NurseManagement nurseManagement);

    /**
     * 删除护士管理
     * 
     * @param nurseId 护士管理主键
     * @return 结果
     */
    public int deleteNurseManagementByNurseId(Long nurseId);

    /**
     * 批量删除护士管理
     * 
     * @param nurseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNurseManagementByNurseIds(Long[] nurseIds);
}
