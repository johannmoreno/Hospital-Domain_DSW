**CONCEPTOS INVESTIGADOS BASADO A MI CEA QUE ME AYUDARON A ENTENDER Y REALIZAR LA ACTIVIDAD**

**Enums**
Los enums representan valores constantes del dominio.

**Exceptions**
Las excepciones del dominio permiten:

Mostrar errores del negocio.
Validar reglas.
Evitar datos inválidos.

**Value Objects**
¿Qué son?

Objetos inmutables.
No tienen identidad.
Representan conceptos del dominio.
Ejemplos:
Nombre.
Dirección.
Teléfono.

**Clase de tipo Record**
En Java, un record es un tipo especial de clase diseñada específicamente para contener datos 
inmutables y reducir el código repetitivo (boilerplate). Se utiliza para modelar estructuras de 
datos simples con muy pocas líneas, ya que Java genera automáticamente los constructores y los 
métodos de acceso.

**Entidades del Dominio**
Las entidades:

Tienen identidad.
Cambian de estado.
Representan objetos principales del negocio.

**Eventos de Dominio**

Los eventos representan algo importante que ocurrió en el sistema.

Ejemplo:

Cita creada.
Diagnóstico registrado.
Receta emitida.

**Servicios de Dominio**

Un servicio de dominio:

Contiene lógica compleja.
Coordina varias entidades.
No pertenece a una sola entidad.

**Factory Pattern**

La fábrica controla la creación de objetos.

Beneficios:

Centraliza validaciones.
Evita objetos inválidos.
Hace el código más limpio.

**Specification Pattern**

Sirve para validar reglas complejas del negocio.

Ejemplo:

Un médico no puede tener dos citas al mismo tiempo.

**Pruebas Unitarias**

Las pruebas verifican:

Que las reglas funcionen.
Que las validaciones sean correctas.
Que el dominio sea estable.