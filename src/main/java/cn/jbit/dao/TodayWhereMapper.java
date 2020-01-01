package cn.jbit.dao;

import cn.jbit.entity.TodayWhereAbout;
import cn.jbit.entity.User;

import java.util.List;

public interface TodayWhereMapper {
    /*
    * 查询所有今日去向列表
    * */
    List<TodayWhereAbout> findAll();
    /*
    * 修改
    * */
    Integer updateTodayWhere(TodayWhereAbout todayWhereAbout);
    /*
     * 查找某id的今日去向
     * */
    TodayWhereAbout findById(Integer id);

}
