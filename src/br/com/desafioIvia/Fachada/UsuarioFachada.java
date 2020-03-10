package br.com.desafioIvia.Fachada;

import java.util.List;

import br.com.desafioIvia.Servico.TelefoneServico;
import br.com.desafioIvia.Servico.UsuarioServico;
import models.Telefone;
import models.Usuario;

public class UsuarioFachada {

	
	UsuarioServico usuarioServico = new UsuarioServico();
	TelefoneServico telefoneServico = new TelefoneServico();
	
	
	public Usuario obterUsuarioPorId(int id) {
		return usuarioServico.obterUsuarioPorId(id);
	};
	
	public void cadastrarPessoa(Usuario p) {
		usuarioServico.cadastrarPessoa(p);
	};
	
	public List<Usuario> ListaTodos(){
		return usuarioServico.ListaTodos();
	};
	
		
	public String editarUsuario(int id) {
		return usuarioServico.editarUsuario(id);
	};
	
	public void deletarUsuario(int id) {
		usuarioServico.deletarUsuario(id);
	}
	
	public Telefone obterTelefonePorId(int id) {
		return telefoneServico.obterTelefonePorId(id);
	};
	
	public void cadastrarTelefone(Telefone tel) {
		telefoneServico.cadastrarTelefone(tel);
	};
	
	public List<Telefone> ListaTodosTelefones(){
		return telefoneServico.ListaTodos();
	};
	
	public void deletarTelefone(int id) {
		telefoneServico.removerTelefone(id);
	}
	
	
}
