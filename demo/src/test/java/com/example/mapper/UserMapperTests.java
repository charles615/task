package com.example.mapper;

import com.example.system.entity.User;
import com.example.system.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    //持久层测试，请按顺序依次运行，否则会报错

    //持久层数据库insert功能测试
    @Test
    public void insert() {
        User user = new User();
        user.setUsername("T1");
        user.setPassword("1");
        user.setPhone("1");
        user.setEmail("1");
        user.setSalt("1");
        int result = userMapper.insert(user);
        if(result == 1) {
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }

    }

    //持久层数据库根据用户名查找数据功能测试
    @Test
    public void findByUsername() {
        User result = userMapper.findByUsername("T1");
        System.out.println("查找成功，数据为： " + result);
    }

    //持久层数据库重置密码功能测试
    @Test
    public void reset() {
        System.out.println("重置前数据为： " + userMapper.findByUsername("T1"));
        User user = new User();
        user.setUsername("T1");
        user.setPassword("密码已修改");
        int result = userMapper.reset(user);
        if(result == 1) {
            System.out.println("重置成功");
            System.out.println("重置后数据为： " + userMapper.findByUsername("T1"));
        }else{
            System.out.println("插入失败");
        }

    }

}
