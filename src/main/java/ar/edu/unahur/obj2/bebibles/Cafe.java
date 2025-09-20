package ar.edu.unahur.obj2.bebibles;

public class Cafe extends Bebible {
    private Boolean conLeche;

    
    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean conLeche) {
        super(nombre, precioBase, capacidadMl);
        this.conLeche = conLeche;
    }


    @Override
    public Double costo(){
        return super.costo() + (conLeche ? 5.0 : 0.0);
    }
    

}
