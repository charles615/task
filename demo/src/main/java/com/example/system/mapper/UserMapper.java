package com.example.system.mapper;

import com.example.system.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface UserMapper{

    int insert(User user);
    User findByUsername(String username);

    Integer reset(User user);


}
