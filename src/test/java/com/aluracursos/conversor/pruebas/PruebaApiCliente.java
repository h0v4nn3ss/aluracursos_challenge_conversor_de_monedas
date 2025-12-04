package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.api.ApiCliente;
import main.java.com.aluracursos.conversor.api.ApiClienteMock;
import main.java.com.aluracursos.conversor.model.Moneda;

public class PruebaApiCliente {
    public static void main(String[] args) {
        ApiCliente api = new ApiClienteMock();
        double tasa = api.obtenerTasa(Moneda.USD, Moneda.ARS);
        System.out.println("Tasa USD->ARS: " + tasa);
    }
}
