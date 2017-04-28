## Casos de pruebas para LinkdIn.com

@tag0
Feature: Proceso de Login	

@tag1
Scenario Outline: Loguearse y realizar la busqueda de algun contacto de la red y visualizar su perfil
Given Usuario esta en el Home Page
When Usuario ingresa "<username>" y "<password>" validos
Then Se despliega el mensaje: Login y Ver Perfil Exitoso

Examples:
    | username  						| password			|
    | felipe.anic@gmail.com | ZoSi3251. |

@tag1
Scenario Outline: Loguearse con un usuario no registrado
Given Usuario esta en el Home Page
When Usuario ingresa "<username>" y "<password>" no validos
Then Se despliega el mensaje: Login no exitoso

Examples:
    | username  						| password			|
    | usuarioNoValido 			| 123						|

