package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import com.example.test.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Arthur
 * @Time: 2019.10.28
 */

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("add/{id}")
    public int GetUser(@PathVariable int id){
        User usr = new User();
        usr.setId(104);
        usr.setRealname("hahahaha");
        return userService.insert(usr);
    }

    @RequestMapping("get/{id}")
    public List<User> getUser(@PathVariable int id) {
        List<User> usList = userService.selectByExampleID(id);
        System.out.println(usList.get(0).toString());
        return usList;
    }

}
