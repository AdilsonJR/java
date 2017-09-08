package br.com.vip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@NotNull
	//@NotBlank(message = "nome é obrigatorio.")
	private String nome;
	
	//@Column(nullable = false, length = 3)
   // @NotBlank(message = "idade é um campo obrigatorio.")
	private int idade;
	
	
	//@Column(nullable = false)
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@NotNull(message = "Data é uma informação obrigatória.")
	private String dataNascimento;
	
	public Cliente() { }
	
	

	public Cliente(String nome, int idade, String dataNascimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}



	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
}
