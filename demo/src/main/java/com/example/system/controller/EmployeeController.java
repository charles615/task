package com.example.system.controller;

import com.example.common.vo.JsonResult;
import com.example.system.entity.Employee;
import com.example.system.service.IEmployeeService;
import kotlin.Result;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;


    @GetMapping("/hello")
    public String hello() {
        return "1111";
    }

    @RequestMapping("/signup")
    public JsonResult<Void> signup(Employee employee) {
        JsonResult<Void> result = new JsonResult<>();

        try {
            employeeService.signup(employee);
            result.setState(200);
        } catch (ServiceException e) {
            result.setState(400);
        }catch (Exception e) {
            result.setState(405);
        }

        return result;
    }
}
