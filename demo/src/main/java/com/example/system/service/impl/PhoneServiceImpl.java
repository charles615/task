package com.example.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.system.entity.Employee;
import com.example.system.entity.Phone;
import com.example.system.mapper.EmployeeMapper;
import com.example.system.mapper.PhoneMapper;
import com.example.system.service.IEmployeeService;
import com.example.system.service.IPhoneService;
import com.example.system.service.exceptions.*;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;

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
    public Phone findById(int id) {
        return phoneMapper.findById(id);
    }
}


