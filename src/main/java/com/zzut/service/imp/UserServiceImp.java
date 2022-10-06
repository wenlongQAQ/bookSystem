package com.zzut.service.imp;

import com.zzut.dao.UserDao;
import com.zzut.domain.User;
import com.zzut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User confirmUserPassword(User user) {
        User userData = userDao.getUserData(user);
        return userData;
    }
}
