package com.micromike.msscbrewery.services;

import com.micromike.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface BeerService{
        BeerDto getBeerById(UUID beerId);
        BeerDto saveNewBeer(BeerDto beerDto);
        void updateBeer(UUID beerId, BeerDto beerDto);
        void deleteById(UUID beerId);
}
