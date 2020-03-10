package br.com.desafioIvia.Repositorios;

import java.util.List;

import javax.persistence.TypedQuery;

import models.Telefone;

public interface ITelefoneRepositorio {

    public Telefone obterTelefonePorId(int id);
	
	public void cadastrarTelefone(Telefone tel);
	
	public List<Telefone> ListaTodos();
	
	public void removerTelefone(int id);
}
