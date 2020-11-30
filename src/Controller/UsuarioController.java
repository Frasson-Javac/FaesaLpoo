package Controller;

import java.io.IOException;

import Modelo.Usuario;


public class UsuarioController {

	public boolean CadastrarUsuario(String email,  String senha, String matricula, String nome) throws IOException {
		if (email.length() > 0 && email != null && senha.length() > 0 && 
		senha != null && matricula.length()>0 && matricula != null && nome.length()>0 && nome != null) {
		Usuario usuario = new Usuario(email,senha, matricula, nome);
		usuario.gravar(usuario);
		return true;
	
	}else {
		return false;
	}
		
}
	
}