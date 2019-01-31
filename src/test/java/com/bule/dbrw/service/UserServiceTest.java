package com.bule.dbrw.service;

import com.alibaba.fastjson.JSONArray;
import com.bule.dbrw.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * Created by lijianzhen1 on 2019/1/30.
 */

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring-config-datasource.xml"})
public class UserServiceTest {


    @Autowired
    private UserService userService;
    @Test
    public void TestfindById() {
        System.out.println(JSONArray.toJSONString( userService.findById(8538L)));
    }

    @Test
    public void Testinsert() {
        Random r=new Random();
        User user = new User();
        user.setId(Long.valueOf(r.nextInt(100000)));
        user.setName("Janle");
        user.setAge(2);
        userService.insert(user);
    }
}
