package br.com.cognizant.spring.dao;

import java.util.List;

import br.com.cognizant.spring.exception.RegistroNaoEncontradoException;

public interface GenericDAO <Tabela, Chave> {

	void cadastrar(Tabela tabela);
	
	void atualizar(Tabela tabela);
	
	void excluir(Chave codigo) throws RegistroNaoEncontradoException;
	
	Tabela buscar(Chave codigo);
	
	List<Tabela> listar();
	
}


