package com.example.system.service;

import com.example.system.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
public interface IEmployeeService extends IService<Employee> {

    void signup(Employee employee);

    Employee login(String username, String password);


}
