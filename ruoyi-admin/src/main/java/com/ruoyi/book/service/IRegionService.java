package com.ruoyi.book.service;

import java.util.List;
import com.ruoyi.book.domain.Region;

/**
 * 区域Service接口
 * 
 * @author liusuping
 * @date 2024-11-06
 */
public interface IRegionService 
{
    /**
     * 查询区域
     * 
     * @param id 区域主键
     * @return 区域
     */
    public Region selectRegionById(Long id);

    /**
     * 查询区域列表
     * 
     * @param region 区域
     * @return 区域集合
     */
    public List<Region> selectRegionList(Region region);

    /**
     * 新增区域
     * 
     * @param region 区域
     * @return 结果
     */
    public int insertRegion(Region region);

    /**
     * 修改区域
     * 
     * @param region 区域
     * @return 结果
     */
    public int updateRegion(Region region);

    /**
     * 批量删除区域
     * 
     * @param ids 需要删除的区域主键集合
     * @return 结果
     */
    public int deleteRegionByIds(Long[] ids);

    /**
     * 删除区域信息
     * 
     * @param id 区域主键
     * @return 结果
     */
    public int deleteRegionById(Long id);
}
