package com.sparta.jm.service;

import com.sparta.jm.controllers.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User("one","John", "Lennon"),
            new User("two","Paul", "McCartney"),
            new User("three", "George", "Harrison"),
            new User("four", "Ringo", "Starr")
    ));

    public List<User> getUsers() {
        return users;
    }

    public User getUser(String id) {
        return users.stream().
                filter(t-> t.getId().equals(id)).
                findFirst().
                get();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(String id, User user) {
        for(int i = 0; i <users.size(); i++) {
            User nextUser = users.get(i);
            if (nextUser.getId().equals(id)) {
                users.set(i, user);
                return;
            }
        }
    }

    public void deleteUser(String id){
        users.removeIf(u -> u.getId().equals(id));
    }

}
