package com.desenrolaifsc.desenrolaifsc.service;

import com.desenrolaifsc.desenrolaifsc.model.AuthUser;
import com.desenrolaifsc.desenrolaifsc.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserService {

    private final AuthUserRepository authUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public AuthUserService(AuthUserRepository authUserRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.authUserRepository = authUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Optional<AuthUser> findByUsername(String username){
        return authUserRepository.findByUsername(username);
    }

    public AuthUser saveUser(AuthUser user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return authUserRepository.save(user);
    }

    public AuthUser updateUser(AuthUser user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return authUserRepository.save(user);
    }

    public void deleteUser(Long userId){
        authUserRepository.deleteById(userId);
    }
}