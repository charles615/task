package com.example.system.service;

import com.example.system.entity.Cart;
import com.example.system.entity.Phone;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface ICartService {

    List<Cart> findListByUserId(Integer user_id);

    int save(Cart cart);


}
