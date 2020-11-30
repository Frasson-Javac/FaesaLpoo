package Persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Modelo.Usuario;



public class UsuarioDao {
	private File file = new File("usuario.txt");
	private Usuario usuario;

	public void CadastrarUsuario(Usuario usuario) throws IOException {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			pw.println(getUsuario(usuario));

		} catch (IOException ex) {
			System.out.println("Não é possível cadastrar usuário! " + ex);

		}

		finally {
			fw.close();
			pw.close();
		}
	}
	
	public void LerUsuario() throws IOException {
		Usuario usuario = new Usuario();
		FileReader fr = null;
		BufferedReader br = null;
		String linha[];
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while (br.ready()) {
				linha = br.readLine().split(";");
				ListarUsuario(linha);
				
			}
				
		
		} catch (IOException ex) {
			System.out.println("Não é possível ler o arquivo usuário! " + ex);

		}
		finally {
			fr.close();
			br.close();
		}
		
	}
        
        public  String getUsuario(Usuario usuario){
            String obterUsuario = usuario.getEmail() + ";" + usuario.getSenha() + ";" + usuario.getMatricula()+ ";" + usuario.getNome();
            return obterUsuario;
        }
	public void ListarUsuario(String vet []) {
		ArrayList <Usuario> usuarios = new ArrayList();
		usuarios.add(new Usuario(vet[0], vet[1], vet[2], vet[3]));
		
		for(int i=0; i<usuarios.size(); i++){
			System.out.println(usuarios.get(i));
		}
	}
}