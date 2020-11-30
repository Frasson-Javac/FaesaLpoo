/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author francis
 */
public class Venda {
    
    private String codigo;
    private String data;
    private String hora;
    private String formaEnvio;    
    private Cliente cliente;
    private Produto produto;
    private Escola escola;
    private double valorTotal;

    
    public Venda(String Codigo, String Data, String Hora, String FormaEnvio,double valorTotal, Cliente Cliente, Produto Produto, Escola Escola) {
        this.codigo = Codigo;
        this.data = Data;
        this.hora = Hora;
        this.valorTotal = valorTotal;
        this.formaEnvio = FormaEnvio;
        this.cliente = Cliente;
        this.produto = Produto;
        this.escola = Escola;
       
    }

    public Venda() {
    }

   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String Data) {
        this.data = Data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String Hora) {
        this.hora = Hora;
    }

    public String getFormaEnvio() {
        return formaEnvio;
    }

    public void setFormaEnvio(String FormaEnvio) {
        this.formaEnvio = FormaEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.cliente = Cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto Produto) {
        this.produto = Produto;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola Escola) {
        this.escola = Escola;        
        
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", data=" + data + ", hora=" + hora + ", formaEnvio=" + formaEnvio + ", cliente=" + cliente + ", produto=" + produto + ", escola=" + escola + ", valorTotal=" + valorTotal + '}';
    }

  
    
}

