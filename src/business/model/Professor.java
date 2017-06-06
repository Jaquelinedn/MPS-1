/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.Date;

/**
 *
 * @author James
 */
public class Professor extends Funcionario {
    private String titulo;
    private String cargo;

    public Professor(String titulo, String cargo, String nome, String siape, String funcao, String data_nascimento) {
        super(nome, siape, funcao, data_nascimento);
        this.titulo = titulo;
        this.cargo = cargo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
