/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Persistencia.Venda_Dao;
import java.io.IOException;

/**
 *
 * @author francis
 */
public class testeVenda {

    public static void main(String[] args) throws IOException {

        Venda_Dao dao = new Venda_Dao();
        dao.CadastrarVenda(new Venda("JHJH", "22/11/2020", "14:36:00", "COOREIO", 0, new Cliente("Jam", "312321321"), new Produto(0, 1, "Bermuda", "M", "G", 500), new Escola("FAESA")));
        
    }
    
}
