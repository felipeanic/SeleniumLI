A. Descripci�n
==============
Se desarrollo una automatizaci�n para ejecutar algunos escenarios como login v�lido y no v�lido en los browsers Chrome e IE.

Parte 1:
- Requerimiento:
Definir los casos de prueba de la funcionalidad Login, y entregarlos en un archivo de texto con enfoque BDD utilizando el lenguaje Gherkin.

- Soluci�n:
Los casos de prueba est�n en la ruta "LinkedIn_project\parte1\Parte1_FuncionalidadLogin.txt"


Parte 2:
- Requerimiento:
Se debe utilizar: Editor de Texto o Eclipse como IDE, en cuanto a las especificaciones t�cnicas Cucumber, Selenium Web Driver y Java. No se debe solicitar ingresos de datos por parte de usuarios, todo debe ser autom�tico. El proyecto debe ser entregado en Github.
Se deben automatizar los siguientes escenarios:
Escenario 1: Loguearse y realizar la b�squeda de alg�n contacto de tu red y visualizar su perfil.
Escenario 2: Loguearse con un usuario no registrado.
Se deben implementar las configuraciones necesarias para que el proyecto soporte Chrome e Internet Explorer como navegadores.

- Soluci�n:
La soluci�n est� en la ruta "LinkedIn_project\"


B. Detalle
==========
Se utilizaron varias t�cnicas para darle robustez al dise�o, tales como:

- Data Driven Testing: Para el ingreso de Test Data usando Scenario Outline.
- waitForVisibility: Para esperar que est� visible el objeto.
- CrossBrowser: Se implemento una clase para administrar a nivel sencilla la selecci�n del driver del browser para ejecuci�n.
- Logger: Para regitrar a nivel de consola y archivo los hitos de la ejecuci�n y posibles errores.
- Exceptions: Fueron referenciadas usando throws, para el seguimiento y es posible implementarlo con m�s detalle si el proyecto lo requiere. Adem�s se puede complementar con el Logger.
- Entre otras.

 Dado que es un proyecto peque�o no se utiliz� el modelo PageObject, pero si fuese algo escalable es recomendable hacerlo para simplificar el c�digo y las llamadas a m�todos como findElement.


C. Ejecuci�n
============
Para la ejecuci�n es necesario ejecutar el archivo "TestRunner.java", pero previamente es necesario setear algunos par�metros:

- Se debe setear el browser con el cual se ejecutar�n las pruebas. Para ello editar el archivo "LinkedIn_project\src\stepDefinition\TestSteps.java" y modificar la variable "browserFlag". Los posibles valores son: 1 para Chrome; 2 para IE.
- Los datos de pruebas. Para ello, editar el archivo "LinkedIn_project\Feature\Login.feature" e ingresar la data en la secci�n "Examples:" para cada escenario de prueba.

D. Tecnolog�as
==============
Proyecto de Automatizaci�n usando las siguientes tecnolog�as y plataformas:

- Eclipse IDE
- Java
- Selenium WebDriver
- Cucumber (Gherkins)


E. Librer�as
============
Las librer�as JAR est�n disponibles en la siguiente Ruta. Se utiliz� Selenium WebDriver, Cucumber, JUnit y  Apache log4j

- LinkedIn_project\extras\JARs


F. Drivers
==========
Los drivers para manejar los browser est�n disponibles en la siguiente ruta, los que incluyen: Chrome e IE.

- LinkedIn_project\extras\drivers


G. Logger
=========
El proyecto incluye un logger basado en Apache log4j, para output a trav�s de consola y adem�s deja un archivo acumulativo en el log ubicado en la siguiente ruta:

- LinkedIn_project\log\log.log

Adem�s se incluye un archivo de configuraci�n para el logger ubicado en:

- LinkedIn_project\src\main\resources\log4j2.xml
