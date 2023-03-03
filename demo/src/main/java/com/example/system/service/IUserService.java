package com.example.system.service;

import com.example.system.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface IUserService {

    void signup(User user);

    User login(String username, String password);

    User getByUsername(String username);




    User reset(String username, String phone, String email, String password);
}
