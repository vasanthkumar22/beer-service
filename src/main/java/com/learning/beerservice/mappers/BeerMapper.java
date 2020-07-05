package com.learning.beerservice.mappers;

import com.learning.beerservice.domain.Beer;
import com.learning.beerservice.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
