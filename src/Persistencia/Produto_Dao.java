/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Produto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Produto_Dao {
    
  File file = new File("Produto.txt");

    public void Gravar(Produto produto) throws IOException {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(file);
            pw = new PrintWriter(fw);

            pw.println(getProduto(produto));

        } catch (IOException ex) {
            throw new IOException("Não e possivel salvar o arquivo" + ex);

        } finally {
            fw.close();
            pw.close();

        }

    }

    public String getProduto(Produto produto) {
        String strProduto = produto.getCodProduto() + ";" +produto.getQtdProduto() + ";"
                + produto.getModelo()+ ";" +   produto.getTipoUniforme()     + ";" + produto.getTamanho();

        return strProduto;

    }

    public void ObterListaProduto() throws IOException {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while (br.ready()) {
                String linha[] = br.readLine().split(";");
                ObterLista(linha);

            }
       }catch (IOException ex){
           
        }finally{
            br.close();
            fr.close();
        }
        }

    

    

    public void ObterLista(String vet[]) {
        ArrayList<Produto> produto = new ArrayList<>();

        produto.add(new Produto( Integer.parseInt( vet[0]), Integer.parseInt( vet[1]),
                vet[2], vet[3], vet[4]));
        
        for(int i=0; i< produto.size();i++){
            System.out.println(produto.get(i));
        }

    }
}
