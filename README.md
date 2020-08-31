Obtener headers del objeto request

se uso la siguiente configuracion
java ->  java version "1.8.0_261"
maven -> Apache Maven 3.6.3
OS -> Windows 10

Se uso la herramienta Swagger para documentar la aplicación

El codigo esta disponible en GitHub

Pasos para ejecutar la aplicacion
a) Clonar el repositorio a tu maquina local.
b) Compilar el proyecto: mvn clean compile
c) Ejecutar el proyecto: mvn spring-boot:run

Utilizando el navegador de su preferencia, ir a la siguiente URL:
http://localhost:8080/swagger-ui.html

Una vez dentro de la pagina, realizar lo siguiente:
Para obtener todos los headers, ejecutar la siguiente liga:
/getAllHeaders (no se requiere capturar ningun valor en el campo)

Para Obtener solo los headers que se requieren, ejecutar la siguiente liga y proporcionar las llaves de los headers requeridos.
/getHeadersByKey

Nota: El puerto esta configurado en el archivo application.properties, que se encuentra en la carpeta de resources, en caso
de requerir un puerto diferente, se tiene que cambiar el puerto en el archivo mencionado
http://localhost:<<nuevo_puerto>>/swagger-ui.html