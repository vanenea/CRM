package com.chen.service.impl;

import com.chen.dao.UserDao;
import com.chen.model.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void regist(User user) {
        user.setUser_state("1");
        user.setUser_code("m0001");
        userDao.save(user);
    }
}
