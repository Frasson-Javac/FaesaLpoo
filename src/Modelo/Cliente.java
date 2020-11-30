/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Persistencia.Cliente_Dao;
import java.io.IOException;

public class Cliente extends Pessoa {

    private String nome;

    private String cpf;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String tel, String email , Endereco endereco) {
        super(email, tel, endereco);

        this.cpf = cpf;
        this.nome=nome;
    }

    public Cliente(String nome, String cpf) {
        this.cpf = cpf;
        this.nome=nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

   

    public void Gravar(Cliente cliente) throws IOException {
        Cliente_Dao cliente_dao = new Cliente_Dao();
        cliente_dao.Gravar(cliente);

    }
    

   
}
