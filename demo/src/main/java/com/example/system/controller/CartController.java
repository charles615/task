package com.example.system.controller;

import com.example.system.entity.Cart;
import com.example.system.entity.My;
import com.example.system.service.ICartService;
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
public class CartController {

    @Autowired
    @Resource
    private ICartService cartService;


    protected final Integer getIdFromSession(HttpSession session) {
        return Integer.valueOf(session.getAttribute("id").toString());
    }

    @RequestMapping("/favourite/{id}")
    public String add(@PathVariable int id, HttpSession session) throws IOException {
        Cart cart = new Cart();
        Integer uid = getIdFromSession(session);
        cart.setPhone_id(id);
        cart.setUser_id(uid);
        cartService.save(cart);
        return "redirect:/web/info";
    }


}
