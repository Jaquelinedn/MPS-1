/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Funcionario;
import java.util.HashMap;
import java.util.Map;
import util.exceptions.UsuarioExistenteException;

/**
 *
 * @author James
 */
public class ControleUsuario {
    private Map<String, Funcionario> func = new HashMap<>();
    
    public void adicionaUsuario(Funcionario f) throws UsuarioExistenteException{
        if(func.containsKey(f.getSiape())){
            throw new UsuarioExistenteException("O número de SIAPE informado já existe no sistema");
        }
        func.put(f.getSiape(), f);
    }
    
    public Funcionario pesquisaUsuario(String siape){
        return func.get(siape);
    }
    
    public void removeUsuario(String siape){
        if(!func.containsKey(siape)){
            //Lança exception
        }
        func.remove(siape);
    }
}
