package com.mitioglov.model.dao;

import com.mitioglov.model.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDAO extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}
