package main.java.com.aluracursos.conversor.api;

import main.java.com.aluracursos.conversor.model.Moneda;

public class ApiClienteMock implements ApiCliente {
    @Override
    public double obtenerTasa(Moneda origen, Moneda destino) {
        // Simulamos tasas fijas para probar
        if (origen == Moneda.USD && destino == Moneda.ARS) return 1000.0;
        if (origen == Moneda.ARS && destino == Moneda.USD) return 0.001;
        if (origen == Moneda.USD && destino == Moneda.BRL) return 5.0;
        if (origen == Moneda.BRL && destino == Moneda.USD) return 0.2;
        if (origen == Moneda.USD && destino == Moneda.COP) return 4000.0;
        if (origen == Moneda.COP && destino == Moneda.USD) return 0.00025;

        throw new RuntimeException("Par no soportado en mock");
    }
}
