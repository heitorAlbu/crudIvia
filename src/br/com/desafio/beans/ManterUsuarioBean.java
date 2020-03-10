package br.com.desafio.beans;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.desafioIvia.Fachada.UsuarioFachada;
import br.com.desafioIvia.Repositorios.UsuarioRepositorio;
import models.Usuario;
import net.bootsfaces.component.ajax.BootsFacesAJAXEvent;

@ManagedBean  @SessionScoped
public class ManterUsuarioBean {
	
	private Usuario usuario ;
	private List<Usuario> usuarios;
	
	private int idUsuarioSelecionado;
	private String nomeSelecionado;
	private String senhaSelecionada;

	
	
						  
	UsuarioFachada usuarioFachada = new UsuarioFachada();
	
	
	public ManterUsuarioBean() {
	
	}
	
	public Usuario getUsuario() {
		if(usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario pessoa) {
		this.usuario = pessoa;
	}

	public int getIdUsuarioSelecionado() {
		return idUsuarioSelecionado;
	}

	public void setIdUsuarioSelecionado(int idUsuarioSelecionado) {
		this.idUsuarioSelecionado = idUsuarioSelecionado;
	}

	public String getNomeSelecionado() {
		return nomeSelecionado;
	}

	public void setNomeSelecionado(String nomeSelecionado) {
		this.nomeSelecionado = nomeSelecionado;
	}

	public String getSenhaSelecionada() {
		return senhaSelecionada;
	}

	public void setSenhaSelecionada(String senhaSelecionada) {
		this.senhaSelecionada = senhaSelecionada;
	}

	public String cadastrarPessoa() {
		usuarioFachada.cadastrarPessoa(usuario);
		
		return "listar";
	}
	
	public List<Usuario> getUsuarios() {
		usuarios = usuarioFachada.ListaTodos();
		return usuarios;
	}

	public void deletarUsuario(int id) {
		usuarioFachada.deletarUsuario(id);
	}
	
	public String listarUsuarios() {
		
		this.usuarios = usuarioFachada.ListaTodos();
		
		return "listar";
		
	}
	
	
	public String editarUsuario(Usuario obj) {
		
		this.usuario = obj;
		
		return "editar";
	}

	public String cadastroUsuario() {
		
		this.usuario = new Usuario();
		
		return "cadastro";
	}

	

}
