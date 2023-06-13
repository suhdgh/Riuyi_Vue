package com.ruoyi.hms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms.mapper.NurseManagementMapper;
import com.ruoyi.hms.domain.NurseManagement;
import com.ruoyi.hms.service.INurseManagementService;

/**
 * 护士管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-13
 */
@Service
public class NurseManagementServiceImpl implements INurseManagementService 
{
    @Autowired
    private NurseManagementMapper nurseManagementMapper;

    /**
     * 查询护士管理
     * 
     * @param nurseId 护士管理主键
     * @return 护士管理
     */
    @Override
    public NurseManagement selectNurseManagementByNurseId(Long nurseId)
    {
        return nurseManagementMapper.selectNurseManagementByNurseId(nurseId);
    }

    /**
     * 查询护士管理列表
     * 
     * @param nurseManagement 护士管理
     * @return 护士管理
     */
    @Override
    public List<NurseManagement> selectNurseManagementList(NurseManagement nurseManagement)
    {
        return nurseManagementMapper.selectNurseManagementList(nurseManagement);
    }

    /**
     * 新增护士管理
     * 
     * @param nurseManagement 护士管理
     * @return 结果
     */
    @Override
    public int insertNurseManagement(NurseManagement nurseManagement)
    {
        return nurseManagementMapper.insertNurseManagement(nurseManagement);
    }

    /**
     * 修改护士管理
     * 
     * @param nurseManagement 护士管理
     * @return 结果
     */
    @Override
    public int updateNurseManagement(NurseManagement nurseManagement)
    {
        return nurseManagementMapper.updateNurseManagement(nurseManagement);
    }

    /**
     * 批量删除护士管理
     * 
     * @param nurseIds 需要删除的护士管理主键
     * @return 结果
     */
    @Override
    public int deleteNurseManagementByNurseIds(Long[] nurseIds)
    {
        return nurseManagementMapper.deleteNurseManagementByNurseIds(nurseIds);
    }

    /**
     * 删除护士管理信息
     * 
     * @param nurseId 护士管理主键
     * @return 结果
     */
    @Override
    public int deleteNurseManagementByNurseId(Long nurseId)
    {
        return nurseManagementMapper.deleteNurseManagementByNurseId(nurseId);
    }
}
