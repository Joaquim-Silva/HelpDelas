package com.helpdelas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helpdelas.domain.Colaboradora;
@Repository
public interface ColaboradoraRepository extends JpaRepository<Colaboradora, Integer> {

}
