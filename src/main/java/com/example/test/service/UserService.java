package com.example.test.service;


import com.example.test.entity.User;

import java.util.List;

public interface UserService {
    public int insert(User usr);
    public List<User> selectByExampleID(Integer id);
}
