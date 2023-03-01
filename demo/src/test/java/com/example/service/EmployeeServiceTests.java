package com.example.service;

import com.example.system.entity.Employee;
import com.example.system.service.IEmployeeService;
import org.hibernate.service.spi.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceTests {

    @Autowired
    private IEmployeeService employeeService;

    //注册功能测试
    @Test
    public void signup() {
        try {
            Employee employee = new Employee();
            employee.setUsername("Tom");
            employee.setPassword("1");
            employee.setPhone("1");
            employee.setEmail("1");
            employeeService.signup(employee);
            System.out.println("Signup function is correct.");
        } catch (ServiceException e) {
            System.out.println(e.getClass());
        }
    }


}
