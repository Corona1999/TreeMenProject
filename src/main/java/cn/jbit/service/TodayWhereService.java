package cn.jbit.service;

import cn.jbit.entity.TodayWhereAbout;
import cn.jbit.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TodayWhereService {
    /*
    * 查询所有今日去向
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
