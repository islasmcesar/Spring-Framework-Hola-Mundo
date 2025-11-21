# Hola Mundo con Spring Framework.

Este proyecto representa un primer acercamiento a Spring Framework, implementando el clasico ¡Hola Mundo!, en este proyecto se utilizo Java como lenguaje de programacion.

---
## Descripcion
El proyecto sigue la siguiente estructura
```text
spring-beginner-project
├── src
│   ├── main
│   │   ├── java/com/cim
│   │   │   ├── App.java
│   │   │   ├── AppConfig.java
│   │   │   └── HelloWorld.java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
└── pom.xml
```
El archivo AppConfig.java contiene la implementacion de una clase de configuracion con la annotacion @Configuration de Spring, en esta clase se implementa un metodo, con la anotacion @Bean, que devuelve un objeto que sera gestionado por el contenedor de Spring como un Bean.

La clase en HelloWorld.java representa la implementacion de un Bean, y define un metodo que imprime ¡Hola Mundo! en la consola

La clase App.java contiene el metodo main de la aplicacion, esta instancia el Spring application context y retorna un bean que se utiliza para imprimir ¡Hola Mundo! en la consola.

---
## Instrucciones de Uso
Para ejecutar esta aplicacion es necesario tener instalado Java y la variable de entorno JAVA_HOME definida, se recomienda la version 17 del JDK o superior.

Despues de clonar el proyecto, abre una terminal en la ruta donde se encuantra el proyecto en tu dispositivo y ejecuta los siguientes comando:
```text
mvnw compile
mvn exec:java -Dexec.mainClass="com.example.MainApp"
```

En el caso de usarn power shell de windows se debe ejecutar el siguiente comando en lugar de los anteriores
```text
mvn compile
mvn exec:java -D exec.mainClass="com.example.MainApp"
```

---

## Licencia
Este proyecto está licenciado bajo la Licencia [MIT] - mira el archivo LICENSE.txt para detalles.

---
