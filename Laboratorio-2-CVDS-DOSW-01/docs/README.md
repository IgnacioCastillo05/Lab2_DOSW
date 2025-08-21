¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?
 
R: Ofrece distintas ventajas, entre ellas:
- Se hace un código más limpio y de mayor mantenibilidad.
- Hace que el código sea extensible o sea más fácil su extensión
- Se evita el acoplamiento.
- Se pueden reutilizar partes del código para futuras funciones.
- Es mucho mejor su legibilidad.
 
¿Por qué una clase inmutable puede mejorar la seguridad?
 
R: Debido a que se evitan modificaciones inesperadas y existe un mayor control a la hora de compartir el objeto, debido a que no está sujeto a cambios.
 
¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?
 
R: Si los atributos de las clases son públicos, cualquier parte del código o cualquier clase puede cambiarlos sin ningún tipo de restricción. También se genera ciertas inconsistencias en el estado del objeto al igual que habría una baja seguridad y el acomplamiento aumentaría bastante.
 
¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?
 
R: No se debe editar o cambiar el código que ya existe, se debe es extender mediante herencias, interfaces o nuevas clases o implementaciones acorde a lo que se necesite.
 
¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?
 
R: Así uno asegura que el código que uno tiene es mantenible por lo que cada clase solo tiene una función; se evita también el acoplamiento y de igual manera es más sencillo de testear unitariamente.
 
¿Qué es y porque usamos el pom.xml?
 
R: El pom.xml es el archivo de configuración principal de un proyecto Maven en Java, el cual contiene toda la información y metadatos del proyecto (dependencias externas, plugins y configuraciones e información del proyecto). La razón por la que se usa es porque hay una gestión automática de dependencias y hay una mayor portabilidad y permite el trabajo en equipo.
 
¿Qué diferencia hay entre mvn compile, mvn package y mvn install?
 
R:
mvn compile: compila el código fuente y genera los .class
mvn package: ejecuta todo lo del compile al igual que las pruebas unitarias y empaqueta el proyecto en el formato definido.
mvn install: ejecuta todo lo del package e instala el artefacto en el repositorio local de Maven.
 
¿Qué diferencia existe entre una interfaz y una clase abstracta?
 
R: La interfaz define un conjunto de métodos y constantes que una clase (o varias) debe implementar. No tiene estado
La clase abstracta es una clase que no se puede instanciarse directamente. Puede tener tanto métodos abstractos como métodos concretos.