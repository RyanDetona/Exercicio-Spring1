package com.example.Ryan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ryan.Services.ClienteService;
import com.example.Ryan.entities.ClienteEntities;

@RestController
@RequestMapping("/Cliente")
public class ClienteControllers {
	private final ClienteService clienteService;

	@Autowired
	public ClienteControllers(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	public ClienteEntities createCliente(@RequestBody ClienteEntities cliente) {
		return clienteService.saveCliente(cliente);
	}

	@GetMapping("/{id}")
	public ClienteEntities getCliente(@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}

	@GetMapping
	public List<ClienteEntities> getAllCliente() {
		return clienteService.getAllCliente();
	}

	@DeleteMapping
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}

}