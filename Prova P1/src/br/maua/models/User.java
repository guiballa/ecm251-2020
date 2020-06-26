package br.maua.models;

import br.maua.interfaces.AutenticarSenha;

public class User implements AutenticarSenha {
    private String nickname, password, email;

    public User(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean checkPassword(String senha) {
        return senha.equals(password);
    }
}
