package com.qwkj.user.controller;

import com.qwkj.common.pojo.UUser;
import com.qwkj.common.utils.LoggerUtils;
import com.qwkj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value = "user")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView  Login(UUser user, ModelAndView modelAndView){
        //使用logger工具
        LoggerUtils.debug(getClass(),"进来了");
        LoggerUtils.debug(getClass(),user.getEmail());
        LoggerUtils.debug(getClass(),user.getPswd());
        UUser user1 = userService.getUUSerByEmail(user);
        if(user1 == null) {
            LoggerUtils.debug(getClass(),"验证失败");
        }
        modelAndView.setViewName("index");
        modelAndView.addObject("message","henhao");
        return modelAndView;
   }
}
