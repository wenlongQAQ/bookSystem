package com.zzut.controller;

import com.zzut.domain.User;
import com.zzut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping()
    public User userLogin(@RequestBody User user){
        User user1 = userService.confirmUserPassword(user);
        return user1;
    }
    @PostMapping("/register")
    public Integer userRegister(@RequestBody User user){
        Integer code = userService.addUser(user);
        return code;
    }

}
