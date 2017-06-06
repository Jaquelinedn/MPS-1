/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.validation;

/**
 *
 * @author James
 */
public class FuncaoValidation implements ValidaFormato {
    @Override
    public void valida(String id) throws Exception{
        if(id.contains("\\d")){
            throw new Exception("A função inserida é inválida");
        }
    }
}
