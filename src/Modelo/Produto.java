/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.io.IOException;
import Persistencia.Produto_Dao;

/**
 *
 * @author gabri
 */
public class Produto {
    private int codProduto;
    private int qtdProduto;
    private String TipoUniforme;
    private String modelo;
    private String Tamanho;
    private double valorUnt;
    
    
    
     public Produto() {
    }

    public Produto(int codProduto, int qtdProduto, String TipoUniforme, String modelo, String Tamanho, double valorUnt) {
        this.codProduto = codProduto;
        this.qtdProduto = qtdProduto;
        this.TipoUniforme = TipoUniforme;
        this.modelo = modelo;
        this.Tamanho = Tamanho;
        this.valorUnt = valorUnt;
    }

    public Produto(int parseInt, int parseInt0, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", qtdProduto=" + qtdProduto + ", TipoUniforme=" + TipoUniforme + ", modelo=" + modelo + ", Tamanho=" + Tamanho + ", valorUnt=" + valorUnt + '}';
    }

  

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public String getTipoUniforme() {
        return TipoUniforme;
    }

    public void setTipoUniforme(String TipoUniforme) {
        this.TipoUniforme = TipoUniforme;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }
    
     public double getValorUnt() {
        return valorUnt;
    }

    public void setValorUnt(double valorUnt) {
        this.valorUnt = valorUnt;
    }


    public void Gravar(Produto produto) throws IOException{

        Produto_Dao produto_dao = new  Produto_Dao();
          produto_dao.Gravar(produto);
            
        }

   
}
