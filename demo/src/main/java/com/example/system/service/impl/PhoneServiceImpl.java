package com.example.system.service.impl;

import com.example.system.entity.Phone;
import com.example.system.mapper.PhoneMapper;
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
public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    private  PhoneMapper phoneMapper;


    @Override
    public List<Phone> findList() {
        return phoneMapper.findList();
    }

    @Override
    public List<Phone> findList2() {
        return phoneMapper.findList2();
    }

    @Override
    public List<Phone> findList3() {
        return phoneMapper.findList3();
    }

    @Override
    public List<Phone> findList4() {
        return phoneMapper.findList4();
    }


    @Override
    public Phone findById(int id) {
        return phoneMapper.findById(id);
    }
}


