package com.helpdelas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helpdelas.domain.OrdemServico;


@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {

}
