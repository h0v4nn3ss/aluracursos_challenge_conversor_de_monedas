package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.model.Moneda;
import main.java.com.aluracursos.conversor.model.ParMonedas;

public class PruebaParMonedas {
    public static void main(String[] args) {
        // Par válido
        ParMonedas par1 = ParMonedas.of(Moneda.USD, Moneda.ARS);
        System.out.println("Par válido: " + par1);

        // Par inválido (ejemplo USD -> COP es válido, pero USD -> BRL también; probemos uno no permitido)
        try {
            ParMonedas par2 = ParMonedas.of(Moneda.ARS, Moneda.BRL);
            System.out.println("Par inválido: " + par2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
