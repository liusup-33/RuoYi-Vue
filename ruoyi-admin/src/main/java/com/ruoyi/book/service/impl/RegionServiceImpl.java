package com.ruoyi.book.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.book.mapper.RegionMapper;
import com.ruoyi.book.domain.Region;
import com.ruoyi.book.service.IRegionService;

/**
 * 区域Service业务层处理
 * 
 * @author liusuping
 * @date 2024-11-06
 */
@Service
public class RegionServiceImpl implements IRegionService 
{
    @Autowired
    private RegionMapper regionMapper;

    /**
     * 查询区域
     * 
     * @param id 区域主键
     * @return 区域
     */
    @Override
    public Region selectRegionById(Long id)
    {
        return regionMapper.selectRegionById(id);
    }

    /**
     * 查询区域列表
     * 
     * @param region 区域
     * @return 区域
     */
    @Override
    public List<Region> selectRegionList(Region region)
    {
        return regionMapper.selectRegionList(region);
    }

    /**
     * 新增区域
     * 
     * @param region 区域
     * @return 结果
     */
    @Override
    public int insertRegion(Region region)
    {
        region.setCreateTime(DateUtils.getNowDate());
        return regionMapper.insertRegion(region);
    }

    /**
     * 修改区域
     * 
     * @param region 区域
     * @return 结果
     */
    @Override
    public int updateRegion(Region region)
    {
        region.setUpdateTime(DateUtils.getNowDate());
        return regionMapper.updateRegion(region);
    }

    /**
     * 批量删除区域
     * 
     * @param ids 需要删除的区域主键
     * @return 结果
     */
    @Override
    public int deleteRegionByIds(Long[] ids)
    {
        return regionMapper.deleteRegionByIds(ids);
    }

    /**
     * 删除区域信息
     * 
     * @param id 区域主键
     * @return 结果
     */
    @Override
    public int deleteRegionById(Long id)
    {
        return regionMapper.deleteRegionById(id);
    }
}
