package com.springboot.util;


import lombok.Data;

@Data
public class PageRequest {
    /**
     * 当前页码
     */
    private int currentPage;
    /**
     * 每页数量
     */
    private int pageSize;
}
