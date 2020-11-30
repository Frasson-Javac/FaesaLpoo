/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Modelo.Cliente;
import Modelo.Endereco;

public class Cliente_Dao {

    File file = new File("Clientes.txt");
     public  static ArrayList<Cliente> clientes = new ArrayList<>();

    public void Gravar(Cliente cliente) throws IOException {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(file,true);
            pw = new PrintWriter(fw);

            pw.println(getCliente(cliente));
            

        } catch (IOException ex) {
           System.out.println("Não é possível Salvar cliente! " + ex);

        } finally {
            fw.close();
            pw.close();

        }
        
            

    }

    public String getCliente(Cliente cliente) {
        String strCliente = 
                cliente.getNome() + ";" 
                + cliente.getCpf() + ";" 
                + cliente.getTelefone()+ ";"
                + cliente.getEmail() + ";" 
                
                + cliente.getEndereco().getCep() + ";"
                + cliente.getEndereco().getLogradouro() + ";"
                + cliente.getEndereco().getNumero() + ";"
                 + cliente.getEndereco().getComplemento() + ";"
                + cliente.getEndereco().getBairro() + ";"
                + cliente.getEndereco().getMunicipio() + ";"
                + cliente.getEndereco().getUf()+";";

        return strCliente;

    }

    public ArrayList<Cliente> lerClientes() throws IOException {
        
        String linha = null;

        try(BufferedReader br=new BufferedReader(new FileReader(file))) {
           
           
            linha=br.readLine();
            while (linha!=null) {
                 
               ObterLista(linha.split(";"));
               linha=br.readLine();
               

            }
       }catch (IOException ex){
           System.out.println("Não é possível ler o arquivo Cliente! " + ex);
       }
        
   
         return clientes;
        }

    

    

    public ArrayList<Cliente> ObterLista(String vet[]) {
       
         int numeroCasa=Integer.parseInt(vet[6]);//endereco
        clientes.add(new Cliente(vet[0], vet[1], vet[2], vet[3],
                
                  new Endereco(vet[4], vet[5], numeroCasa, vet[7], vet[8], vet[9], vet[10])));
        
       return clientes;

    }
}
