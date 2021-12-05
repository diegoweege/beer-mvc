package br.com.beer.mvc.controller;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.beer.mvc.domain.Beer;
import br.com.beer.mvc.request.BeerRequest;
import br.com.beer.mvc.service.BeerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/beer")
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

    @GetMapping
    public List<Beer> findBeer() {
        return beerService.find();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void save(@RequestBody BeerRequest request) {
        beerService.save(request);
    }
}
