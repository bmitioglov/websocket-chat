package com.mitioglov.model.dao;

import com.mitioglov.model.domain.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    List<User> listUsers();

    void removeUser(Integer id);

    User findByEmail(String email);

}
