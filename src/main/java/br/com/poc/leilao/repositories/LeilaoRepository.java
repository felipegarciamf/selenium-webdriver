package br.com.poc.leilao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.poc.leilao.model.Leilao;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long> {

}
