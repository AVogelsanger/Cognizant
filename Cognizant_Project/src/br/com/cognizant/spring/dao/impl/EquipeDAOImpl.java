package br.com.cognizant.spring.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.cognizant.spring.dao.EquipeDAO;
import br.com.cognizant.spring.model.Equipe;

@Repository
public class EquipeDAOImpl extends GenericDAOImpl<Equipe, Integer> implements EquipeDAO{

}
