package br.com.desafioIvia.Repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.desafio.beans.ManterUsuarioBean;
import br.com.desafio.entity.util.EntityManagerUtil;
import models.Usuario;

public class UsuarioRepositorio implements IUsuarioRepositorio{
	
	EntityManager em = EntityManagerUtil.getEntityManager();
	
	public Usuario obterUsuarioPorId(int id) {
		
		Usuario usuario = em.find(Usuario.class, id);
		return usuario;
	}
	
	public void cadastrarPessoa(Usuario p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
	
	public List<Usuario> ListaTodos(){

		String consulta = "From Usuario";
		TypedQuery<Usuario> query = em.createQuery(consulta, Usuario.class);
		List<Usuario> resultado = query.getResultList();

		return resultado;
	}
	
	public void removerUsuario(int id) {
		Usuario usuario = em.find(Usuario.class, id);
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
	}
	
	public String editarUsuario(int id) {
	
		return "editar";

	}


}
