package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.bebibles.Cafe;
import ar.edu.unahur.obj2.comestibles.Medialuna;
import ar.edu.unahur.obj2.comestibles.TipoMedialuna;
import ar.edu.unahur.obj2.composite.Consumible;

public class ComboTest {
    @Test
    void testCosto() {
        Consumible cafe = new Cafe("cafe",150.0,200,Boolean.FALSE);
        Consumible medialuna = new Medialuna("medialuna", 100.0, 200, TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("Desayuno", 1000.0);
        Consumible cambiable = new Combo("Desayuno",10.00);
        cambiable = new Cafe("cafe", 100.0, 200, Boolean.TRUE);

        combo.agregarConsumible(cafe);
        combo.agregarConsumible(medialuna);
        assertEquals(650.0, combo.costo());

    }
    @Test
    void testComboDentroDeCombo(){
        Consumible cafe = new Cafe("cafe",150.0,200,Boolean.FALSE);
        Consumible medialuna = new Medialuna("medialuna", 100.0, 200, TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("Desayuno", 1000.0);
        combo.agregarConsumible(cafe);
        combo.agregarConsumible(medialuna);
        Consumible cambiable = new Combo("Desayuno",10.00);
        cambiable = new Cafe("cafe", 100.0, 200, Boolean.TRUE);
        Consumible medialunaExtra = new Medialuna("medialuna", 100.0, 200, TipoMedialuna.DE_MANTECA);
        List<Consumible> productos = List.of(combo,medialunaExtra);
        Combo superCombo = new Combo("Desayuno con extra medialuna", 2000.0, productos);
        assertEquals(1150.0, superCombo.costo());
    }
}
