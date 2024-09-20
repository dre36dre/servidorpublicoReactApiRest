package com.dre.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dre.cardapio.entity.Food;
import com.dre.cardapio.repository.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
	private FoodRepository repository; 
	
	@GetMapping
	public List<Food> findAll() {
		List<Food> result=repository.findAll();
		return result;
	}

}
