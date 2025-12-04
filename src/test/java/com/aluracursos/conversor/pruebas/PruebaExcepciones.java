package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.exceptions.ParNoSoportadoException;
import main.java.com.aluracursos.conversor.model.Moneda;
import main.java.com.aluracursos.conversor.model.ParMonedas;

public class PruebaExcepciones {
    public static void main(String[] args) {
        try {
            ParMonedas par = ParMonedas.of(Moneda.ARS, Moneda.BRL);
            System.out.println("Par válido: " + par);
        } catch (ParNoSoportadoException e) {
            System.out.println("⚠️ Error capturado: " + e.getMessage());
        }
    }
}
