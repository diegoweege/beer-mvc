package br.com.beer.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.beer.mvc.domain.Beer;
import br.com.beer.mvc.repository.BeerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerService {

    private final BeerRepository beerRepository;

    public List<Beer> find() {
        return beerRepository.findAll();
    }
}
