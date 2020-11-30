package Controller;

import java.io.IOException;

import Modelo.Endereco;
import Modelo.Escola;
import Persistencia.EscolaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EscolaController {

    ArrayList<Escola> escolas = new ArrayList<>();

    public boolean CadastrarEscola(String razaoSocial, String cnpj, String telefone,
            String email, Endereco endereco) throws IOException {
        
    //  if (!razaoSocial.equals("") && !cnpj.equals("") && !email.equals("")
    //            && !telefone.equals("") && endereco != null ) {

            Escola escola = new Escola(razaoSocial, cnpj, telefone, email, endereco);
            escola.gravar(escola);
            
           JOptionPane.showMessageDialog(null, "Dados salvos com sucesso","DEVELOPERS-MAIN/SYSTEM",JOptionPane.INFORMATION_MESSAGE);
            return true;

      //  } else {
       //     JOptionPane.showMessageDialog(null, "Erro ao Salvar dados","DEVELOPERS-MAIN/SYSTEM",JOptionPane.ERROR_MESSAGE);
        //    return false;
        //}

    }

    public ArrayList<Escola> litarEscolas() throws IOException {
       
       
            
        EscolaDao escolaDao = new EscolaDao();
        escolas=escolaDao.LerEscola();
        
          return escolas;
        
        
     
      
    }
    
    
    
    
    
    
    
   
        
        
    }

