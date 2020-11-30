package Modelo;

public abstract class Pessoa {
	
	private String email;
	private String telefone;
	private Endereco endereco;
	
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(String telefone, String email, Endereco endereco) {
		super();
		this.email = email;
		this.telefone = telefone;
		this.endereco= endereco;
		
	}
	public Pessoa(String email, String telefone) {
		super();
		this.email = email;
		this.telefone = telefone;
		
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
        
        
        
        
	@Override
	public String toString() {
		return "ClassePessoa [email=" + email + ", telefone=" + telefone + "]";
	}
}
