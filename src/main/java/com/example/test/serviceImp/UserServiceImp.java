package com.example.test.serviceImp;

import com.example.test.dao.UserMapper;
import com.example.test.entity.User;
import com.example.test.entity.UserExample;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Arthur
 * time: 2019.10.28
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    public int insert(User usr){
        return userMapper.insert(usr);
    }

    public List<User> selectByExampleID(Integer id) {
        UserExample uex = new UserExample();
        UserExample.Criteria cri = uex.createCriteria();
        cri.andIdEqualTo(id);
        List<User> result = userMapper.selectByExample(uex);

        return result;
    }
}
