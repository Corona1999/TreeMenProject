package cn.jbit.service.impl;

import cn.jbit.dao.ProjectAdvanceMoneyMapper;
import cn.jbit.entity.ProjectAdvanceMoney;
import cn.jbit.service.ProjectAdvanceMoneyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectAdvanceMoneyServiceImpl implements ProjectAdvanceMoneyService {
    @Autowired
    private ProjectAdvanceMoneyMapper projectAdvanceMoneyMapper;


    @Override
    public PageInfo<ProjectAdvanceMoney> findAll(Integer nextUser, String productionContractId, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<ProjectAdvanceMoney> (projectAdvanceMoneyMapper.findAll(nextUser,productionContractId));
    }

    @Override
    public ProjectAdvanceMoney findById(Integer id) {
        return projectAdvanceMoneyMapper.findById(id);
    }

    @Override
    public Integer updateNextUser(Integer id, Integer nextUser) {
        return projectAdvanceMoneyMapper.updateNextUser(id,nextUser);
    }

    @Override
    public Integer updateStatus(Integer id, Integer checkStatus) {
        return projectAdvanceMoneyMapper.updateStatus(id,checkStatus);
    }
}
