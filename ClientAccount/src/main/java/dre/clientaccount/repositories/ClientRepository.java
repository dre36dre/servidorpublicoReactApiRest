package dre.clientaccount.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dre.clientaccount.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	  
}
