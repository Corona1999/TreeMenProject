package cn.jbit.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2019-10-23.
 */
public class PageInfo<T> implements Serializable {
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> list;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
}
