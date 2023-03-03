package com.example.system.service;

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

    List<Phone> findList2();

    List<Phone> findList3();

    List<Phone> findList4();

    Phone findById(int id);


}
