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
public class Materiais_Permanente extends Materiais{
    private String nota_empenho;
    private String tombamento;

    public Materiais_Permanente(String nota_empenho, String tombamento, String nome, String tipo, String descricao, String local) {
        super(nome, tipo, descricao, local);
        this.nota_empenho = nota_empenho;
        this.tombamento = tombamento;
    }

    public String getNota_empenho() {
        return nota_empenho;
    }

    public void setNota_empenho(String nota_empenho) {
        this.nota_empenho = nota_empenho;
    }

    public String getTombamento() {
        return tombamento;
    }

    public void setTombamento(String tombamento) {
        this.tombamento = tombamento;
    }

    
}
