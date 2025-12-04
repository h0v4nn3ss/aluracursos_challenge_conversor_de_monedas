package main.java.com.aluracursos.conversor.service;

import main.java.com.aluracursos.conversor.api.ApiCliente;
import main.java.com.aluracursos.conversor.model.ParMonedas;

public class Conversor {
    private final ApiCliente apiCliente;

    public Conversor(ApiCliente apiCliente) {
        this.apiCliente = apiCliente;
    }

    /**
     * Convierte un monto entre dos monedas usando la tasa en tiempo real.
     *
     * @param par   Par de monedas (origen, destino)
     * @param monto Monto a convertir
     * @return resultado de la conversión
     */
    public double convertir(ParMonedas par, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero.");
        }
        double tasa = apiCliente.obtenerTasa(par.origen(), par.destino());
        return monto * tasa;
    }
}
