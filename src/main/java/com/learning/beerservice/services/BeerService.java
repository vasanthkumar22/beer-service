package com.learning.beerservice.services;

import com.learning.beerservice.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    //BeerPageList listBeers(String beerName, BeerStyleEnum beerStyleEnum, PageRequest pageRequest, Boolean showInventoryOnHand);
    BeerDto getById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);
    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
