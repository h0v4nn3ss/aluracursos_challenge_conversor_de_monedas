package main.java.com.aluracursos.conversor.app;

import main.java.com.aluracursos.conversor.api.ApiCliente;
import main.java.com.aluracursos.conversor.api.ApiClienteLimitado;
import main.java.com.aluracursos.conversor.exceptions.TasaNoDisponibleException;
import main.java.com.aluracursos.conversor.io.EntradaUsuario;
import main.java.com.aluracursos.conversor.model.ParMonedas;
import main.java.com.aluracursos.conversor.service.Conversor;
import main.java.com.aluracursos.conversor.ui.Menu;

public class ConversorApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ApiCliente api = new ApiClienteLimitado("b514d01d179d3158781e2a11");
        Conversor conversor = new Conversor(api);

        try (EntradaUsuario entrada = new EntradaUsuario()) {
            int opcion;
            do {
                menu.mostrar();
                opcion = entrada.leerOpcion();

                if (opcion == 0) {
                    System.out.println("👋 Programa finalizado.");
                    break;
                }

                ParMonedas par = menu.parDesdeOpcion(opcion);
                if (par == null) {
                    System.out.println("⚠️ Opción inválida. Intenta nuevamente.");
                    continue;
                }

                double monto = entrada.leerMonto();
                try {
                    double resultado = conversor.convertir(par, monto);
                    System.out.printf("💱 %s %s => %s %s | %.2f => %.2f%n",
                            par.origen().nombre(), par.origen().emoji(),
                            par.destino().nombre(), par.destino().emoji(),
                            monto, resultado);
                } catch (TasaNoDisponibleException e) {
                    System.out.println("⚠️ No se pudo obtener la tasa: " + e.getMessage());
                }

            } while (true);
        }
    }
}
