/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Produto;
import java.io.IOException;


/**
 *
 * @author gabri
 */
public class Produto_Controller {
    
    
   public boolean GravarProduto(int codProduto, int qtdProduto, String TipoUniforme, String modelo, String Tamanho) 
           throws IOException{
       
       // if( codProduto >0 && qtdProduto >0 && TipoUniforme.length()>0 && TipoUniforme != null &&
             //   modelo.length()>0 && modelo != null &&  Tamanho.length()>0 && Tamanho != null){
            
            Produto produto = new Produto(codProduto, qtdProduto, TipoUniforme, modelo, Tamanho);
            produto.Gravar(produto);
            
            return true;
            
          
        //}else{
        //    return false;
            
      //  }
    }
    
} 

