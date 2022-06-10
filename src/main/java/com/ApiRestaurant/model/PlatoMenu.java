
package com.ApiRestaurant.model;

import lombok.Data;

@Data
public class PlatoMenu {
    private Long id;
    private String nombre;
    private int precio;
    private String descripcion;

    public PlatoMenu() {
    }

    public PlatoMenu(Long id, String nombre, int precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        
    }
}
