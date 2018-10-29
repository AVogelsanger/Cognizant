package br.com.cognizant.spring.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@SequenceGenerator(name="projeto", allocationSize=1)
public class Projeto {

	@Id
	@GeneratedValue(generator="projeto", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Size(min=3)
	@NotBlank(message = "O nome do projeto é obrigatório.")
	private String nome;
	
	@Future
	private Calendar dataInicio;
	
	@Future
	private Calendar dataTermino;
	
	@OneToMany(mappedBy="projeto")
	private List<Equipe> equipes;

	public Projeto() {
		
	}
	
	public Projeto(String nome, Calendar dataInicio, Calendar dataTermino, List<Equipe> equipes) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.equipes = equipes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
}
