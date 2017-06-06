/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.exceptions.DataIncorretaException;

/**
 *
 * @author James
 */
public class DateValidation implements ValidaFormato {

    @Override
    public void valida(String id) throws DataIncorretaException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date d = sdf.parse(id);
        } catch (ParseException e) {
            throw new DataIncorretaException("A data inserida é inválida!\nO formato correto é: dd/mm/aaaa");
        }
    }
}
