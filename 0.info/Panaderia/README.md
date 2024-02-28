# Principios SOLID: Panaderia

## Realizado por:
- Jorge AA
-  Manuel QZ

### Principio de Responsabilidad Única (SRP):

#### Cumplimiento:
> Las clases como ProductoBebida y ProductoPan tienen la responsabilidad de definir características específicas y únicas de cada tipo de producto. La clase Venta tiene la responsabilidad de gestionar las ventas de productos sin preocuparse por los detalles internos de cada tipo de producto.

#### Incumplimiento:
> Si una clase como Producto tuviera responsabilidades adicionales que no están directamente relacionadas con la representación de un producto (por ejemplo, cálculos de impuestos), estaría violando el SRP.


### Principio de Abierto/Cerrado (OCP):

#### Cumplimiento:
> El sistema permite la extensión de nuevas clases de productos sin modificar el código existente. Por ejemplo, podríamos agregar ProductoPasteleria sin necesidad de modificar la clase Venta.

#### Incumplimiento:
> Si la clase Venta estuviera abierta para modificaciones cada vez que se agrega un nuevo tipo de producto, estaría violando el OCP.


### Principio de Sustitución de Liskov (LSP):

#### Cumplimiento:
> Las instancias de las clases derivadas como ProductoBebida y ProductoPan pueden sustituirse por instancias de la clase base Producto sin afectar el comportamiento del sistema.

#### Incumplimiento:
> Si una instancia de ProductoPan no puede ser usada en lugar de una instancia de Producto sin romper el comportamiento del sistema, estaría violando el LSP.


### Principio de Segregación de Interfaces (ISP):

#### Cumplimiento:
> Las interfaces como Horneable y ProductoIntegral están diseñadas para ser cohesivas y proporcionar funcionalidades específicas y relevantes para los productos que las implementan.

#### Incumplimiento:
> Si una interfaz como ProductoEspecificaciones contiene métodos que no son utilizados por todas las clases que la implementan, estaría violando el ISP.


### Principio de Inversión de Dependencias (DIP):

#### Cumplimiento:
> La clase Venta depende de abstracciones como Producto y Horneable en lugar de clases concretas, lo que facilita la introducción de nuevos tipos de productos sin modificar el código existente.

#### Incumplimiento:
> Si la clase Venta depende directamente de las implementaciones concretas de productos, como ProductoBebida o ProductoPan, estaría violando el DIP
