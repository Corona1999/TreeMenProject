package cn.jbit.dao;

import cn.jbit.entity.ProjectAdvanceMoney;
import cn.jbit.entity.TodayWhereAbout;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface ProjectAdvanceMoneyMapper {
    /*
     * 显示所有已提交的预支信息
     * */
    List<ProjectAdvanceMoney> findAll(@Param("nextUser")Integer nextUser,@Param("productionContractId")String productionContractId);

    /*
     * 查找指定id的预支信息
     * */
    ProjectAdvanceMoney findById(Integer id);

    /*
     * 修改审核人
     * */
    Integer updateNextUser(@Param("id") Integer id,@Param("nextUser") Integer nextUser);
    /*
     * 修改审核状态
     * */
    Integer updateStatus(@Param("id")Integer id,@Param("checkStatus") Integer checkStatus);
}
