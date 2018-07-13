package com.jxf.appservice.service;

import com.jxf.appservice.bean.UserBean;
import com.jxf.appservice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public UserBean getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
