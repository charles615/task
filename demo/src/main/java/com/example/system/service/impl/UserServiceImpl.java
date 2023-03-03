package com.example.system.service.impl;

import com.example.system.entity.User;
import com.example.system.mapper.UserMapper;
import com.example.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.system.service.exceptions.*;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void signup(User user) {
        String username = user.getUsername();
        User account = userMapper.findByUsername(username);

        //check if the username is used when signing up.


        if (account != null) {
            throw new UsernameIsUsedException("Username is used!");
        }


        //账户密码MD5加密
        String phone = user.getPhone();
        String email = user.getEmail();
        String password = user.getPassword();
        User newUser = new User();


        String salt = UUID.randomUUID().toString().toUpperCase();
        String md5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();
        newUser.setPassword(md5Password);
        newUser.setPhone(phone);
        newUser.setEmail(email);
        newUser.setUsername(username);
        newUser.setSalt(salt);

        //检测数据是否被成功插入
        int result = userMapper.insert(newUser);
        if (result != 1) {
            throw new ServiceException("System server error.");
        }


    }

    @Override
    public User login(String username, String password) {
        User loginUser = userMapper.findByUsername(username);

        if (loginUser == null) {
            throw new UsernameNotFoundException("Username not found!");
        }

        String passwordInDB = loginUser.getPassword();
        String salt = loginUser.getSalt();

        String InputMd5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();

        if (!InputMd5Password.equals(passwordInDB)) {
            throw new PasswordIsNotCorrectException("Password is not correct.");
        }

        User user = new User();
        user.setId(loginUser.getId());
        user.setUsername(loginUser.getUsername());
        return user;
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public User reset(String username, String phone, String email, String password) {

        User account = userMapper.findByUsername(username);

        //check if the username is used when signing up.


        if (account == null) {
            throw new UsernameIsEmptyException("Username doesn't exist.");
        }

        String phoneInDB = account.getPhone();
        String emailInDB = account.getEmail();
        String salt = account.getSalt();


        if (!phone.equals(phoneInDB) || !email.equals(emailInDB)) {
            throw new DetailsAreNotCorrectException("Details are not correct.");
        }

        String newMd5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();

        account.setPassword(newMd5Password);

        Integer rows = userMapper.reset(account);
        if (rows != 1) {
            throw new ServiceException("Failed to register, system problem.");
        }

        return account;
    }




}


