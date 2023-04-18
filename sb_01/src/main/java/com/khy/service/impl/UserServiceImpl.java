package com.khy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.khy.dao.UserDao;
import com.khy.pojo.User;
import com.khy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {
    private UserDao userDao;
}
