package main.java.com.aluracursos.conversor.api;

import main.java.com.aluracursos.conversor.exceptions.TasaNoDisponibleException;
import main.java.com.aluracursos.conversor.model.Moneda;

public interface ApiCliente {
    /**
     * Obtiene la tasa de cambio en tiempo real entre dos monedas.
     *
     * @param origen  main.java.com.aluracursos.conversor.model.Moneda de origen
     * @param destino main.java.com.aluracursos.conversor.model.Moneda de destino
     * @return tasa de cambio (ejemplo: 1 USD = X destino)
     * @throws TasaNoDisponibleException si el API no devuelve datos válidos
     */
    double obtenerTasa(Moneda origen, Moneda destino) throws TasaNoDisponibleException;
}
