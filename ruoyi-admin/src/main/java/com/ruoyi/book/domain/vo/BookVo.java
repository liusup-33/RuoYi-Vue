package com.ruoyi.book.domain.vo;

import com.ruoyi.book.domain.Book;

public class BookVo extends Book {

    private String categoryName;

    private String regionName;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
