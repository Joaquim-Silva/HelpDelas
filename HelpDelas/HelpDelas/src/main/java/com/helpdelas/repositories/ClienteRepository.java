package com.helpdelas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helpdelas.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
