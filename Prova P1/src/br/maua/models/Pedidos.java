package br.maua.models;

import java.util.Random;

public class Pedidos {
    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for(int i=0; i<3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}
