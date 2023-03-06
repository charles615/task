package com.example.mapper;

import com.example.system.entity.Cart;
import com.example.system.entity.My;
import com.example.system.mapper.MyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyMapperTests {
    @Autowired
    private MyMapper myMapper;



    @Test
    public void findMyCart() {
        Integer user_id = 1;


        List<My> list = myMapper.findMyCart(user_id);
        System.out.println(list);

    }

    @Test
    public void clear() {
        Integer user_id = 1;

        Integer result = myMapper.clear(user_id);
        if(result == 0) {
            System.out.println("数据删除失败，但测试成功，原因：不存在可删除数据");

        } else {
            System.out.println("数据删除成功");
        }

    }




}
