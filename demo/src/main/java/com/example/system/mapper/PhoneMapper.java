package com.example.system.mapper;

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
   List<Phone> findList2();

   List<Phone> findList3();

   List<Phone> findList4();



   Phone findById(int id);






}
