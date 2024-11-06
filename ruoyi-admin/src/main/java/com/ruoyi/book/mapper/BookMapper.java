package com.ruoyi.book.mapper;

import java.util.List;
import com.ruoyi.book.domain.Book;

/**
 * 书籍管理Mapper接口
 * 
 * @author liusuping
 * @date 2024-11-06
 */
public interface BookMapper 
{
    /**
     * 查询书籍管理
     * 
     * @param id 书籍管理主键
     * @return 书籍管理
     */
    public Book selectBookById(Long id);

    /**
     * 查询书籍管理列表
     * 
     * @param book 书籍管理
     * @return 书籍管理集合
     */
    public List<Book> selectBookList(Book book);

    /**
     * 新增书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    public int insertBook(Book book);

    /**
     * 修改书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    public int updateBook(Book book);

    /**
     * 删除书籍管理
     * 
     * @param id 书籍管理主键
     * @return 结果
     */
    public int deleteBookById(Long id);

    /**
     * 批量删除书籍管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookByIds(Long[] ids);
}
