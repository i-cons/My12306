package com.hust.team5.controller;

import com.hust.team5.dao.UserDao;
import com.hust.team5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.PrintWriter;

@Controller
@SessionAttributes("currentUser")
public class LoginController {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public void validateLogin(User user, PrintWriter out,ModelMap map){
//        System.out.println(user.getUserEmail());
//        System.out.println(user.getUserPassword());
        User resultUser = userDao.validateUserPassword(user);
        if(resultUser!=null){
            map.addAttribute("currentUser",resultUser);
            switch (resultUser.getUserType()) {
                case "userManager":
                    out.write("userManager");
                    break;
                case "dataManager":
                    out.write("dataManager");
                    break;
                case "planManager":
                    out.write("planManager");
                    break;
                case "scheduleManager":
                    out.write("scheduleManager");
                    break;
                case "financeManager":
                    out.write("financeManager");
                    break;
                default:
                    out.write("user");
                    break;
            }
        } else {
            out.write("fail");
        }
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public void validateRegister(User user, PrintWriter out){
        System.out.println(user.getUserEmail());
        User resultUser = userDao.validateUser(user.getUserEmail());
        if(resultUser==null){
            user.setUserState("");
            user.setUserLastLogin("");
            userDao.registerUser(user);
            out.write("success");
        } else {
            out.write("fail");
        }
    }
}
