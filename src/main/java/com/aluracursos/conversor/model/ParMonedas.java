package main.java.com.aluracursos.conversor.model;

import main.java.com.aluracursos.conversor.exceptions.ParNoSoportadoException;

import java.util.Set;

public final class ParMonedas {
    private final Moneda origen;
    private final Moneda destino;

    // Lista fija de pares permitidos (los 6 del menú)
    private static final Set<String> paresPermitidos = Set.of(
            "USD-ARS", "ARS-USD",
            "USD-BRL", "BRL-USD",
            "USD-COP", "COP-USD"
    );

    private ParMonedas(Moneda origen, Moneda destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public static ParMonedas of(Moneda origen, Moneda destino) {
        String clave = origen.name() + "-" + destino.name();
        if (!paresPermitidos.contains(clave)) {
            throw new ParNoSoportadoException("Par no soportado: " + clave);
        }
        return new ParMonedas(origen, destino);
    }

    public Moneda origen() { return origen; }
    public Moneda destino() { return destino; }

    @Override
    public String toString() {
        return origen.name() + " -> " + destino.name();
    }
}
