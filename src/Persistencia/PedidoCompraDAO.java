/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Escola;
import Modelo.Fornecedor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Modelo.PedidoCompra;
import Modelo.Produto;

/**
 *
 * @author vinic
 */
public class PedidoCompraDAO {

    File file = new File("PedidoCompra.txt");
    ArrayList<PedidoCompra> pedidos=new ArrayList<>();
    

    public void gravarPedidoCompra(PedidoCompra pedidoCompra) throws IOException {

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(file, true);
            pw = new PrintWriter(fw);

            pw.println(getPedidoCompra(pedidoCompra));

        } catch (IOException ex) {

        } finally {

            pw.close();
            fw.close();
        }
    }

    public ArrayList<PedidoCompra> ListarPedidoCompra(PedidoCompra pedidoCompra) throws FileNotFoundException, IOException {
        pedidoCompra = new PedidoCompra();

        String linha = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {

            linha = br.readLine();

            while (linha != null) {

                pedido(linha.split(";"));

            }

        } catch (IOException ex) {

        }
        
        return pedidos;
    }

    public String getPedidoCompra(PedidoCompra pedidoCompra) {

        String obterPedido
                = pedidoCompra.getIdCompra() + ";"
                + pedidoCompra.getProduto().getCodProduto() + ";"
                +pedidoCompra.getProduto().getQtdProduto()+";"
                + pedidoCompra.getProduto().getTipoUniforme() + ";"
                + pedidoCompra.getProduto().getModelo() + ";"
                + pedidoCompra.getProduto().getTamanho()+";"
                +pedidoCompra.getProduto().getValorUnt()+";"
                + pedidoCompra.getHora() + ";"
                + pedidoCompra.getData() + ";"
                +pedidoCompra.getValor()+";"
                +pedidoCompra.getFornecedor().getRazaoSocial()+";"
                +pedidoCompra.getEscola();
              
      

        return obterPedido;

    }

    public ArrayList<PedidoCompra> pedido(String[] vet) {

        ArrayList<PedidoCompra> pedidosCompras = new ArrayList<>();
        int codigoCompra = Integer.parseInt(vet[0]);

        //produto
        int codigoProduto = Integer.parseInt(vet[1]);
        int qtde = Integer.parseInt(vet[2]);
        String uniforme = vet[3];
        String modelo = vet[4];
        String tamanho = vet[5];
        Double valorProduto = Double.parseDouble(vet[6]);
        //compra
        String hora = vet[7];
        String data = vet[8];
        Float valorCompra = Float.parseFloat(vet[9]);

        //Fornecedor
        String nomeFornecedor = vet[10];
        //Escola
        String nomeEscola = vet[11];

        try {

            pedidos.add(new PedidoCompra(codigoCompra,
                    new Produto(codigoProduto, qtde, uniforme, modelo, tamanho, valorProduto),
                    hora, data, valorCompra, new Fornecedor(nomeFornecedor), new Escola(nomeEscola)));

            return pedidosCompras;

        } catch (NumberFormatException ex) {
            System.out.println("Erro ao converter Numero");

        }
        return null;

    }

}
