package com.group.dogcatprojectapp.dto.user.response;

import com.group.dogcatprojectapp.user.User;

public class UserResponse {
    private long id;
    private String userID;
    private String userPW;
    private String userName;
    private String userNickname;

    public UserResponse(long id, User user) {
        this.id = id;
        this.userID = user.getUserID();
        this.userPW = user.getUserPW();
        this.userName = user.getUserName();
        this.userNickname = user.getUserNickname();
    }

    public long getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserNickname() {
        return userNickname;
    }
}
