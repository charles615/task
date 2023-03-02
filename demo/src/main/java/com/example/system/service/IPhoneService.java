package com.example.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.system.entity.Employee;
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
public interface IPhoneService{

    List<Phone> findList();

    Phone findById(int id);


}
