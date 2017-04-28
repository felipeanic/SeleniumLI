A. Descripción
==============
Se desarrollo una automatización para ejecutar algunos escenarios como login válido y no válido en los browsers Chrome e IE.

Parte 1:
- Requerimiento:
Definir los casos de prueba de la funcionalidad Login, y entregarlos en un archivo de texto con enfoque BDD utilizando el lenguaje Gherkin.

- Solución:
Los casos de prueba están en la ruta "LinkedIn_project\parte1\Parte1_FuncionalidadLogin.txt"


Parte 2:
- Requerimiento:
Se debe utilizar: Editor de Texto o Eclipse como IDE, en cuanto a las especificaciones técnicas Cucumber, Selenium Web Driver y Java. No se debe solicitar ingresos de datos por parte de usuarios, todo debe ser automático. El proyecto debe ser entregado en Github.
Se deben automatizar los siguientes escenarios:
Escenario 1: Loguearse y realizar la búsqueda de algún contacto de tu red y visualizar su perfil.
Escenario 2: Loguearse con un usuario no registrado.
Se deben implementar las configuraciones necesarias para que el proyecto soporte Chrome e Internet Explorer como navegadores.

- Solución:
La solución está en la ruta "LinkedIn_project\"


B. Detalle
==========
Se utilizaron varias técnicas para darle robustez al diseño, tales como:

- Data Driven Testing: Para el ingreso de Test Data usando Scenario Outline.
- waitForVisibility: Para esperar que esté visible el objeto.
- CrossBrowser: Se implemento una clase para administrar a nivel sencilla la selección del driver del browser para ejecución.
- Logger: Para regitrar a nivel de consola y archivo los hitos de la ejecución y posibles errores.
- Exceptions: Fueron referenciadas usando throws, para el seguimiento y es posible implementarlo con más detalle si el proyecto lo requiere. Además se puede complementar con el Logger.
- Entre otras.

 Dado que es un proyecto pequeño no se utilizó el modelo PageObject, pero si fuese algo escalable es recomendable hacerlo para simplificar el código y las llamadas a métodos como findElement.


C. Ejecución
============
Para la ejecución es necesario ejecutar el archivo "TestRunner.java", pero previamente es necesario setear algunos parámetros:

- Se debe setear el browser con el cual se ejecutarán las pruebas. Para ello editar el archivo "LinkedIn_project\src\stepDefinition\TestSteps.java" y modificar la variable "browserFlag". Los posibles valores son: 1 para Chrome; 2 para IE.
- Los datos de pruebas. Para ello, editar el archivo "LinkedIn_project\Feature\Login.feature" e ingresar la data en la sección "Examples:" para cada escenario de prueba.

D. Tecnologías
==============
Proyecto de Automatización usando las siguientes tecnologías y plataformas:

- Eclipse IDE
- Java
- Selenium WebDriver
- Cucumber (Gherkins)


E. Librerías
============
Las librerías JAR están disponibles en la siguiente Ruta. Se utilizó Selenium WebDriver, Cucumber, JUnit y  Apache log4j

- LinkedIn_project\extras\JARs


F. Drivers
==========
Los drivers para manejar los browser están disponibles en la siguiente ruta, los que incluyen: Chrome e IE.

- LinkedIn_project\extras\drivers


G. Logger
=========
El proyecto incluye un logger basado en Apache log4j, para output a través de consola y además deja un archivo acumulativo en el log ubicado en la siguiente ruta:

- LinkedIn_project\log\log.log

Además se incluye un archivo de configuración para el logger ubicado en:

- LinkedIn_project\src\main\resources\log4j2.xml
