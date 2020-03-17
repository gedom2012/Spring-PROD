package com.mariath.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariath.spring.domain.Pedido;
import com.mariath.spring.repositories.PedidoRepository;
import com.mariath.spring.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado...:Id: " + id + ", Tipo: " + 
		Pedido.class.getName()));


}
	
}	
