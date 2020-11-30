/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import Modelo.Cliente;
import Modelo.Endereco;

/**
 *
 * @author gabri
 */
public class Cliente_Controller {
    
    public boolean GravarCliente(String nome, String cpf, String tel, String email, Endereco endereco) throws IOException{
        if(nome.length()>0  && email.length()>0 && 
                endereco!=null && tel.length()>0  &&
               cpf.length()>0){
            
            Cliente cliente = new Cliente(nome, cpf, tel, email, endereco);
            cliente.Gravar(cliente);
            
            return true;
            
          
        }else{
            return false;
            
        }
    }
    
}
