# El Objetivo de la Práctica
El objetivo fue desarrollar un microservicio funcional utilizando el ecosistema de Spring Boot y aplicar las mejores prácticas de la industria para su empaquetado y distribución mediante contenedores, asegurando que la aplicación sea portátil y fácil de desplegar en cualquier entorno.

# Desarrollo de la Aplicación (Spring Boot)
Tecnologías: Utilicé Spring Boot 3 (o la versión que usaste) con la dependencia de Spring Web.

Arquitectura: Implementé un Controller RESTful mediante la anotación @RestController.

Funcionalidad: Creé un endpoint de tipo GET (/saludo) que retorna una cadena de texto con mi información personal y mis expectativas de aprendizaje para esta práctica.

# Control de Versiones (Git & GitHub)
Integré el proyecto con Git para gestionar el historial de cambios.

Subí el código a un repositorio en GitHub, lo cual facilita la colaboración y sirve como el 'almacén' central del código fuente (Source of Truth).

# Dockerización (El "Corazón" de la Portabilidad)

Escribí un archivo de configuración (Dockerfile) basado en una imagen de Java (Eclipse Temurin). Este archivo define cómo se debe construir el entorno de ejecución.
La ventaja de este paso es que la aplicación no depende de si el servidor tiene instalado Java o Maven; todo lo necesario vive dentro del contenedor.

Generé una imagen ligera que empaqueta el archivo .jar de Spring Boot.

# Distribución y Ejecución (Docker Hub)
Publiqué la imagen final en Docker Hub. Esto permite que cualquier persona (o servidor) pueda descargarla y ejecutarla con un solo comando (docker pull), garantizando que la aplicación funcionará exactamente igual en mi computadora que en cualquier otra.

Al ejecutar el contenedor, realicé un mapeo de puertos (ej. de 8081 a 8080) para permitir que el tráfico desde mi máquina local llegue al servidor interno de la aplicación.
