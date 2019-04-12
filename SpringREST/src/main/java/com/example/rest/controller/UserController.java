package com.example.rest.controller;

import com.example.rest.model.Message;
import com.example.rest.model.User;
import com.example.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping("/test")

    ResponseEntity<Message> test(){
        Message message = new Message();
        message.setMessage("Hello World");
        return ResponseEntity.ok()
                .body(message);
    }

    @PostMapping("") // dodanie do bazy
    ResponseEntity<User> create(@RequestBody User user){
        User created = userRepository.save(user);

        return ResponseEntity.ok()
                .body(created);
    }

    @GetMapping("")
    ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok()
                .body(userRepository.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getAUser(@PathVariable("id") Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElseThrow(()-> new EntityNotFoundException("User not found"));
        return ResponseEntity.ok()
                .body(user);
    }

}
