package ar.edu.unahur.obj2.bebibles;

import ar.edu.unahur.obj2.composite.Producto;

public abstract class Bebible extends Producto {
    protected Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }
    
    
}
