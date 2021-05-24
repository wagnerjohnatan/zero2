package br.zero2.entidade;

import java.util.ArrayList;

public class Usuarios {
	
	public static void main (String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList();
		
		Usuario usuario = new Usuario("wagner", "exemplo1@gmail.com","123456");
		Usuario usuario1 = new Usuario("maria", "exemplo2@gmail.com","1234");
		Usuario usuario2 = new Usuario("joão", "exemplo3@gmail.com","123");
		Usuario usuario3 = new Usuario("cesar", "exemplo14@gmail.com","12");
		
		
		usuarios.add(usuario);
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		
		
		for(Usuario c : usuarios) {
			
			System.out.println(c);
		}
		
		
		
	}
	
	

}

