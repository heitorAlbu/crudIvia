package br.com.desafioIvia.Repositorios;

import java.util.List;

import javax.persistence.TypedQuery;

import models.Usuario;

public interface IUsuarioRepositorio {

	public Usuario obterUsuarioPorId(int id);
	
	public void cadastrarPessoa(Usuario p);
	
	public List<Usuario> ListaTodos();
	
	public void removerUsuario(int id);
	
	public String editarUsuario(int id);
	
		
	
}
