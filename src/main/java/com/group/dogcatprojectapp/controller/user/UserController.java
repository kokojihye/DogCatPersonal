package com.group.dogcatprojectapp.controller.user;

import com.group.dogcatprojectapp.dto.user.request.UserCreateRequest;
import com.group.dogcatprojectapp.dto.user.response.UserResponse;
import com.group.dogcatprojectapp.user.User;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/user")
    public List<UserResponse> getUsers(){
        List<UserResponse> responses = new ArrayList<>();
        for (int i=0; i<users.size(); i++){
            responses.add(new UserResponse(i +1,
                    users.get(i)));
        }
        return responses;
    }
}

