package cn.jbit.dao;

import cn.jbit.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by DELL on 2019-10-14.
 */
public interface UserMapper {
    List<User> selectByUserId();
    /*
    *删除用户
    */
    int deleteUserById(@Param("id") Integer id);
    /*
    * 所有用户
    * */
    List<User> findAll();
}
