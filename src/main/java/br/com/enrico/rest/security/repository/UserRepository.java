package br.com.enrico.rest.security.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.enrico.rest.security.model.User;

public interface UserRepository extends CrudRepository {
	
	Iterable<User> findAll(); 
	
	
	
}
