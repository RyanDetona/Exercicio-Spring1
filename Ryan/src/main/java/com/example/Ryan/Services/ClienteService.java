package com.example.Ryan.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ryan.entities.ClienteEntities;
import com.example.Ryan.repositories.ClienteRepository;


@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
		
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public ClienteEntities saveCliente(ClienteEntities cliente) {
		return clienteRepository.save(cliente);
	}
	
	public ClienteEntities getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public List<ClienteEntities> getAllCliente() {
		return clienteRepository.findAll();
	}
	
	public void deleteCliente (Long id) {
		clienteRepository.deleteById(id);
	}
}

