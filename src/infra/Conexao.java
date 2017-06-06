/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.exceptions.DatabaseException;

/**
 *
 * @author James
 * Padrão: Singleton
 */
public class Conexao {

    private static Connection c;
    private static final String USER = "projetomps";
    private static final String PASSWORD = "projetotrabalhoso";

    private Conexao(){
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", USER, PASSWORD);
            c.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            c = null;
        }
    }

    public static Connection getConexao() throws DatabaseException {
        if(c == null){
            throw new DatabaseException("Não foi possível conectar ao Banco de Dados!");
        }
        return c;
    }
}
