package Modelo;

public class Endereco {
	private String cep; 
	private String logradouro;
	private String bairro;
	private String municipio;
	private int numero;
	private String complemento;
        private String uf;
	
	public Endereco() {
		
	}
	public Endereco(String cep, String logradouro, int numero,String complemento,String bairro, String municipio,String uf) {
		
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
                this.uf=uf;
		this.municipio = municipio;
		this.numero = numero;
                this.complemento=complemento;
		
	}
	public String getCep() {
		return cep;
		
		
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
        

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", municipio=" + municipio
		+ ", numero=" + numero + ", complemento=" + complemento + "]";
	}
	
	

}
