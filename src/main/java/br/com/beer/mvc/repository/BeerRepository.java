package br.com.beer.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.beer.mvc.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {

}
