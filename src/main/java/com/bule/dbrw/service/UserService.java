package com.bule.dbrw.service;

import com.bule.dbrw.domain.User;

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
    User findById(Long userId);

}
