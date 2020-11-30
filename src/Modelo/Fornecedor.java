package Modelo;

import java.io.IOException;

import Persistencia.FornecedorDao;


public class Fornecedor extends Pessoa {

    private String razaoSocial;
    private String cnpj;

    public Fornecedor() {
        super();
    }

    public Fornecedor(String razaoSocial, String cnpj, String telefone, String email, Endereco endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;

    }

    public Fornecedor(String razaoSocial) {

        this.razaoSocial = razaoSocial;

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void gravar(Fornecedor fornecedor) throws IOException {
        FornecedorDao fornecedorDao = new FornecedorDao();
        fornecedorDao.CadastrarFornecedor(fornecedor);

    }

    @Override
    public String toString() {
        return "Fornecedor{" + "razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + '}';
    }

}
