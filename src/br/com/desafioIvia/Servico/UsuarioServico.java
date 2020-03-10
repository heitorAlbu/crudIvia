package br.com.desafioIvia.Servico;

import java.util.List;

import br.com.desafioIvia.Repositorios.IUsuarioRepositorio;
import br.com.desafioIvia.Repositorios.UsuarioRepositorio;
import models.Usuario;

public class UsuarioServico  {
	
	IUsuarioRepositorio usuarioRepositorio ;
	
	public UsuarioServico() {
		this.usuarioRepositorio = new UsuarioRepositorio();
	}
	
	public void deletarUsuario(int id) {
		usuarioRepositorio.removerUsuario(id);
	}
	
	public Usuario obterUsuarioPorId(int id) {
		return usuarioRepositorio.obterUsuarioPorId(id);
	};
	
	public void cadastrarPessoa(Usuario p) {
		usuarioRepositorio.cadastrarPessoa(p);
	};
	
	public List<Usuario> ListaTodos(){
		return usuarioRepositorio.ListaTodos();
	};
	
	
	
	public String editarUsuario(int id) {
		return usuarioRepositorio.editarUsuario(id);
	};
	
	
	

}
