package main.java.com.aluracursos.conversor.ui;

import main.java.com.aluracursos.conversor.model.Moneda;
import main.java.com.aluracursos.conversor.model.ParMonedas;

public class Menu {

    public void mostrar() {
        System.out.println("""
            \n*********************************************
            Sea bienvenido/a al conversor de monedas =]
            1) Dólar 🇺🇸 =>> Peso Argentino 🇦🇷
            2) Peso Argentino 🇦🇷 =>> Dólar 🇺🇸
            3) Dólar 🇺🇸 =>> Real Brasileño 🇧🇷
            4) Real Brasileño 🇧🇷 =>> Dólar 🇺🇸
            5) Dólar 🇺🇸 =>> Peso Colombiano 🇨🇴
            6) Peso Colombiano 🇨🇴 =>> Dólar 🇺🇸
            0) Salir
            **********************************************
            """);
    }

    public ParMonedas parDesdeOpcion(int opcion) {
        return switch (opcion) {
            case 1 -> ParMonedas.of(Moneda.USD, Moneda.ARS);
            case 2 -> ParMonedas.of(Moneda.ARS, Moneda.USD);
            case 3 -> ParMonedas.of(Moneda.USD, Moneda.BRL);
            case 4 -> ParMonedas.of(Moneda.BRL, Moneda.USD);
            case 5 -> ParMonedas.of(Moneda.USD, Moneda.COP);
            case 6 -> ParMonedas.of(Moneda.COP, Moneda.USD);
            default -> null; // opción inválida o 0 (salir)
        };
    }
}
