package com.ruoyi.hms1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hms1.mapper.NurseManagementMapper;
import com.ruoyi.hms1.domain.NurseManagement;
import com.ruoyi.hms1.service.INurseManagementService;

/**
 * 护士管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-14
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
    public NurseManagement selectNurseManagementByNurseId(String nurseId)
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
    public int deleteNurseManagementByNurseIds(String[] nurseIds)
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
    public int deleteNurseManagementByNurseId(String nurseId)
    {
        return nurseManagementMapper.deleteNurseManagementByNurseId(nurseId);
    }
}
