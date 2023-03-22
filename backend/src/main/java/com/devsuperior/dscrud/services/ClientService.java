package com.devsuperior.dscrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscrud.entities.Client;
import com.devsuperior.dscrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();

	}

}
