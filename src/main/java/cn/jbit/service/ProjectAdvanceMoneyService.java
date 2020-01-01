package cn.jbit.service;

import cn.jbit.entity.ProjectAdvanceMoney;
import cn.jbit.entity.TodayWhereAbout;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectAdvanceMoneyService {
    /*
     * 显示所有已提交的预支信息
     * */
    PageInfo<ProjectAdvanceMoney> findAll(Integer nextUser, String productionContractId, Integer pageNo, Integer pageSize);

    /*
     * 查找指定id的预支信息
     * */
    ProjectAdvanceMoney findById(Integer id);

    /*
     * 修改审核人
     * */
    Integer updateNextUser(Integer id,Integer nextUser);
    /*
     * 修改审核状态
     * */
    Integer updateStatus(Integer id,Integer checkStatus);


}
