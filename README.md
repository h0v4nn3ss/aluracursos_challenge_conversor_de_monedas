# Conversor de Monedas 💱

Aplicación en **Java** que permite convertir entre distintas monedas usando la API [ExchangeRate-API](https://www.exchangerate-api.com/).  
Proyecto desarrollado como parte del *Challenge Conversor de Monedas*.

---

## 🚀 Características
- Conversión en tiempo real entre:
  - USD 🇺🇸 ↔ ARS 🇦🇷
  - USD 🇺🇸 ↔ BRL 🇧🇷
  - USD 🇺🇸 ↔ COP 🇨🇴
- Menú interactivo en consola.
- Validación de entradas y manejo de excepciones.
- Arquitectura modular con paquetes (`model`, `api`, `exceptions`, `io`, `ui`, `service`, `app`).

---

## 📂 Estructura del proyecto

src/main/java/com/conversor/ ├── model        # Moneda, ParMonedas ├── api          # ApiCliente, ApiClienteMock, ApiClienteLimitado ├── exceptions   # ParNoSoportadoException, TasaNoDisponibleException ├── io           # EntradaUsuario ├── ui           # Menu ├── service      # Conversor └── app          # ConversorApp (main)


---

## ⚙️ Configuración
1. Clona el repositorio:
   ```bash
   git clone git@github.com:h0v4nn3ss/aluracursos_challenge_conversor_de_monedas.git
   cd aluracursos_challenge_conversor_de_monedas

Compila el proyecto (ejemplo con Maven):

mvn clean install

Configura tu API Key de ExchangeRate-API:

Regístrate y copia tu API key.

Reemplaza "TU_API_KEY_AQUI" en ConversorApp.java por tu clave real.

▶️ Ejecución

Ejecuta el main:

mvn exec:java -Dexec.mainClass="com.conversor.app.ConversorApp"

Ejemplo de salida:

*********************************************
Sea bienvenido/a al conversor de monedas =]
1) Dólar 🇺🇸 => Peso Argentino 🇦🇷
...
0) Salir
**********************************************
Elija una opción válida (0-6): 1
Ingresa el valor que deseas convertir: 10
💱 Dólar 🇺🇸 => Peso Argentino 🇦🇷 | 10.00 => 10000.00

🧪 Pruebas

Las pruebas rápidas (PruebaMoneda, PruebaParMonedas, etc.) están archivadas en src/test/java/com/conversor/pruebas.En proyectos reales se recomienda usar JUnit para pruebas unitarias.

📜 Licencia

Este proyecto se distribuye bajo la licencia MIT.Puedes usarlo, modificarlo y compartirlo libremente.
