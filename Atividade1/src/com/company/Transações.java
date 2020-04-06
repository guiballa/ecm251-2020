package com.company;

import java.util.Random;

public class Transações {

   // public static void zerar(Conta conta){
   //     return conta.setSaldo() = 0;
   // }


    public static void tranferir(Conta pagar, Conta receber, String QRcode){
        String[] dados = QRcode.split(";");
        if (pagar.getSaldo() >= Double.parseDouble(dados[2])){
            pagar.pagarConta(Double.parseDouble(dados[2]));
            receber.receberConta(Double.parseDouble(dados[2]));
        } else {
            System.out.println("\nSem saldo na conta de " + pagar.getUser().getNome() + " para fazer esta tranferência de " + dados[2] + " reais.");
        }

    }



    public static String gerarQR(Conta conta, int valor){
        return String.format((conta.getIdConta()) +";" + (conta.getUser().getNome()) + ";" + (valor + "") + ";" + (gerarNumero()+ ""));
    }



    private static int gerarNumero(){
        return getRandomNumberInRange(1000,9999);
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
