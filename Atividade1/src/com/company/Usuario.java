//Ra : 18.01353-8
//Nome : Guilherme Ballardini

package com.company;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String senha;
    private String email;



    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }
}
