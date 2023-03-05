package com.example.system.service.impl;

import com.example.system.entity.Cart;
import com.example.system.entity.Phone;
import com.example.system.mapper.CartMapper;
import com.example.system.mapper.PhoneMapper;
import com.example.system.service.ICartService;
import com.example.system.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@Service
public class CartServiceImpl implements ICartService {


    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> findListByUserId(Integer user_id) {
        return cartMapper.findListByUserId(user_id);
    }

    @Override
    public int save(Cart cart) {
        return cartMapper.save(cart);
    }
}


