package com.example.system.controller;

import com.example.common.vo.JsonResult;
import com.example.system.entity.User;
import com.example.system.service.IUserService;
import com.example.system.service.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Charles
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    protected final Integer getIdFromSession(HttpSession session) {
        return Integer.valueOf(session.getAttribute("id").toString());
    }

    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }


    @GetMapping("/hello")
    public String hello() {
        return "1111";
    }

    @RequestMapping("/signup")
    public JsonResult<Void> signup(User user) {
        JsonResult<Void> result = new JsonResult<>();

        try {
            userService.signup(user);
            result.setState(200);
        } catch (UsernameIsUsedException e) {
            result.setState(2001);
        }
        return result;
    }


    @RequestMapping("/reset")
    public JsonResult<User> reset(String username, String phone, String email, String password) {
        JsonResult<User> result = new JsonResult<>();
        try {
            userService.reset(username, phone, email, password);
            result.setState(200);
        } catch (DetailsAreNotCorrectException e) {
            result.setState(4001);
        } catch(UsernameIsEmptyException e) {
            result.setState(4002);
        }
        return result;
    }


    @RequestMapping("/login")
    public JsonResult<User> login(String username, String password, HttpSession session) {

        JsonResult<User> result = new JsonResult<>();
        try {
            User data = userService.login(username, password);
            result.setState(200);
            session.setAttribute("id", data.getId());
            session.setAttribute("username", data.getUsername());
        } catch (PasswordIsNotCorrectException e) {
                result.setState(3001);
            } catch(UsernameNotFoundException e) {
                result.setState(3002);
            }
            return result;
    }






}
