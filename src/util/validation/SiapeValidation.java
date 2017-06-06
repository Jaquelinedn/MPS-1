/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.validation;

import util.exceptions.SiapeException;

/**
 *
 * @author James
 */
public class SiapeValidation implements ValidaFormato {
    @Override
    public void valida(String id) throws SiapeException{
        if(id.contains("\\d"))
            throw new SiapeException("O SIAPE deve conter apenas números");
    }
}
