/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.validation;

import util.exceptions.NomeIncorretoException;

/**
 *
 * @author James
 */
public class NomeValidation implements ValidaFormato {
    @Override
    public void valida(String id) throws NomeIncorretoException{
        if(id.contains("\\d"))
            throw new NomeIncorretoException("O nome deve conter apenas caracteres");
    }
}
