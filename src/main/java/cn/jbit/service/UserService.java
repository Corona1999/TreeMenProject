package cn.jbit.service;

import cn.jbit.entity.User;

import java.util.List;

/**
 * Created by DELL on 2019-10-14.
 */
public interface UserService {
    List<User> selectByUserId();
    /*
    *删除用户
    * */
    int deleteUserById(Integer id);
    /*
    *查询所有
    * */
    List<User> findAll();
}
