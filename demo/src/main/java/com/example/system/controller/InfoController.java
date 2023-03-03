package com.example.system.controller;

import com.example.system.entity.User;
import com.example.system.service.IUserService;
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
    private IUserService employeeService;


    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }


    @GetMapping("/web/info")
    public String list(Model model, HttpSession session) {
        String username = getUsernameFromSession(session);
        User info = employeeService.getByUsername(username);
        model.addAttribute("userInfo", info);
        return "info";
    }




}
