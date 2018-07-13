package com.jxf.appservice.service;

import com.jxf.appservice.bean.UserBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public interface UserService {

    public UserBean getUserById(int userId);
}
