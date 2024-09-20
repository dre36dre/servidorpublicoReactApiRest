package com.dre.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dre.cardapio.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
