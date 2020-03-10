package br.com.desafio.beans;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.desafioIvia.Fachada.UsuarioFachada;
import models.Telefone;
import models.Usuario;


@ManagedBean  @SessionScoped
public class ManterTelefoneBean {

	private Telefone telefone;
	private Usuario usuario;
	
	private List<Telefone> telefones;
	  
	UsuarioFachada usuarioFachada = new UsuarioFachada();
	
	public Usuario getUsuario() {
		if(usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}
	
	public Telefone getTelefone() {
		if(telefone == null) {
			telefone = new Telefone();
		}
		return telefone;
	}
	
	public String cadastroTelefones(Usuario obj) {
		this.usuario = obj;
		this.telefone = new Telefone();
		this.telefones = usuarioFachada.ListaTodosTelefones();
				
		return "cadastrotel";
	}
	
	/*public String cadastrarTelefone(int usuarioId) {
		this.usuario = usuarioFachada.obterUsuarioPorId(usuarioId);
	    telefone.setUsuario(usuario); 
		usuarioFachada.cadastrarTelefone(telefone);
		
		return "listar";
	}*/

	public String cadastrarTelefone() {
		
	    telefone.setUsuario(this.usuario); 
		usuarioFachada.cadastrarTelefone(telefone);
		
		return "listar" ;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Telefone> obterTelefonesPorUsuario(){
	
		return usuarioFachada.ListaTodosTelefones()
				.stream().filter(p -> p.getUsuario() == this.usuario).collect(Collectors.toList());
	}
	
	
	
}
