package Modelo;


import java.io.IOException;
import Persistencia.UsuarioDao;


public class Usuario  {
	private String email;
	private String senha;
	private String matricula;
        private String nome;

    public Usuario() {
        
    }
        
        
 public Usuario(String email, String senha, String matricula, String nome) {
        this.email = email;
        this.senha = senha;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + ", matricula=" + matricula + ", nome=" + nome + '}';
    }


	

	

	public void gravar(Usuario usuario) throws IOException {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.CadastrarUsuario(usuario);
		
		
	}
	
}
