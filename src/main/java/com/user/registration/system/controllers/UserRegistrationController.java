package com.user.registration.system.controllers;

import com.user.registration.system.dtos.UserDTO;
import com.user.registration.system.exceptions.RegistrationException;
import com.user.registration.system.services.UserRegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registrations")
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO){
        this.userRegistrationService.createUser(userDTO);
        return new ResponseEntity<String>("User registered successfully.", HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@Valid @RequestBody UserDTO userDTO){
        this.userRegistrationService.updateUser(userDTO);
        return new ResponseEntity<String>("User updated successfully.", HttpStatus.OK);
    }

    @GetMapping("/{user_id}")
    public UserDTO getUserById(@PathVariable Integer user_id) throws RegistrationException {
        return this.userRegistrationService.getUserByID(user_id);
    }

    @DeleteMapping("/{user_id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Integer user_id){
        this.userRegistrationService.deleteUserByID(user_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
