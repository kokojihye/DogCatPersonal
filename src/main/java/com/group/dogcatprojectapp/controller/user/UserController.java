package com.group.dogcatprojectapp.controller.user;

import com.group.dogcatprojectapp.dto.user.request.UserCreateRequest;
import com.group.dogcatprojectapp.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final List<User> users = new ArrayList<>();

    @PostMapping("/user") //Post /user
    public void saveUser(@RequestBody UserCreateRequest request){
        users.add(new User(request.getUserID(), request.getUserPW(), request.getUserName(), request.getUserNickname()));
    }
}
