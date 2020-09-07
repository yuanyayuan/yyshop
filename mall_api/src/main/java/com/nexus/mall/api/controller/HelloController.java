package com.nexus.mall.api.controller;

import com.nexus.mall.group.GroupA;
import com.nexus.mall.pojo.TestUser;
import com.nexus.mall.pojo.Users;
import com.nexus.mall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.groups.Default;

/**

* @Description:    测试用Controller

* @Author:         Nexus

* @CreateDate:     2020/9/3 22:01

* @UpdateUser:     Nexus

* @UpdateDate:     2020/9/3 22:01

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@RestController
public class HelloController {

    @Autowired
    private TestService testService;

    @PostMapping("/getUser")
    public String hello(@RequestBody @Validated({GroupA.class, Default.class}) TestUser user){
        return "hello world";
    }

    @PostMapping("/setUser")
    public String setUser(@RequestBody @Validated TestUser user) {
        return "name: " + user.getName() + ", age:" + user.getAge();
    }
}
