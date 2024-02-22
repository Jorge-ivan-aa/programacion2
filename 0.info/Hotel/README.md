# Principios SOLID: Hotel

Taller sobre pincipios SOLID aplicados en el 
contexto de un Hotel.


## Principio de Responsabilidad Única (SRP):

### Cumplimiento:
Las clase ServicioHabitacion tiene la responsabilidad unica
de ofrecer servicios a la habitacion del cliente y ServicioSpa
de la responsabilidad de ofrecer servicios de spa.

### Incumplimiento:
Si la clase ServicioHabitacion se encargara tambien de, por ejemplo,
ofrecer servicios de spa o de bar, estaria teniendo más responsabilidades
que no encajan en su definicion de clase.


## Principio de Abierto/Cerrado (OCP):

### Cumplimiento:
La clase abstracta Servicio sirve como base para cualquier tipo
de servicio que se ofrezca en el Hotel sin tener que ser modificada,
es decir, está abierta a la extención pero cerrada a la modificación.

### Incumplimiento:
Escribir todos los servicios en la clase Servicio y hacer que sea
implementable, lo que complicaria el mantenimiento en el caso de
que hubiera error en alguno de sus servicios.


## Principio de Sustitución de Liskov (LSP):

### Cumplimiento:
La clase Habitacion requiere de una lista de servicios de
tipo Servicio, lo que implica que toda clase derivada de la
clase Servicio puede utilizarse en la clase Habitacion, o sea,
las sub clases pueden sustituirse por la clase base sin que
exista ninguna alteracion en el programa.

### Incumplimiento:
Si yo requiero una lista de servicios tipo Servicio, pero
la subclase de Servicio tiene alguna modificación que altera
la ejecucion del programa, como por ejemplo: sobre-escribir
el tipo de dato que retorna un metodo heredado.


## Principio de Segregación de Interfaces (ISP):

### Cumplimiento:
Se tiene la interfaz Consumible que provee un metodo concreto que se
puede implementar en cualquier clase que lo requiera.

### Incumplimiento:
Si la interfaz Consumible tuviera más metodos tendria que usarlos
obligatoriamente en la clase en donde se implementó Consumible,
incluso cuando muchos de estos no los requiera la clase.


## Principio de Inversión de Dependencias (DIP):

### Cumplimiento:
La clase Habitacion requiere la clase abstracta Servicio, y no 
de subclases como ServicioSpa, lo que permite incluir facilmente
nuevos tipos de servicios. 

### Incumplimiento:
si Habitacion requiere de una clase ServicioHabitacion limitaria
los tipos de servicios que puede abmitir, lo que obligaria
constantemente a modificar la clase ServicioHabitacion si se necesitaran
otros tipos de servicio, haciendolo dificil de mantener.

