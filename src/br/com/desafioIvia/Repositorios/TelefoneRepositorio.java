package br.com.desafioIvia.Repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.desafio.entity.util.EntityManagerUtil;
import models.Telefone;
import models.Usuario;

public class TelefoneRepositorio implements ITelefoneRepositorio{

	EntityManager em = EntityManagerUtil.getEntityManager();

	
	public Telefone obterTelefonePorId(int id) {
		Telefone telefone = em.find(Telefone.class, id);
		return telefone;
	}
	
	public void cadastrarTelefone(Telefone tel) {
		em.getTransaction().begin();
		em.persist(tel);
		em.getTransaction().commit();
	}
	
	public List<Telefone> ListaTodos(){

		String consulta = "From Telefone";
		TypedQuery<Telefone> query = em.createQuery(consulta, Telefone.class);
		List<Telefone> resultado = query.getResultList();

		return resultado;
	}
	
	public void removerTelefone(int id) {
		Telefone telefone = em.find(Telefone.class, id);
		em.getTransaction().begin();
		em.remove(telefone);
		em.getTransaction().commit();
	}
	
	
}
