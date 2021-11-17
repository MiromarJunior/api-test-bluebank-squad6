package br.mso.apispringblueBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mso.apispringblueBank.model.Cliente;
import br.mso.apispringblueBank.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public void save(Cliente cliente) {
		repository.save(cliente);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public List<Cliente> findAll() {
		return repository.findAll();
		// Sort.by(Sort.Direction.ASC, "nome")
	}

}
