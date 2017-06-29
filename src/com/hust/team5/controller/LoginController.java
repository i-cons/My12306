package com.hust.team5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String validateLogin(String username,String password,String userPhone){
        if("java".equals(username) &&"java".equals(password)){
            return "index";
        } else {
            return "redirect:login.jsp";
        }
    }

}
