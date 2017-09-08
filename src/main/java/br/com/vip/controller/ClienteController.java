package br.com.vip.controller;

import java.io.BufferedReader;
import java.text.ParseException;

import java.util.List;

//import javax.ws.rs.PUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.vip.interfaces.RepositoryClienteInterface;
import br.com.vip.model.Cliente;
import java.text.SimpleDateFormat;
@RestController
@RequestMapping("cliente")
public class ClienteController {

	//Injeção de dependencia
	@Autowired
	RepositoryClienteInterface repository;

	@CrossOrigin
	@RequestMapping(value = "/lista/tudo", method = RequestMethod.GET)
	public List<Cliente> listaTudo() {
		return (List<Cliente>) repository.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/busca/id/{id}", method = RequestMethod.GET)
	public Cliente buscaPorId(@PathVariable(value="id") Long id) {
		return repository.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(value ="/deleta/{id}", method = RequestMethod.GET)
	public String deleta(@PathVariable(value="id") Long id) {	
		repository.delete(id);
		return "deletou ";
	}

	@CrossOrigin
	@RequestMapping(value = "/salva/{cliente}", method = RequestMethod.GET)
	public Cliente adicionaJson(@PathVariable(value="cliente") String cliente){	
		
		Gson gson = new Gson();
		Cliente clienteObject = gson.fromJson(cliente, Cliente.class );	
		
		return repository.save(clienteObject);
	}
	
	
	
	
	
	
	
}
