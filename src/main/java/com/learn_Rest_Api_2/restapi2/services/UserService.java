package com.learn_Rest_Api_2.restapi2.services;


import com.learn_Rest_Api_2.restapi2.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static List<User> userList = new ArrayList<>();
    public List<User> getAllUser() {
        return userList;
    }

    public User getOneUser(int id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst().orElse(null) ;
    }
    public User createUser(User user){
        userList.add(user);
        return user;
    }
}
