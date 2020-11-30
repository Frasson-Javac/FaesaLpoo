/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Cliente;
import Modelo.Escola;
import Modelo.Produto;
import Modelo.Venda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author francis
 */
public class Venda_Dao {

    File file = new File("Vendas.txt");
    FileWriter fw = null;
    PrintWriter pw = null;

    ArrayList<Venda> vendas = new ArrayList<>();

    public void CadastrarVenda(Venda venda) throws IOException {

        try {
            fw = new FileWriter(file, true);
            pw = new PrintWriter(fw);
            pw.println(getVendas(venda));

        } catch (IOException ex) {
            System.out.println("Não é possível cadastrar fornecedor! ");

        } finally {
            fw.close();
            pw.close();
        }
    }

    public ArrayList<Venda> LerVenda() {

        FileReader fr = null;
        BufferedReader br = null;
        String linha[] = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while (br.ready()) {
                linha = br.readLine().split(";");

                ListarVendas(linha);

            }

        } catch (IOException ex) {
            System.out.println("Não é possível ler o arquivo fornecedor! " + ex.getMessage());

        } finally {
            try {
                fr.close();
            } catch (IOException ex) {

            }
            try {
                br.close();
            } catch (IOException ex) {

            }
        }

        vendas = ListarVendas(linha);
        return vendas;

    }

    public String getVendas(Venda vendas) {
        String vendasTxt
                = vendas.getCodigo() + ";"
                + vendas.getData() + ";"
                + vendas.getHora() + ";"
                + vendas.getFormaEnvio() + ";"
                + vendas.getValorTotal() + ";"
                
                + vendas.getCliente().getNome() + ";"
                + vendas.getCliente().getCpf() + ";"
                
                + vendas.getProduto().getCodProduto() + ";"
                + vendas.getProduto().getQtdProduto() + ";"
                + vendas.getProduto().getTipoUniforme() + ";"
                + vendas.getProduto().getModelo() + ";"
                + vendas.getProduto().getTamanho() + ";"
                + vendas.getProduto().getValorUnt()+ ";"
                
                + vendas.getEscola().getRazaoSocial();

        return vendasTxt;

    }

    public ArrayList<Venda> ListarVendas(String vet[]) {
        double valorTotal = Double.parseDouble(vet[4]);
        int codProduto = Integer.parseInt(vet[7]);
        int qtdProduto = Integer.parseInt(vet[8]);
        double valorUnt = Double.parseDouble(vet[12]);
        try {

            
            vendas.add(new Venda(vet[0], vet[1], vet[2], vet[3], valorTotal,
                    new Cliente(vet[5], vet[6]),
                    new Produto(codProduto, qtdProduto, vet[9], vet[10], vet[11], valorUnt),
                    new Escola(vet[13])));

        } catch (ArrayIndexOutOfBoundsException array) {
            System.out.println("Erro ao Recuperar o arquivo");

        }

        return vendas;
    }

}
