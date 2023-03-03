package com.example.service;

import com.example.system.entity.User;
import com.example.system.mapper.UserMapper;
import com.example.system.service.IUserService;
import org.hibernate.service.spi.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {

    @Autowired
    private IUserService employeeService;
    @Resource
    @Autowired
    private UserMapper userMapper;

    //注册功能测试，请按顺序依次运行，否则会报错

    //服务层注册功能测试
    @Test
    public void signup() {
        try {
            User user = new User();
            user.setUsername("serviceTest");
            user.setPassword("1");
            user.setPhone("1");
            user.setEmail("1");
            employeeService.signup(user);
            System.out.println("Signup function is correct.");
            System.out.println(user);
        } catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

    //服务层登录功能测试
    @Test
    public void login() {
        try {

            employeeService.login("ServiceTest", "1");
            System.out.println("Signup function is correct.");

        }catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

    //服务层重置密码功能测试
    @Test
    public void rest() {
        try {
            System.out.println("修改前： " + userMapper.findByUsername("ServiceTest"));
            employeeService.reset("ServiceTest", "1", "1", "2");
            System.out.println("Reset function is correct.");
            System.out.println("修改后： " + userMapper.findByUsername("ServiceTest"));

        }catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

}
