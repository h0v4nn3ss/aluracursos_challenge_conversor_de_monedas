package test.java.com.aluracursos.conversor.pruebas;

import main.java.com.aluracursos.conversor.io.EntradaUsuario;

public class PruebaEntradaUsuario {
    public static void main(String[] args) {
        try (EntradaUsuario entrada = new EntradaUsuario()) {
            int opcion = entrada.leerOpcion();
            double monto = entrada.leerMonto();

            System.out.println("✅ Opción ingresada: " + opcion);
            System.out.println("✅ Monto ingresado: " + monto);
        }
    }
}
