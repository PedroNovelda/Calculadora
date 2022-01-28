# Calculadora

Microservicio Calculadora utilizando Spring Boot y Maven.

Desarrollado siguiendo el patrón de diseño Strategy, contiene las operaciones básicas de suma, resta, multiplicación y división. Integra además la librería local `Tracer`.

Comunicación a través de API REST (`GET /api/calculadora?numero1=5&numero2=3&operador=resta`)



## Pasos a Seguir

Necesario disponer de la ultima versión de Maven instalada. Tambien hace falta tener JAVA instalado en el sistema.

A través de una consola:

1. Descargar el repositorio girhub

```
git clone https://github.com/PedroNovelda/Calculadora
cd Calculadora
```

2. Ejecutar verificación e instalación de Maven

```
mvn validate
mvn verify
mvn clean install
```

3. Ejecutar el JAR de la carpeta /target


```
java -jar target/calculadora-0.0.1-SNAPSHOT.jar
```


## API REST

Con los pasos anteriores debemos tener una API REST escuchando en `http://localhost:8080/api/calculadora`

Se pueden realizar consultas con los parámetros siguientes:

- `numero1` Primer numero de la operación

- `numero2` Segundo numero de la operación

- `operador` Operación a realizar (Valores aceptados: `suma`, `resta`, `multiplicacion`, `division`)

Por ejemplo:

`http://localhost:8080/api/calculadora?numero1=2&numero2=3&operador=suma`

El resultado será un valor numerico con decimales, en este caso ( 2 + 3 = `5.0` )

