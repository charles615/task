package com.example.service;

import com.example.system.entity.Employee;
import com.example.system.mapper.EmployeeMapper;
import com.example.system.service.IEmployeeService;
import org.hibernate.service.spi.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceTests {

    @Autowired
    private IEmployeeService employeeService;
    @Resource
    @Autowired
    private EmployeeMapper employeeMapper;

    //注册功能测试，请按顺序依次运行，否则会报错

    //服务层注册功能测试
    @Test
    public void signup() {
        try {
            Employee employee = new Employee();
            employee.setUsername("serviceTest");
            employee.setPassword("1");
            employee.setPhone("1");
            employee.setEmail("1");
            employeeService.signup(employee);
            System.out.println("Signup function is correct.");
            System.out.println(employee);
        } catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

    //服务层登录功能测试
    @Test
    public void login() {
        try {

            employeeService.login("ServiceTest", "1");
            System.out.println("Signup function is correct.");

        }catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

    //服务层重置密码功能测试
    @Test
    public void rest() {
        try {
            System.out.println("修改前： " + employeeMapper.findByUsername("ServiceTest"));
            employeeService.reset("ServiceTest", "1", "1", "2");
            System.out.println("Reset function is correct.");
            System.out.println("修改后： " + employeeMapper.findByUsername("ServiceTest"));

        }catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }

}
