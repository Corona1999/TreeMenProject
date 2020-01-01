package cn.jbit.service.impl;

import cn.jbit.dao.UserMapper;
import cn.jbit.entity.User;
import cn.jbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2019-10-14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectByUserId()
    {
        return userMapper.selectByUserId();
    }

    @Override
    public List<User> findAll()
    {
        return userMapper.findAll();
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
