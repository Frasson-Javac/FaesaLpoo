package Controller;

import Modelo.Endereco;
import java.io.IOException;

import Modelo.Fornecedor;
import Persistencia.FornecedorDao;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FornecedorController {

    Fornecedor fornecedor;
    FornecedorDao dao = new FornecedorDao();
    public static ArrayList<Fornecedor>fornecedores=new ArrayList<>();

    public boolean CadastrarFornecedor(String razaoSocial, String cnpj, String email, String telefone,
            Endereco endereco) throws IOException {

        if (!razaoSocial.equals("") && !cnpj.equals("") && !email.equals("")
                && !telefone.equals("") && endereco != null && pesquisarFornecedor(cnpj) == false) {

            fornecedor = new Fornecedor(razaoSocial, cnpj, email, telefone, endereco);
            fornecedor.gravar(fornecedor);

            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso","DEVELOPERS-MAIN/SYSTEM",JOptionPane.INFORMATION_MESSAGE);
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar dados","DEVELOPERS-MAIN/SYSTEM",JOptionPane.ERROR_MESSAGE);
            return false;

        }
       
    }
    
    
     public boolean pesquisarFornecedor(String cnpj)   {

        fornecedores = dao.LerFornecedor();

        for (int i = 0; i < fornecedores.size(); i++) {

            if( fornecedores.get(i).getCnpj().equals(cnpj)){
                JOptionPane.showMessageDialog(null, "esse CNPJ já está cadastrado","DEVELOPERS-MAIN/SYSTEM",JOptionPane.INFORMATION_MESSAGE);
                return  true;
            }
            
        }

        return false;

    }
    
    
    
    
    
    
    
    

}
