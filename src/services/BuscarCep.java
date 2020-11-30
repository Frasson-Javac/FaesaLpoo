/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Modelo.Endereco;
import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import javax.swing.JOptionPane;


/**
 *
 * @author vinic
 */
public class BuscarCep {

    Endereco endereco;
    

    public String[] pesquisarCep(String cepBusca) {
        
        try {
            ViaCEP viaCEP=new ViaCEP(cepBusca.trim());
            
            String logradouro = viaCEP.getLogradouro();
            String bairro = viaCEP.getBairro();
            String municipio = viaCEP.getLocalidade();
            String uf = viaCEP.getUf();
           
            String vetEndereco[]={logradouro,bairro,municipio,uf};
           
            return vetEndereco;
        } catch (ViaCEPException ex) {
           JOptionPane.showMessageDialog(null, "CEP inválido ", "DEVELPERS SYSTEM ", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return null;
       
    }
}
