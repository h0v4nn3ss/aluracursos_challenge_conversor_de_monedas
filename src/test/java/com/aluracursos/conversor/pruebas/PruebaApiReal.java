package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.api.ApiCliente;
import main.java.com.aluracursos.conversor.api.ApiClienteLimitado;
import main.java.com.aluracursos.conversor.model.Moneda;

public class PruebaApiReal {
    public static void main(String[] args) {
        ApiCliente api = new ApiClienteLimitado("b514d01d179d3158781e2a11");
        double tasa = api.obtenerTasa(Moneda.USD, Moneda.ARS);
        System.out.println("Tasa USD->ARS en tiempo real: " + tasa);
    }
}
