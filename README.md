# Conversor de Moneda DEGs

## Descripción
Este proyecto es un conversor de moneda simple pero efectivo, desarrollado en Java. Permite a los usuarios convertir entre diferentes monedas latinoamericanas y el dólar estadounidense, utilizando tasas de cambio en tiempo real obtenidas a través de la API de ExchangeRate.

## Características
- Conversión entre las siguientes monedas:
  - Dólar estadounidense (USD)
  - Peso argentino (ARS)
  - Real brasileño (BRL)
  - Peso colombiano (COP)
- Interfaz de línea de comandos amigable en español
- Utiliza datos de conversión en tiempo real
- Manejo de errores para entradas de usuario inválidas

## Requisitos
- Java JDK 17 o superior
- Conexión a Internet (para acceder a la API de tasas de cambio)

## Uso
1. Ejecuta el programa.
2. Sigue las instrucciones en pantalla para seleccionar el tipo de conversión y el monto.

## Estructura del Proyecto
- `Principal.java`: Clase principal que maneja la interfaz de usuario y el flujo del programa.
- `ConsultaCambio.java`: Realiza las solicitudes a la API de tasas de cambio.
- `Moneda.java`: Clase record para almacenar el resultado de la conversión.

## Dependencias
- [gson 2.10.1](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1) : Para el manejo de JSON.

## API Utilizada
Este proyecto utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/docs/java-currency-api) para obtener las tasas de cambio actualizadas.

## Contacto
[Owen Guerrero] - [guerrerofranklinowen@gmail.com]


