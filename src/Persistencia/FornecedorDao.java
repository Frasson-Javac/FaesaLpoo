package Persistencia;

import Modelo.Endereco;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Modelo.Fornecedor;

public class FornecedorDao {

    private File file = new File("fornecedor.txt");
    private Fornecedor fornecedor;
    ArrayList<Fornecedor> fornecedores = new ArrayList();
    FileWriter fw = null;
    PrintWriter pw = null;

    public void CadastrarFornecedor(Fornecedor fornecedor) throws IOException {

        try {
            fw = new FileWriter(file, true);
            pw = new PrintWriter(fw);
            pw.println(getFornecedor(fornecedor));

        } catch (IOException ex) {
            System.out.println("Não é possível cadastrar fornecedor! ");

        } finally {
            pw.close();
            fw.close();

        }

    }

    public ArrayList<Fornecedor> LerFornecedor() {

        String linha = null;

        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {

            linha = br.readLine();
            while (linha != null) {

                ListarFornecedor(linha.split(";"));
                linha = br.readLine();

            }

        } catch (IOException ex) {
            System.out.println("Não é possível ler o arquivo fornecedor! " + ex.getMessage());

        }
        return fornecedores;

    }

    public String getFornecedor(Fornecedor fornecedor) {
        String fornecedorTxt
                = fornecedor.getRazaoSocial() + ";"
                + fornecedor.getCnpj() + ";"
                + fornecedor.getTelefone() + ";"
                + fornecedor.getEmail() + ";"
                + fornecedor.getEndereco().getCep() + ";"
                + fornecedor.getEndereco().getLogradouro() + ";"
                + fornecedor.getEndereco().getNumero() + ";"
                + fornecedor.getEndereco().getComplemento() + ";"
                + fornecedor.getEndereco().getBairro() + ";"
                + fornecedor.getEndereco().getMunicipio() + ";"
                + fornecedor.getEndereco().getUf();

        return fornecedorTxt;

    }

    public ArrayList<Fornecedor> ListarFornecedor(String vet[]) {
        int numeroCasa = Integer.parseInt(vet[6]);//endereco
        try {

            fornecedores.add(new Fornecedor(vet[0], vet[1], vet[2], vet[3],
                    new Endereco(vet[4], vet[5], numeroCasa, vet[7], vet[8], vet[9], vet[10])));

        } catch (ArrayIndexOutOfBoundsException array) {
            System.out.println("Erro ao Recuperar o arquivo");

        }

        return fornecedores;
    }

}
