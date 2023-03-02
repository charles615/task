package com.example.system.controller;

import org.springframework.ui.Model;
import com.example.system.entity.Phone;
import com.example.system.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import javax.annotation.Resource;

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

    @GetMapping("/web/detail/{id}")
    public String detail(Model model, @PathVariable Integer id){
        Phone phone = phoneService.findById(id);
        model.addAttribute("phoneInfo", phone);
        return "detail";
    }

}
