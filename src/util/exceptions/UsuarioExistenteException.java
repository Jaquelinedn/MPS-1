/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exceptions;

/**
 *
 * @author James
 */
public class UsuarioExistenteException extends Exception {

    public UsuarioExistenteException() {
    }

    public UsuarioExistenteException(String string) {
        super(string);
    }
}
