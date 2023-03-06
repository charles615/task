package com.example.system.service;

import com.example.system.entity.My;
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
public interface IMyService {

    List<My> findMyCart(Integer user_id);
    int clear(Integer user_id);


}
