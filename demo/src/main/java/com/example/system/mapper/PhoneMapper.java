package com.example.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.system.entity.Employee;
import com.example.system.entity.Phone;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface PhoneMapper{

   List<Phone> findList();


   Phone findById(int id);






}
