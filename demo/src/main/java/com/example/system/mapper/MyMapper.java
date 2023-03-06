package com.example.system.mapper;

import com.example.system.entity.My;
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
public interface MyMapper {

   List<My> findMyCart(Integer user_id);


   int clear(Integer user_id);





}
