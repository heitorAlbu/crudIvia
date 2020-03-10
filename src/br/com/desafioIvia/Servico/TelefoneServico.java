package br.com.desafioIvia.Servico;

import java.util.List;

import br.com.desafioIvia.Repositorios.ITelefoneRepositorio;
import br.com.desafioIvia.Repositorios.TelefoneRepositorio;
import models.Telefone;

public class TelefoneServico {

	public ITelefoneRepositorio telefoneRepositorio;
	
	public TelefoneServico() {
		this.telefoneRepositorio = new TelefoneRepositorio();
	}
	
	public Telefone obterTelefonePorId(int id) {
		return telefoneRepositorio.obterTelefonePorId(id);
	};
	
	public void cadastrarTelefone(Telefone tel) {
		telefoneRepositorio.cadastrarTelefone(tel);
	};
	
	public List<Telefone> ListaTodos(){
		return telefoneRepositorio.ListaTodos();
	};
	
	public void removerTelefone(int id) {
		telefoneRepositorio.removerTelefone(id);
	};
	
	
}
