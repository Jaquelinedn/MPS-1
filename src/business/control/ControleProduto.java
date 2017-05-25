/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Materiais;
import business.model.Materiais_Consumo;
import business.model.Materiais_Permanente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author James
 */
public class ControleProduto {
    private Map<String, Materiais_Permanente> material_permanente = new HashMap<>();
    private Map<String, Materiais_Consumo> material_consumo = new HashMap<>();
    
    public void adicionar(Materiais p){
        if(p instanceof Materiais_Permanente){
            material_permanente.put(((Materiais_Permanente) p).getTombamento(), (Materiais_Permanente)p);
        }else{
            material_consumo.put(((Materiais_Consumo)p).getTipo(), (Materiais_Consumo)p);
        }
    }
}
