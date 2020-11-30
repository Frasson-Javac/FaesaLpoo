
import Controller.EscolaController;
import Controller.FornecedorController;
import Modelo.Endereco;
import Modelo.Fornecedor;
import Persistencia.Cliente_Dao;
import Persistencia.EscolaDao;
import Persistencia.FornecedorDao;
import java.io.IOException;
import java.util.ArrayList;
import services.BuscarCep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinic
 */
public class text_Fornecedor {
    public static void main(String[] args) throws IOException {
       
       FornecedorDao dao=new FornecedorDao();
     //  dao.CadastrarFornecedor(new Fornecedor("5", "5", "5", "5", new Endereco("5", "5", "5", "5", "5", "5", "5")));
      
       EscolaController c=new EscolaController();
     // System.out.println(c.litarEscolas());
        //c.CadastrarEscola("h", "11", "11", "11", new Endereco("22", "11", "11", "1111", "11111", 0, "1111"));
       // EscolaDao esc=new EscolaDao();
       System.out.println(dao.LerFornecedor());
        Cliente_Dao daoCli=new
 Cliente_Dao();
        System.out.println(daoCli);
        
       //
      
       
       
       
          
          
       
    }
    
}
