package com.example.system.controller;

import com.example.system.entity.Employee;
import com.example.system.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class InfoController {
    @Autowired
    @Resource
    private IEmployeeService employeeService;


    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }


    @GetMapping("/web/info")
    public String list(Model model, HttpSession session) {
        String username = getUsernameFromSession(session);
        Employee info = employeeService.getByUsername(username);
        model.addAttribute("userInfo", info);
        return "info";
    }




}
