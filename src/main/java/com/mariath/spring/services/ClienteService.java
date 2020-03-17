package com.mariath.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariath.spring.domain.Cliente;
import com.mariath.spring.repositories.ClienteRepository;
import com.mariath.spring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado...:Id: " + id + ", Tipo: " + 
		Cliente.class.getName()));


}
	
}
