package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.concurrent.atomic.LongAccumulator;

public interface UserRepository extends JpaRepository<User, LongAccumulator> {
    Optional<User> findByEmail(String email);
}
