package com.hust.team5.controller;

import com.hust.team5.dao.UserDao;
import com.hust.team5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String validateLogin(String userEmail,String userPassword,
                                String userName,String userSex,
                                String userNumber,String userPhone){
        User user =new User();
        user.setUserEmail(userEmail);
        user.setUserPassword(userPassword);
        user.setUserName(userName);
        user.setUserSex(userSex);
        user.setUserNumber(userNumber);
        user.setUserPhone(userPhone);
        userDao.insertUser(user);
        return "index";
    }
}
