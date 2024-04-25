# API de Conversión de Temperatura

Este proyecto es una API REST desarrollada en Java utilizando Spring Boot. Proporciona servicios para realizar conversiones de temperatura entre grados Celsius, Fahrenheit y Kelvin.

## API Endpoints

### Convertir grados Fahrenheit a grados Celsius

```http
  GET /grade/fahrenheitToCelcius/{fahrenheit}
```

| Parámetro  | Tipo     | Descripción                   |
| :--------- | :------- | :---------------------------- |
| `fahrenheit` | `double` | **Requerido**. Valor en grados Fahrenheit |

#### Ejemplo de uso

```http
  GET http://localhost:8080/grade/fahrenheitToCelcius/77
```

#### Respuesta esperada

```
25.0
```

### Convertir grados Fahrenheit a grados Kelvin

```http
  GET /grade/fahrenheitToKelvin/{fahrenheit}
```

| Parámetro  | Tipo     | Descripción                   |
| :--------- | :------- | :---------------------------- |
| `fahrenheit` | `double` | **Requerido**. Valor en grados Fahrenheit |

#### Ejemplo de uso

```http
  GET http://localhost:8080/grade/fahrenheitToKelvin/77
```

#### Respuesta esperada

```
298.15
```

### Convertir grados Kelvin a grados Celsius

```http
  GET /grade/kelvinToCelsius/{kelvin}
```

| Parámetro  | Tipo     | Descripción                   |
| :--------- | :------- | :---------------------------- |
| `kelvin` | `double` | **Requerido**. Valor en grados Kelvin |

#### Ejemplo de uso

```http
  GET http://localhost:8080/grade/kelvinToCelsius/298.15
```

#### Respuesta esperada

```
25.0
```

### Convertir grados Kelvin a grados Fahrenheit

```http
  GET /grade/kelvinToFahrenheit/{kelvin}
```

| Parámetro  | Tipo     | Descripción                   |
| :--------- | :------- | :---------------------------- |
| `kelvin` | `double` | **Requerido**. Valor en grados Kelvin |

#### Ejemplo de uso

```http
  GET http://localhost:8080/grade/kelvinToFahrenheit/298.15
```

#### Respuesta esperada

```
77.0
```

## Uso

Para utilizar esta API, asegúrate de tener el servidor en ejecución. Puedes ejecutarlo localmente o en un servidor en la nube accesible públicamente. Una vez que el servidor esté en funcionamiento, puedes hacer solicitudes a los endpoints utilizando herramientas como Postman, CURL o navegadores web.

## Ejecución

Para ejecutar el servidor localmente, asegúrate de tener Java y Maven instalados en tu sistema. Luego, clona este repositorio y ejecuta el siguiente comando en la raíz del proyecto:

```
mvn spring-boot:run
```

El servidor se iniciará en `http://localhost:8080` por defecto.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes una mejora, por favor crea un _pull request_ detallando los cambios propuestos.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
