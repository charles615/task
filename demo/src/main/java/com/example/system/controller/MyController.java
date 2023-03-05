package com.example.system.controller;

import com.example.system.entity.Cart;
import com.example.system.entity.My;
import com.example.system.service.IMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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
public class MyController {

    @Autowired
    @Resource
    private IMyService myService;


    protected final Integer getIdFromSession(HttpSession session) {
        return Integer.valueOf(session.getAttribute("id").toString());
    }

    @GetMapping("/web/cartList")
    public String list(Model mod, HttpSession session) {
        Integer user_id = getIdFromSession(session);
        List<My> Cart = myService.findMyCart(user_id);
        mod.addAttribute("collect", Cart);
        return "cartList";
    }



}
