package br.com.beer.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.beer.mvc.domain.Beer;
import br.com.beer.mvc.domain.BeerType;
import br.com.beer.mvc.repository.BeerRepository;
import br.com.beer.mvc.request.BeerRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerService {

    private final BeerRepository beerRepository;
    private final FileUploadService fileUploadService;

    public List<Beer> find() {
        return beerRepository.findAll();
    }

    public void save(final BeerRequest request) {
        final String urlImage = fileUploadService.execute(request.getImage());

        final Beer beer = Beer.builder()
            .name(request.getName())
            .content(request.getContent())
            .type(BeerType.from(request.getType()))
            .value(request.getValue())
            .urlImage(urlImage)
            .build();

        beerRepository.save(beer);
    }
}
