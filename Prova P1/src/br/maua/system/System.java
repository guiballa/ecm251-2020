package br.maua.system;

import java.util.Scanner;

import br.maua.interfaces.AutenticarSenha;
import br.maua.models.User;

public class System  {
    static private Scanner scanner;
    static private User user;
    public static void run() {
        user = new User("Jorge","123456", "jorge@maua.br");
        scanner = new Scanner(java.lang.System.in);
        boolean executar = true;
        int opcao;
        do {
            menu();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 0:
                    executar = false;
                    break;
                case 1:
                    if(true){
                        java.lang.System.out.println("Descreva o seu pedido:");
                        String descrição = scanner.nextLine();
                        java.lang.System.out.println("Fale o valor do seu pedido:");
                        String valor = scanner.nextLine();

                        java.lang.System.out.println("2 - Verificar pedidos");
                        java.lang.System.out.println("3 - Alterar pedidos");
                        java.lang.System.out.println("0 - Sair");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    java.lang.System.out.println("Opção invalida");
            }
        }while(executar);
    }


    static private void menu() {
        java.lang.System.out.println("Pizzaria o Rato que Ri:");
        java.lang.System.out.println("1 - Nova venda");
        java.lang.System.out.println("2 - Verificar pedidos");
        java.lang.System.out.println("3 - Alterar pedidos");
        java.lang.System.out.println("0 - Sair");
    }


}
