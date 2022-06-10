
package com.ApiRestaurant.controller;

import com.ApiRestaurant.model.PlatoMenu;
import com.ApiRestaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    
    @Autowired
    private MenuService servimenu;
    
    @GetMapping("")
    public String inicio(){
        return "Inicio ";
    }
    @PostMapping("menu/crear")
    public String GuardarMenu(@RequestBody PlatoMenu menuplato ){
        servimenu.guardarMenu(menuplato);
        return "El menu se guardo correctamente";
    }
    @GetMapping("plato/{numero}")
    public PlatoMenu menu(@PathVariable Long numero){
        
        PlatoMenu plato=servimenu.encontrarMenu(numero);
        return plato;
    }
}
