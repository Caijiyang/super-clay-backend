package com.felixcjy.superclay.common.domain.dto;

import java.util.List;

/**
 * 分页结果
 *
 * @author: Felix(蔡济阳)
 * @since : 2025/1/25 19:24
 */
public class PageDTO<T> {
    /** 总条数 */
    private Long total;

    /** 总页数 */
    private Long pages;

    /** 分页结果集合 */
    private List<T> records;

    /** 单前页码 */
    private Long currentPage;

    /** 分页大小 */
    private Long pageSize;

    public PageDTO(Long total, Long pages, List<T> records, Long currentPage, Long pageSize) {
        this.total = total;
        this.pages = pages;
        this.records = records;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
}
