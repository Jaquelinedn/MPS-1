/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author James
 */
public class Sala {
    private String local;
    private String nome_sala;
    private int capacidade;

    public Sala(String local, String nome_sala, int capacidade) {
        this.local = local;
        this.nome_sala = nome_sala;
        this.capacidade = capacidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome_sala() {
        return nome_sala;
    }

    public void setNome_sala(String nome_sala) {
        this.nome_sala = nome_sala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
