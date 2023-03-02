package com.example.mapper;

import com.example.system.entity.Employee;
import com.example.system.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeMapperTests {
    @Autowired
    private EmployeeMapper employeeMapper;

    //持久层测试，请按顺序依次运行，否则会报错

    //持久层数据库insert功能测试
    @Test
    public void insert() {
        Employee employee = new Employee();
        employee.setUsername("T1");
        employee.setPassword("1");
        employee.setPhone("1");
        employee.setEmail("1");
        employee.setSalt("1");
        int result = employeeMapper.insert(employee);
        if(result == 1) {
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }

    }

    //持久层数据库根据用户名查找数据功能测试
    @Test
    public void findByUsername() {
        Employee result = employeeMapper.findByUsername("T1");
        System.out.println("查找成功，数据为： " + result);
    }

    //持久层数据库重置密码功能测试
    @Test
    public void reset() {
        Employee employee = new Employee();
        employee.setUsername("T1");
        employee.setPassword("密码已修改");
        employee.setPhone("1");
        employee.setEmail("1");
        int result = employeeMapper.reset(employee);
        if(result == 1) {
            System.out.println("重置成功");
        }else{
            System.out.println("插入失败");
        }

    }

}
