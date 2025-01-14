package com.example.springframework.mssc_brewery.service;

import java.util.UUID;

import com.example.springframework.mssc_brewery.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import com.example.springframework.mssc_brewery.web.model.BeerDto;
@Service
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID()).beerName("beerName").beerStyle(BeerStyleEnum.ALE).build();
	}

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build() ;

}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		// TODO Auto-generated method stub
		
	}
}