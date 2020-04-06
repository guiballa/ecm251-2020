//Ra : 18.01353-8
//Nome : Guilherme Ballardini

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;

        Usuario u1 = new Usuario("Guiballa","senha","guiballa@hotmail.com");
        Usuario u2 = new Usuario("Yago","yagod","yago@hotmail.com");
        Usuario u3 = new Usuario("Murilo","murilo","murilo@hotmail.com");
        Conta c1 = new Conta(u1,1000);
        Conta c2 = new Conta(u2,250);
        Conta c3 = new Conta(u3,3000);

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Estado inicial:");
        System.out.println("Usuario 1: " + c1.getUser().getNome());
        System.out.println("Saldo 1: " + c1.getSaldo());
        System.out.println("Usuario 2: " + c2.getUser().getNome());
        System.out.println("Saldo 2: " + c2.getSaldo());
        System.out.println("Usuario 3: " + c3.getUser().getNome());
        System.out.println("Saldo 3: " + c3.getSaldo());
        System.out.println("Id da conta 1: " + c1.getIdConta());
        System.out.println("Id da conta 2: " + c2.getIdConta());
        System.out.println("Id da conta 3: " + c3.getIdConta());


        s = Transações.gerarQR(c1,250);
        Transações.tranferir(c2,c1,s);
        Transações.tranferir(c3,c1,s);
        Transações.tranferir(c2,c1,s);
        s = Transações.gerarQR(c2,1000);
        Transações.tranferir(c3,c2,s);




        System.out.println("\nEstado final:");
        System.out.println("Usuario 1: " + c1.getUser().getNome());
        System.out.println("Saldo 1: " + c1.getSaldo());
        System.out.println("Usuario 2: " + c2.getUser().getNome());
        System.out.println("Saldo 2: " + c2.getSaldo());
        System.out.println("Usuario 3: " + c3.getUser().getNome());
        System.out.println("Saldo 3: " + c3.getSaldo());





    }
}
