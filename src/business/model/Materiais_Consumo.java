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
public class Materiais_Consumo extends Materiais {
    private int quantidade;
    private Date validade;

    public Materiais_Consumo(int quantidade, Date validade, String nome, String tipo, String descricao, String local) {
        super(nome, tipo, descricao, local);
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
}
