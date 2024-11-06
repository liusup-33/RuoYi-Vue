package com.ruoyi.book.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.book.mapper.BookMapper;
import com.ruoyi.book.domain.Book;
import com.ruoyi.book.service.IBookService;

/**
 * 书籍管理Service业务层处理
 * 
 * @author liusuping
 * @date 2024-11-06
 */
@Service
public class BookServiceImpl implements IBookService 
{
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询书籍管理
     * 
     * @param id 书籍管理主键
     * @return 书籍管理
     */
    @Override
    public Book selectBookById(Long id)
    {
        return bookMapper.selectBookById(id);
    }

    /**
     * 查询书籍管理列表
     * 
     * @param book 书籍管理
     * @return 书籍管理
     */
    @Override
    public List<Book> selectBookList(Book book)
    {
        return bookMapper.selectBookList(book);
    }

    /**
     * 新增书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    @Override
    public int insertBook(Book book)
    {
        book.setCreateTime(DateUtils.getNowDate());
        return bookMapper.insertBook(book);
    }

    /**
     * 修改书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    @Override
    public int updateBook(Book book)
    {
        book.setUpdateTime(DateUtils.getNowDate());
        return bookMapper.updateBook(book);
    }

    /**
     * 批量删除书籍管理
     * 
     * @param ids 需要删除的书籍管理主键
     * @return 结果
     */
    @Override
    public int deleteBookByIds(Long[] ids)
    {
        return bookMapper.deleteBookByIds(ids);
    }

    /**
     * 删除书籍管理信息
     * 
     * @param id 书籍管理主键
     * @return 结果
     */
    @Override
    public int deleteBookById(Long id)
    {
        return bookMapper.deleteBookById(id);
    }
}
