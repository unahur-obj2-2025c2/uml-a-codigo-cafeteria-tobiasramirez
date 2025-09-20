package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.composite.*;

public class Combo implements Consumible {
    private String nombre;
    private Double precio;
    List<Consumible> consumibles = new ArrayList<>();
    public Combo(String nombre, Double precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = new ArrayList<>();
    }
    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void agregarConsumible(Consumible consumible){
        consumibles.add(consumible);
    }
    public void eliminarConsumible(Consumible consumible){
        consumibles.remove(consumible);
    }
    @Override
    public Double costo() {
        return Double.min(precio,this.sumaPrecioConsumibles());
    }
    private Double sumaPrecioConsumibles(){
        return consumibles.stream().mapToDouble(Consumible::costo).sum();
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public List<Consumible> getConsumibles() {
        return consumibles;
    }
    
    
}
