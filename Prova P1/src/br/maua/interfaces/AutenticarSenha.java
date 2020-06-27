package br.maua.interfaces;
/**
 * Interface que checa se uma senha é a senha cadastrada pelo usuario.
 * @author Guilherme Ballardini - Guiballa@hotmail.com
 * @since 26/06/2020
 * @version 1.0
 */
public interface AutenticarSenha {
    boolean checkPassword(String senha);
}
