package com312.first_springboot.service;

import com312.first_springboot.model.User;
import com312.first_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository USER_REPOSITORY;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.USER_REPOSITORY = userRepository;
    }

    @Override
    public List<User> getListOfUsers() {
        return USER_REPOSITORY.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return USER_REPOSITORY.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        USER_REPOSITORY.save(user);
    }

    @Override
    public void updateUser(User user) {
        USER_REPOSITORY.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        USER_REPOSITORY.deleteById(id);
    }
}