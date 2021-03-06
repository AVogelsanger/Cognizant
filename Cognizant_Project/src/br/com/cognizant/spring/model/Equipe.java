package br.com.cognizant.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@SequenceGenerator(name="equipe", allocationSize=1)
public class Equipe {

	@Id
	@GeneratedValue(generator="equipe", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Size(min= 3)
	@NotBlank(message="O nome da equipe � obrigat�rio.")
	private String nome;
	
	@Column(name="ds_departamento")
	private Departamento departamento;
	
	@ManyToOne
	private Projeto projeto;

	public Equipe() {
		super();
	}

	public Equipe(String nome, Departamento departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
