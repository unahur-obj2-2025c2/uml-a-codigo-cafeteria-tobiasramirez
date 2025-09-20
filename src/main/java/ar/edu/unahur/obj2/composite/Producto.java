package ar.edu.unahur.obj2.composite;

public class Producto implements Consumible {
    protected String nombre;
    protected Double precioBase;

    @Override
    public Double costo(){
        return precioBase;
    }

    public Producto(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
}
