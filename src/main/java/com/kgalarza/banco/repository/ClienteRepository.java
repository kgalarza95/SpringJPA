package com.kgalarza.banco.repository;

import com.kgalarza.banco.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository implements JpaRepository<Cliente, Long> {

}
