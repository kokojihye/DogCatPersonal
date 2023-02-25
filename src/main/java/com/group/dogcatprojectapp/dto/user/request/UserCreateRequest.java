package com.group.dogcatprojectapp.dto.user.request;

public class UserCreateRequest {

    private String userID; // 유저가 지정한 ID
    private String userPW; // 유적 지정한 PW
    private String userName; // 유저가 지정한 이름
    private String userNickname; //유저가 지정한 닉네임


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
