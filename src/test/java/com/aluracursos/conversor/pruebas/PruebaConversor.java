package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.api.ApiCliente;
import main.java.com.aluracursos.conversor.api.ApiClienteMock;
import main.java.com.aluracursos.conversor.model.Moneda;
import main.java.com.aluracursos.conversor.model.ParMonedas;
import main.java.com.aluracursos.conversor.service.Conversor;

public class PruebaConversor {
    public static void main(String[] args) {
        ApiCliente api = new ApiClienteMock(); // usamos el mock
        Conversor conversor = new Conversor(api);

        ParMonedas par = ParMonedas.of(Moneda.USD, Moneda.ARS);
        double monto = 10.0;

        double resultado = conversor.convertir(par, monto);
        System.out.println("Convertir " + monto + " " + par.origen().name() +
                " a " + par.destino().name() + " = " + resultado);
    }
}
