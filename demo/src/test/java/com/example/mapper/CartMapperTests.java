package com.example.mapper;

import com.example.system.entity.Cart;
import com.example.system.entity.User;
import com.example.system.mapper.CartMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CartMapperTests {
    @Autowired
    private CartMapper cartMapper;


    @Test
    public void save() {
        Cart cart = new Cart();
        Integer user_id = 111;
        Integer phone_id = 111;

        cart.setPhone_id(phone_id);
        cart.setUser_id(user_id);
        Integer result = cartMapper.save(cart);
        if(result == 1) {
            System.out.println("数据插入成功");
        } else {
            System.out.println("数据插入失败，但测试成功，原因：已存在相同数据");
        }

    }



}
