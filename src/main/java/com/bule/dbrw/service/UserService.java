package com.bule.dbrw.service;

import com.bule.dbrw.domain.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lijianzhen1 on 2019/1/30.
 */
public interface UserService {
    /**
     * 通过用户id获得用户信息
     *
     * @param userId
     * @return
     */
    @Transactional(readOnly = true,isolation= Isolation.REPEATABLE_READ)
    User findById(Long userId);


    /**
     * 插入用户数据
     * @param user
     * @return
     */
    @Transactional
    Integer insert (User user);

}
