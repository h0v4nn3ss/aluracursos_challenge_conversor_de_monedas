package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.model.ParMonedas;
import main.java.com.aluracursos.conversor.ui.Menu;

public class PruebaMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrar();

        // Simulamos opciones válidas
        ParMonedas par1 = menu.parDesdeOpcion(1);
        System.out.println("Opción 1: " + par1);

        ParMonedas par5 = menu.parDesdeOpcion(5);
        System.out.println("Opción 5: " + par5);

        // Simulamos opción inválida
        ParMonedas parInvalido = menu.parDesdeOpcion(9);
        System.out.println("Opción 9: " + parInvalido);
    }
}
