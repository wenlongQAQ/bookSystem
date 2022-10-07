package com.zzut.service;

import com.zzut.domain.User;

public interface UserService {
    User confirmUserPassword(User user);
    Integer addUser(User user);
}
