/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Escola;
import Modelo.Fornecedor;
import Modelo.PedidoCompra;
import Modelo.Produto;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic produto=new Produto(codigoProduto, qtdeProduto, tipoUniforme, genero, tamanho, valor);
 */
public class PedidoCompraController {

    PedidoCompra pedidoCompra;
    Produto_Controller produto_Controller;

    public boolean casdastrarPedidoCompra(int idCompra,int Codigoproduto,int qtdes,
            String tipoUniforme,String genero,String tamanho,double valorUnit,
            String hora, String data, float valor, String razaoSocial, String razaoSocialEscola) {

        pedidoCompra = new PedidoCompra(idCompra, new Produto
        (Codigoproduto, qtdes, tipoUniforme, genero, tamanho, valorUnit), hora, data, valor,
                new Fornecedor(razaoSocial), new Escola(razaoSocialEscola));

        try {
            pedidoCompra.salvarpedido(pedidoCompra);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar dados", "DEVELOPERS-MAIN/SYSTEM", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", "DEVELOPERS-MAIN/SYSTEM", JOptionPane.INFORMATION_MESSAGE);
        return true;

    }

}


