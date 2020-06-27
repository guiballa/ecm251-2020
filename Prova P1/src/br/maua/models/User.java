package br.maua.models;

import br.maua.interfaces.AutenticarSenha;

/**
 * Classe concreta que representa um usuario. Ela define o que é um usuario e como se criar um.
 * @author Guilherme Ballardini - Guiballa@hotmail.com
 *  *  * @since 26/06/2020
 *  *  * @version 1.0
 */

public class User implements AutenticarSenha {
    private String nickname, password, email;

    /**
     * Contrutor da classe User para que ela receba um nome, uma senha e um email todas as vezes que um usuario for criado.
     */
    public User(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    /**
     * Método implementado da interface AutenticarSenha, que ele checa se a senha passada é a cadastrada pelo usuario.
     * @return Um boolean se a senha é a senha cadastrada ou não.
     */
    @Override
    public boolean checkPassword(String senha) {
        return senha.equals(password);
    }
}
