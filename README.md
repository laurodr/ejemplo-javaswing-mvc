# README #

### Ejemplo Java Swing MVC ###

* Ejemplo sencillo de uso del patrón [MVC](https://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador) en una aplicación de Java Swing.
* La aplicación consiste en una pantalla inicial en la que se pide un nombre y una contraseña, los cuales serán guardados en la base de datos y posteriormente mostrados en otra ventana. 
* Hecho con Netbeans 8.2. 
* Version 1.0
* [holandesfrito](https://github.com/laurodr/)

### Cómo ejecutar la aplicación ###

* Primero descarga Netbeans [aquí](https://netbeans.org/downloads/). 
* Copiar el proyecto en la carpeta de proyectos de Netbeans. 
* En Netbeans seleccionar: Archivo -> Abrir Proyecto, y seleccionar el proyecto.
* Añadir derbyclient.jar en la carpeta Libraries: Botón derecho -> Properties -> Add JAR/Folder.
+ Crear Base de Datos desde la pestaña Services: Java DB -> Create Database
	* Database Name: HelloWorldDB
	* User Name: root
	* Password: root

* Crear tabla USUARIO en la base de datos

```
CREATE TABLE USUARIO (
   "USERNAME" VARCHAR(100) not null primary key,
    "PASSWORD" VARCHAR(60) not null unique
);
```
