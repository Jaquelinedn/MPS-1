/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.validation;

import util.exceptions.CargoInvalidoException;

/**
 *
 * @author James
 */
public class CargoValidation implements ValidaFormato {
    @Override
    public void valida(String id) throws CargoInvalidoException{
        if(id.contains("\\d")){
            throw new CargoInvalidoException("O cargo inserido é inválido");
        }
    }
}
