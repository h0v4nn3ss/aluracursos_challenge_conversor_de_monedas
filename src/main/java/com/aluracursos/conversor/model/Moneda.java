package main.java.com.aluracursos.conversor.model;

public enum Moneda {
    USD("Dólar", "🇺🇸"),
    ARS("Peso Argentino", "🇦🇷"),
    BRL("Real Brasileño", "🇧🇷"),
    COP("Peso Colombiano", "🇨🇴");

    private final String nombre;
    private final String emoji;

    Moneda(String nombre, String emoji) {
        this.nombre = nombre;
        this.emoji = emoji;
    }

    public String nombre() { return nombre; }
    public String emoji() { return emoji; }
}
