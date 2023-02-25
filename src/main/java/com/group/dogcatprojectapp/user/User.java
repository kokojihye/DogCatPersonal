package com.group.dogcatprojectapp.user;

public class User {

    private String userID;
    private String userPW;
    private String userName;
    private String userNickname;

    public User(String userID, String userPW, String userName, String userNickname) {

        if (userID == null || userID.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 아이디(%s)가 들어왔습니다.",userID));
        }
        else if (userPW == null || userPW.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 비밀번호(%s)가 들어왔습니다.",userPW));
        }
        else if (userName == null || userName.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 이름(%s)이 들어왔습니다.",userName));
        }
        else if (userNickname == null || userNickname.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 닉네임(%s)가 들어왔습니다.",userNickname));
        }
        this.userID = userID;
        this.userPW = userPW;
        this.userName = userName;
        this.userNickname = userNickname;
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
