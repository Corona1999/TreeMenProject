package cn.jbit.service.impl;

import cn.jbit.dao.TodayWhereMapper;
import cn.jbit.entity.TodayWhereAbout;
import cn.jbit.entity.User;
import cn.jbit.service.TodayWhereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodayWhereServiceImpl implements TodayWhereService {
    @Autowired
    private TodayWhereMapper todayWhereMapper;
    @Override
    public List<TodayWhereAbout> findAll() {
        return todayWhereMapper.findAll();
    }

    @Override
    public Integer updateTodayWhere(TodayWhereAbout todayWhereAbout) {
        return todayWhereMapper.updateTodayWhere(todayWhereAbout);
    }

    @Override
    public TodayWhereAbout findById(Integer id) {
        return todayWhereMapper.findById(id);
    }
}
