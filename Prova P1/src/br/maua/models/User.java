package br.maua.models;

public class User {
    private String nickname, password, email;

    public User(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }



}
