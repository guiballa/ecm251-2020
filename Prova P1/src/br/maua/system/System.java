package br.maua.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.maua.enums.EstadosPedido;
import br.maua.enums.ListaPagamento;
import br.maua.models.Pedido;
import br.maua.models.User;

public class System {
    static private Scanner scanner;
    static private User user;
    static private List<Pedido> arrayPedidos;

    public static void run() {
        user = new User("Jorge","123456", "jorge@maua.br");
        scanner = new Scanner(java.lang.System.in);
        boolean executar = true;
        int opcao;
        arrayPedidos = new ArrayList<>();
        do {
            menu();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 0:
                    executar = false;
                    break;
                case 1:
                    java.lang.System.out.println("Qual a senha para cadastrar pedidos: ");
                    String Password = scanner.nextLine();
                    if(user.checkPassword(Password)){
                        java.lang.System.out.println("Descreva o seu pedido: ");
                        String descrição = scanner.nextLine();
                        java.lang.System.out.println("Fale o valor do seu pedido(usando '.'): ");
                        float value = Float.parseFloat(scanner.nextLine());
                        java.lang.System.out.println("Qual o seu metodo de pagamento: ");
                        java.lang.System.out.println("0 - Dinheiro");
                        java.lang.System.out.println("1 - Débito");
                        java.lang.System.out.println("2 - Crédito");
                        java.lang.System.out.println("3 - Vale alimentação");
                        java.lang.System.out.println("4 - Vale refeição");
                        int escolha = Integer.parseInt(scanner.nextLine());
                        if((escolha < 0) || (escolha > 4)){
                            java.lang.System.out.println("Metodo de pagamento não encontrado");
                        } else{
                            arrayPedidos.add(new Pedido(descrição, value, ListaPagamento.values()[escolha]));
                            //new Pedido(descrição, value, ListaPagamento.values()[escolha]);
                        }

                    } else{
                        java.lang.System.out.println("Senha errada");
                    }
                    break;
                case 2:
                    for (Pedido pedido : arrayPedidos){
                        java.lang.System.out.println(pedido.toString());
                    }
                    break;
                case 3:
                    java.lang.System.out.println("Qual o id do pedido que deseja mudar: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Pedido pedido : arrayPedidos ) {
                        if(pedido.getId().equals(id)){
                            java.lang.System.out.println("Qual estado deseja colocar o pedido: ");
                            java.lang.System.out.println("0 - Realizado");
                            java.lang.System.out.println("1 - Preparação");
                            java.lang.System.out.println("2 - Saiu para entrega");
                            java.lang.System.out.println("3 - Entregue");
                            java.lang.System.out.println("4 - Devolvido");
                            int estado = Integer.parseInt(scanner.nextLine());
                            pedido.mudarEstado(EstadosPedido.values()[estado]);
                        }
                    }
                    break;
                default:
                    java.lang.System.out.println("Opção invalida");
            }
        }while(executar);
        scanner.close();
    }


    static private void menu() {
        java.lang.System.out.println("Pizzaria o Rato que Ri:");
        java.lang.System.out.println("1 - Nova venda");
        java.lang.System.out.println("2 - Verificar pedidos");
        java.lang.System.out.println("3 - Alterar pedidos");
        java.lang.System.out.println("0 - Sair");
    }


}
