package com.bule.dbrw.dao;

import com.bule.dbrw.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lijianzhen1 on 2019/1/30.
 */
@Repository
public interface UserMapper {


    User findById(Long id);

}
