package main.java.com.aluracursos.conversor.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaUsuario implements AutoCloseable {
    private final Scanner scanner = new Scanner(System.in);

    public int leerOpcion() {
        while (true) {
            System.out.print("Elija una opción válida (0-6): ");
            try {
                int opcion = scanner.nextInt();
                if (opcion >= 0 && opcion <= 6) {
                    return opcion;
                } else {
                    System.out.println("⚠️ Opción fuera de rango. Debes ingresar un número entre 0 y 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Entrada inválida. Debes ingresar un número.");
                scanner.nextLine(); // limpiar buffer
            }
        }
    }


    public double leerMonto() {
        while (true) {
            System.out.print("Ingresa el valor que deseas convertir: ");
            try {
                double monto = scanner.nextDouble();
                if (monto <= 0) {
                    System.out.println("⚠️ El monto debe ser mayor que cero.");
                } else {
                    return monto;
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Entrada inválida. Debes ingresar un número decimal.");
                scanner.nextLine(); // limpiar buffer
            }
        }
    }

    @Override
    public void close() {
        scanner.close();
    }
}
