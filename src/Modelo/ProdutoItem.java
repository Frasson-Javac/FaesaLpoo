/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vinic
 */
public class ProdutoItem {
    
   public int quantidade;
   public Produto produto;
   public String Descricao;

    public ProdutoItem(int quantidade, Produto produto, String Descricao) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
   
   
   
   
   
    
}
