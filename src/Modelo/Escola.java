package Modelo;

import java.io.IOException;

import Persistencia.EscolaDao;


public class Escola extends Pessoa {
	private String razaoSocial;
	private String cnpj;
	private Endereco endereco;

	public Escola() {
		super();
	}

	public Escola(String razaoSocial, String cnpj, String telefone, String email, Endereco endereco) {
		super(email, telefone, endereco);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
                this.endereco=endereco;

	}
	
	public Escola(String razaoSocial, String cnpj, String telefone, String email) {
		super(email, telefone);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;

	}

    public Escola(String razaoSocial) {
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


	@Override
	public String toString() {
		return "Escola [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}
	

	public void gravar(Escola escola) throws IOException {
		EscolaDao escolaDao = new EscolaDao();
		escolaDao.CadastrarEscola(escola);
		
		
	}

}
