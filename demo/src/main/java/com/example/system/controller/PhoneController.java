package com.example.system.controller;

import org.springframework.ui.Model;
import com.example.system.entity.Phone;
import com.example.system.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@Controller
public class PhoneController {

    @Autowired
    @Resource
    private IPhoneService phoneService;


    @GetMapping("/web/list")
    public String list(Model mod) {
        List<Phone> phone = phoneService.findList();
        mod.addAttribute("phone", phone);
        return "list";
    }

    @GetMapping("/web/list2")
    public String list2(Model mod) {
        List<Phone> phone = phoneService.findList2();
        mod.addAttribute("phone", phone);
        return "list2";
    }

    @GetMapping("/web/list3")
    public String list3(Model mod) {
        List<Phone> phone = phoneService.findList3();
        mod.addAttribute("phone", phone);
        return "list3";
    }

    @GetMapping("/web/list4")
    public String list4(Model mod) {
        List<Phone> phone = phoneService.findList4();
        mod.addAttribute("phone", phone);
        return "list4";
    }


    @GetMapping("/web/detail/{id}")
    public String detail(Model model, @PathVariable Integer id){
        Phone phone = phoneService.findById(id);
        model.addAttribute("phone", phone);
        return "detail";
    }

//    @RequestMapping("/logout")
//    public String logout(HttpSession session, SessionStatus sessionStatus) {
//        session.invalidate();
//        sessionStatus.setComplete();
//        return "redirect:/web/login.html";
//    }



}
