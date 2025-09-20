package ar.edu.unahur.obj2.bebibles;

public class JugoNaranja extends Bebible {

    public JugoNaranja(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase, capacidadMl);
        
    }
    @Override 
    public Double costo(){
        return super.costo() * capacidadMl;
    }
}
