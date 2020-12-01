/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Persistencia.PedidoCompraDAO;
import java.io.IOException;

/**
 *
 * @author vinic
 */
public class PedidoCompra {

    private int idCompra;
    private Produto produto;
    private String hora;
    private String data;
    private float valor;
    private Fornecedor fornecedor;
    private Escola escola;

    public PedidoCompra() {
    }

    public PedidoCompra(int idCompra, Produto produto, String hora, String data, float valor, Fornecedor fornecedor, Escola escola) {
        this.idCompra = idCompra;
        this.produto = produto;
        this.hora = hora;
        this.data = data;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.escola = escola;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
     
    public void salvarpedido(PedidoCompra pedidoCompra) throws IOException {
        PedidoCompraDAO pedidoCompraDAO = new PedidoCompraDAO();
        pedidoCompraDAO.gravarPedidoCompra(pedidoCompra);
    }

    

}
