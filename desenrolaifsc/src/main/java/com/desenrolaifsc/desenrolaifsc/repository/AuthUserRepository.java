package com.desenrolaifsc.desenrolaifsc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.desenrolaifsc.desenrolaifsc.model.AuthUser;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByUsername(String username);
}