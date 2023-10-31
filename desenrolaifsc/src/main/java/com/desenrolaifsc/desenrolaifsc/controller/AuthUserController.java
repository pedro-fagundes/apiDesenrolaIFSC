package com.desenrolaifsc.desenrolaifsc.controller;

import com.desenrolaifsc.desenrolaifsc.model.AuthUser;
import com.desenrolaifsc.desenrolaifsc.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthUserController {

    private final AuthUserService authUserService;

    @Autowired
    public AuthUserController(AuthUserService authUserService) {
        this.authUserService = authUserService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<AuthUser> getUser(@PathVariable String username){
        Optional<AuthUser> user = authUserService.findByUsername(username);
        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<AuthUser> createUser(@RequestBody AuthUser user){
        AuthUser createdUser = authUserService.saveUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping
    public ResponseEntity<AuthUser> updateUser(@RequestBody AuthUser user){
        AuthUser updatedUser = authUserService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        authUserService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

}