package Persistencia;

import Modelo.Endereco;
import Modelo.Escola;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscolaDao {

    private File file = new File("Escola.txt");

    public  ArrayList<Escola> escolas = new ArrayList<>();

    public void CadastrarEscola(Escola escola) throws IOException {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(file, true);
            pw = new PrintWriter(fw);
            pw.println(getEscola(escola));

        } catch (IOException ex) {
            System.out.println("Não é possível cadastrar escola! " + ex);

        } finally {
            fw.close();
            pw.close();
        }
    }

    public ArrayList<Escola> LerEscola() throws IOException {
        Escola escola = new Escola();

        String linha = null;

        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {

            linha = br.readLine();
            while (linha != null) {
                ListarEscola(linha.split(";"));

                linha = br.readLine();

            }

        } catch (IOException ex) {
            System.out.println("Não é possível ler o arquivo escola! " + ex);

        }

        return escolas;

    }

    public ArrayList<Escola> ListarEscola(String vet[]) {
        int numeroCasa = Integer.parseInt(vet[6]);//endereco

        try {

            escolas.add(new Escola(vet[0], vet[1], vet[2], vet[3],
                     new Endereco(vet[4], vet[5], numeroCasa, vet[7], vet[8], vet[9], vet[10])));

            return escolas;
        } catch (NumberFormatException ex) {
            System.out.println("Erro ao converter Numero");

        }
        return null;

    }

    public String getEscola(Escola escola) {
        String escolaString
                = escola.getRazaoSocial() + ";"
                + escola.getCnpj() + ";"
                + escola.getTelefone() + ";"
                + escola.getEmail() + ";"
                
                + escola.getEndereco().getCep() + ";"
                + escola.getEndereco().getLogradouro() + ";"
                  + escola.getEndereco().getNumero() + ";"
                 + escola.getEndereco().getComplemento() + ";"
                
                + escola.getEndereco().getBairro() + ";"
                + escola.getEndereco().getMunicipio() + ";"
              
              
                + escola.getEndereco().getUf()+";";

        return escolaString;

    }

}
