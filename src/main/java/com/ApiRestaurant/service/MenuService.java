
package com.ApiRestaurant.service;

import com.ApiRestaurant.model.PlatoMenu;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    
    private List <PlatoMenu> platosmenu = new ArrayList<>();
    
    public void guardarMenu(PlatoMenu menu) {
        platosmenu.add(menu);
    }

   
    public PlatoMenu encontrarMenu(Long id) {
        PlatoMenu menu=new PlatoMenu();
        for (PlatoMenu menuplato : platosmenu) {
            if (menuplato.getId()==id) {
                menu =menuplato;
            }
        }
        return menu;
    
    }
}
