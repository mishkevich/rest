package com.idfinancelab.cryptocurrency.service;

import com.idfinancelab.cryptocurrency.entity.User;
import com.idfinancelab.cryptocurrency.exeptions.UserNotFoundException;
import com.idfinancelab.cryptocurrency.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        log.info("Get user by id: ", id);
        Optional<User> userId = userRepository.findById(id);
        if (userId.isEmpty()) {
            throw new UserNotFoundException("There is no currency with ID = " + id + " in database");
        }
        return userId.get();
    }

    @Override
    public void save(User user) {
        log.info("User create", user);
        userRepository.save(user);

    }
}
