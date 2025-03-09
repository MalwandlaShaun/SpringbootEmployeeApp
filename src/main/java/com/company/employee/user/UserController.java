package com.company.employee.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("api/v1/signup")
    public User signup(@RequestParam User user) {

        userService.addUser(user);

        return user;
    }

    @PostMapping("api/v1/login")
    public User login(@RequestParam String email, @RequestParam String password) {

        return userService.findUserByEmail(email);
    }

    @GetMapping("api/v1/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
