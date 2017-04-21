package com.mitioglov.service;

import com.mitioglov.model.domain.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);

    User save(User user);

}
