package com.springboot.util;

import com.github.pagehelper.PageInfo;

public class PageUtils {
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();

        pageResult.setCurrentPage(pageRequest.getCurrentPage());
        pageResult.setPageSize(pageRequest.getPageSize());

        pageResult.setTotalCount(pageInfo.getTotal());
        pageResult.setTotalPage(pageInfo.getPages());

        pageResult.setList(pageInfo.getList());

        return pageResult;
    }

}
