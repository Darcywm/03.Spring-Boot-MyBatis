package com.springboot.util;

import lombok.Data;

import java.util.List;

@Data
public class PageResult {
    /**
     * 当前页码
     */
    private int currentPage;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalCount;
    /**
     * 页码总数
     */
    private int totalPage;
    /**
     * 数据模型
     */
    private List<?> list;
}
