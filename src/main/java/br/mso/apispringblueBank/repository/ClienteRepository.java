package br.mso.apispringblueBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.mso.apispringblueBank.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
