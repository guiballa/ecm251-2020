package br.maua.models;

import br.maua.enums.EstadosPedido;
import br.maua.enums.ListaPagamento;

import java.util.Random;

/**
 * Classe concreta que representa um pedido. Ela define o que é um pedido e como se cria um.
 * @author Guilherme Ballardini - Guiballa@hotmail.com
 * @since 26/06/2020
 * @version 1.0
 */

public class Pedido {
    private float valor;
    private String descrição, id;
    private EstadosPedido estado;
    private ListaPagamento pagamento;

    /**
     * @param descrição Descrição do pedido.
     * @param valor Valor do pedido.
     * @param pagamento Enumeração que define o metodo de pagamento.
     * estado sempre começa em Realizado
     * id é gerado aleatóriamente
     */
    public Pedido(String descrição, float valor, ListaPagamento pagamento) {
        this.id = geradorID();
        this.valor = valor;
        this.descrição = descrição;
        this.estado = EstadosPedido.REALIZADO;
        this.pagamento = pagamento;
    }
    /**
     * Método geradorID, que ele gera um ID aleatóriamente de 3 digitos.
     * @return Uma string com o ID gerado.
     */
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
    /**
     * Método mudarEstado, que ele vai receber um estado e atualizar o estado atual do pedido.
     * @param estado
     */
    public void mudarEstado(EstadosPedido estado){
        this.estado = estado;
    }
    /**
     * @return Getter para o ID do pedido.
     */
    public String getId() {
        return id;
    }
}
