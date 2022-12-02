package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

import com.ventas.ventas.model.Cliente;

public interface IClienteService {

	List<Cliente> findAll();
	
	Optional<Cliente> findById(Integer id);
	
	Cliente create(Cliente cliente);
	
	Cliente update(Cliente cliente);
	
	void delete(Integer id);
}
