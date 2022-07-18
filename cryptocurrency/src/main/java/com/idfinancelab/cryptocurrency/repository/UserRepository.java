package com.idfinancelab.cryptocurrency.repository;

import com.idfinancelab.cryptocurrency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
