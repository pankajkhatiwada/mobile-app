package com.pankaj.mobileapp.controller;

import com.pankaj.mobileapp.model.UserDetailsRequestModel;
import com.pankaj.mobileapp.model.UserRest;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pankaj Khatiwada
 */

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return null;
    }

    @PutMapping
    public String updateUser() {
        return "update user";
    }

    @DeleteMapping
    public String deleteUser() {
        return "user deleted";
    }
}
