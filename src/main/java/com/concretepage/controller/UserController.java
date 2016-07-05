package com.concretepage.controller;

import com.concretepage.dao.UserDao;
import com.concretepage.model.UserVO;
import com.concretepage.persistence.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 205025 on 6/6/2016.
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping
    public ModelAndView save(ModelAndView modelAndView) {
        modelAndView.setViewName("userForm");
        UserVO user = new UserVO();
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam(value = "userName") String userName,
                             @RequestParam(value = "age") int age, ModelAndView modelAndView) {
        User user = new User(userName, age);
        userDao.saveUserDetail(user);
        modelAndView.addObject("userName", userName);
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
