package br.zero2.view;

import br.zero2.entidade.*;
import java.util.ArrayList;

public class Dados {
	
	
	ArrayList<Usuario> usuarios = new ArrayList();
	
	
	public void cadastraUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public String numeroDeUsuarios() {
		return usuarios.size()+"";
	}

	

}
