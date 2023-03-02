package com.example.system.service.impl;

import com.example.system.entity.Employee;
import com.example.system.mapper.EmployeeMapper;
import com.example.system.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public void signup(Employee employee) {
        String username = employee.getUsername();
        Employee account = employeeMapper.findByUsername(username);

        //check if the username is used when signing up.


        if (account != null) {
            throw new UsernameIsUsedException("Username is used!");
        }


        //账户密码MD5加密
        String phone = employee.getPhone();
        String email = employee.getEmail();
        String password = employee.getPassword();
        Employee newUser = new Employee();


        String salt = UUID.randomUUID().toString().toUpperCase();
        String md5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();
        newUser.setPassword(md5Password);
        newUser.setPhone(phone);
        newUser.setEmail(email);
        newUser.setUsername(username);
        newUser.setSalt(salt);

        //检测数据是否被成功插入
        int result = employeeMapper.insert(newUser);
        if (result != 1) {
            throw new ServiceException("System server error.");
        }


    }

    @Override
    public Employee login(String username, String password) {
        Employee loginUser = employeeMapper.findByUsername(username);

        if (loginUser == null) {
            throw new UsernameNotFoundException("Username not found!");
        }

        String passwordInDB = loginUser.getPassword();
        String salt = loginUser.getSalt();

        String InputMd5Password = DigestUtils.md5DigestAsHex((password + salt).getBytes()).toUpperCase();

        if (!InputMd5Password.equals(passwordInDB)) {
            throw new PasswordIsNotCorrectException("Password is not correct.");
        }

        Employee employee = new Employee();
        employee.setId(loginUser.getId());
        employee.setUsername(loginUser.getUsername());
        return employee;
    }

    @Override
    public Employee getByUsername(String username) {
        return employeeMapper.findByUsername(username);
    }

    @Override
    public Employee reset(String username, String phone, String email, String password) {

        Employee account = employeeMapper.findByUsername(username);

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

        Integer rows = employeeMapper.reset(account);
        if (rows != 1) {
            throw new ServiceException("Failed to register, system problem.");
        }

        return account;
    }




}


