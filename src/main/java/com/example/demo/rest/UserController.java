package com.example.demo.rest;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id){
        return "hello user with id: " + id;
    }

    @GetMapping()
    public List<User> getAllUsers(){
        List<User> users = userService.findAll();
        return users;
    }

    @PostMapping("/post")
    public String postUserInfo(@RequestBody User user){
        System.out.println("Posting user with name: " + user.getFirstName());
        userService.save(user);
        return "nice";
    }
}
