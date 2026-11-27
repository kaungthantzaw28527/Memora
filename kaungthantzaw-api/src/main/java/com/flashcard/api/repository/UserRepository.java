package com.flashcard.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flashcard.api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
