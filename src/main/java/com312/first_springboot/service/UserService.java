package com312.first_springboot.service;

import com312.first_springboot.model.User;
import java.util.List;

public interface UserService {

    List<User> getListOfUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);
}