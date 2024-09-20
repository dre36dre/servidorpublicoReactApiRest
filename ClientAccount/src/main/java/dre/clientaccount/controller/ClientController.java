package dre.clientaccount.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import dre.clientaccount.entities.Client;
import dre.clientaccount.repositories.ClientRepository;

@RestController
@RequestMapping(value="/clients")
public class ClientController {
	@Autowired
	private ClientRepository repository;
	
	@GetMapping
	public List<Client> findAll(){
		List<Client> result= repository.findAll() ;
		return result;
		
		}	
	@GetMapping(value= "/{id}")
	public Client findById(@PathVariable Long id) {
		return  repository.findById(id) .orElse(null);
		
	}	
	@PostMapping
	public Client insert(@RequestBody Client client){
		Client result= repository.save(client);
		return result;
	}
	
	@PutMapping("/{id}")
	public Client upDate(@PathVariable Long id, @RequestBody Client client) {
		Client clientCurrent=repository.findById(id).get();
		BeanUtils.copyProperties(client, clientCurrent, "id");
		return repository.save(clientCurrent);
		
	}


}
