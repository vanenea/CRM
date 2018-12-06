package com.chen.web.action;

import com.chen.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user= new User();

    public User getModel() {
        return null;
    }
}
