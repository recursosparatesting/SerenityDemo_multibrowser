# SerenityDemo_multibrowser
Este repositorio contiene una prueba UI para el sitio ORANGE HRM Demo, el cual realiza el Login y verifica que haya ingresado a la pagina principal. 
El caso de prueba esta expresado en Gherkin y la ATM desarrolada los siguientes frameworks:
* Cucumber
* Serenity Bdd
* JUnit

La configuracion permite elegir la ejecucion en tres navegadores: google chrome, Firefox y Edge. Utiliza Selenium Manager para auto descargar el driver de cada navegado automaticamente.


## 📋 Requisitos
* Java 17
* Gradle 9

## 🚀 Pipeline de Ejecucion en GibhubActions
El pipeline descarga google chrome y Edge en sus versiones mas recientes y estables, asumiendo que la distribucion de linux ya se instala con Firefox.
En el comando de ejecucion, se le indica cual es el navegador elegido para la prueba.
Despues de ejecutar el robot, carga el reporte de Serenity BDD, Live Documentation, y lo deja disponible para su descarga.

En este pipeline, la ATM corre en sistema operativo Ubuntu Ultima version disponible. Sin embargo, podria usarse en entornos windows o cualquier otra distribucion Linux.


