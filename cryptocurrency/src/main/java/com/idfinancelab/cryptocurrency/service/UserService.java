package com.idfinancelab.cryptocurrency.service;

import com.idfinancelab.cryptocurrency.entity.User;

public interface UserService {

    User findById(Long id);

    void save(User user);
}
