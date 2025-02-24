package com.project.KTX.controller;

import com.project.KTX.dto.UserDto;
import com.project.KTX.dto.UserUpdateDto;
import com.project.KTX.entity.User;
import com.project.KTX.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    User createUser (@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }
    @GetMapping("/list")
    List<User> getUser() {
        return userService.getUser();
    }
    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId,
                    @RequestBody UserUpdateDto userDto){
        return userService.updateUser(userId, userDto);
    }
    @DeleteMapping("/{userId}")
    String deleteUser (@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been detele";
    }
}