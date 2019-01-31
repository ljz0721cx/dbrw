package com.bule.dbrw.service.impl;

import com.bule.dbrw.dao.UserMapper;
import com.bule.dbrw.domain.User;
import com.bule.dbrw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijianzhen1 on 2019/1/30.
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Long userId) {
        return userMapper.findById(userId);
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }
}
