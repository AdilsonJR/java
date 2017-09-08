package br.com.vip.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vip.model.Cliente;


public interface RepositoryClienteInterface extends JpaRepository<Cliente, Long> {

	
	
	
}
