package br.maua.models;

import br.maua.enums.EstadosPedido;
import br.maua.enums.ListaPagamento;

import java.util.Random;

public class Pedido {
    private float valor;
    private String descrição, id;
    private EstadosPedido estado;
    private ListaPagamento pagamento;

    public Pedido(String descrição, float valor, ListaPagamento pagamento) {
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

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                ", descrição='" + descrição + '\'' +
                ", id='" + id + '\'' +
                ", estado=" + estado +
                ", pagamento=" + pagamento +
                '}';
    }
    public void mudarEstado(EstadosPedido estado){
        this.estado = estado;
    }

    public String getId() {
        return id;
    }
}
