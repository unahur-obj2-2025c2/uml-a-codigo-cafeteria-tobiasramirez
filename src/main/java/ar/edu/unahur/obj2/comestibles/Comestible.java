package ar.edu.unahur.obj2.comestibles;

import ar.edu.unahur.obj2.composite.*;

public abstract class Comestible extends Producto {
    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }
    @Override
    public Double costo(){
        return pesoGr * this.doCosto();

    }
    public abstract Double doCosto();
    
}
