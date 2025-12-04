package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.model.Moneda;

public class PruebaMoneda {
    public static void main(String[] args) {
        for (Moneda m : Moneda.values()) {
            System.out.println(m.name() + " -> " + m.nombre() + " " + m.emoji());
        }
    }
}
