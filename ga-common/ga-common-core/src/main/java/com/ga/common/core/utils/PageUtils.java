package com.ga.common.core.utils;

import com.ga.common.core.utils.sql.SqlUtil;
import com.ga.common.core.web.page.PageDomain;
import com.ga.common.core.web.page.TableSupport;
import com.github.pagehelper.PageHelper;

/**
 * Explain: 分页工具类
 * Author: linjianhai
 * Date: 2022/5/21 17:41
 */
public class PageUtils extends PageHelper {
    /**
     * 设置请求分页数据
     */
    public static void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
        Boolean reasonable = pageDomain.getReasonable();
        PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
    }

    /**
     * 清理分页的线程变量
     */
    public static void clearPage()
    {
        PageHelper.clearPage();
    }
}
