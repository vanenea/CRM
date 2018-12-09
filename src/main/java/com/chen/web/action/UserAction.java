package com.chen.web.action;

import com.chen.model.User;
import com.chen.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userAction")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    //模型驱动使用的对象
    private User user= new User();

    @Autowired
    private UserService userService;

    public User getModel() {
        return user;
    }

    public String regist(){
        userService.regist(user);
        return LOGIN;
    }
}
