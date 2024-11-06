package com.ruoyi.book.service;

import java.util.List;
import com.ruoyi.book.domain.Category;

/**
 * 类别Service接口
 * 
 * @author liusuping
 * @date 2024-11-06
 */
public interface ICategoryService 
{
    /**
     * 查询类别
     * 
     * @param id 类别主键
     * @return 类别
     */
    public Category selectCategoryById(Long id);

    /**
     * 查询类别列表
     * 
     * @param category 类别
     * @return 类别集合
     */
    public List<Category> selectCategoryList(Category category);

    /**
     * 新增类别
     * 
     * @param category 类别
     * @return 结果
     */
    public int insertCategory(Category category);

    /**
     * 修改类别
     * 
     * @param category 类别
     * @return 结果
     */
    public int updateCategory(Category category);

    /**
     * 批量删除类别
     * 
     * @param ids 需要删除的类别主键集合
     * @return 结果
     */
    public int deleteCategoryByIds(Long[] ids);

    /**
     * 删除类别信息
     * 
     * @param id 类别主键
     * @return 结果
     */
    public int deleteCategoryById(Long id);
}
