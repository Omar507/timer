package com.example.demo.rest;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id){
        return "hello user with id: " + id;
    }

    @GetMapping()
    public User getRandomUser(){
        User user = new User();
        user.setEmail("omar@gmail.com");
        user.setFirstName("omar");
        user.setLastName("sukva");
        user.setId(123123);
        return user;
    }

    @PostMapping("/post")
    public String postUserInfo(@RequestBody User user){
        System.out.println("User name is: " + user.getFirstName());
        System.out.println("User last is: " + user.getLastName());
        System.out.println("User email is: " + user.getEmail());
        return "nice";
    }
}
