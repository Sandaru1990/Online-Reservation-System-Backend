/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.example.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanda
 */

@Repository
public interface RestaurantMenuRepository extends JpaRepository<RestaurantMenu, Integer>{

    public List<RestaurantMenu> findAllByMealType(String mealType);

    public List<RestaurantMenu> findByMealType(String mealType);


    
    
}
