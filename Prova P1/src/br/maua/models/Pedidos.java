package br.maua.models;

import br.maua.enums.EstadosPedido;
import br.maua.enums.ListaPagamento;

import java.util.Random;

public class Pedidos {
    private int valor;
    private String descrição, id;
    private EstadosPedido estado;
    private ListaPagamento pagamento;

    public Pedidos(int valor, String descrição, ListaPagamento pagamento) {
        this.id = geradorID();
        this.valor = valor;
        this.descrição = descrição;
        this.estado = EstadosPedido.REALIZADO;
        this.pagamento = pagamento;
    }

    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for(int i=0; i<3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }




}
