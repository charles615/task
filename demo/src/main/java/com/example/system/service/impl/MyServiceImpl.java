package com.example.system.service.impl;

import com.example.system.entity.My;
import com.example.system.entity.Phone;
import com.example.system.mapper.MyMapper;
import com.example.system.mapper.PhoneMapper;
import com.example.system.service.IMyService;
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
public class MyServiceImpl implements IMyService {

    @Autowired
    private MyMapper myMapper;


    @Override
    public List<My> findMyCart(Integer user_id){
        return myMapper.findMyCart(user_id);
    }

    @Override
    public int clear(Integer user_id) {
        return myMapper.clear(user_id);
    }


}


