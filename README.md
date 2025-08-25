# 🧪Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes**
 - Juan Diego Rodriguez Velasquez
 - Ignacio Andres Castillo Rendon
 - Anderson Fabian Garcia Nieto

**Nombre de la rama**
`feature/CastilloIgnacio_GarciaAnderson_RodriguezDiego_2025-2`


---

## ✔ Retos Completados

## Reto 6: Soporte Tecnico

**Evidencia Codigo Implementado**
-Solo se agregó el codigo del Main del reto, para no congestionar de imagenes el README.

<p align="center">
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Code/Reto6TechnicalSupportMain01.png" alt="Evidencia Código 1" width="400"/>
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Code/Reto6TechnicalSupportMain02.png" alt="Evidencia Código 2" width="400"/>
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Code/Reto6TechnicalSupportMain03.png" alt="Evidencia Código 3" width="400"/>
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Code/Reto6TechnicalSupportMain04.png" alt="Evidencia Código 4" width="400"/>
</p>

**Evidencia Solución**

<p align="center">
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Solutions/Reto6TechnicalSupportMain-Solution02.png" alt="Evidencia Solución 2" width="400"/>
	<img src="Laboratorio-2-CVDS-DOSW-01/docs/imagenes/Reto6/Reto6SupportTechnical-Solutions/Reto6TechnicalSupportMain-Solution01.png" alt="Evidencia Solución 1" width="400"/>
</p>

**Explicación Codigo (Diseño e implementación)**
El patron de diseño utilizado fué el de **Cadena de Responsabilidad**, este patron de diseño pertenece al grupo de patrones comportamentales.
Se destaca por que permite que múltiples objetos tengan la oportunidad de procesar una solicitud, pasándola a lo largo de una cadena hasta que alguien la maneje.

**Justificación**
Se escogió este patron de diseño, ya que calzaba perfectamente con el desarrollo del problema, donde los tickets empezaban desde el tecnico basico, siendo que si este podia resolver el ticket ahi acababa este, pero en el caso que no el ticket pasaba al siguiente nivel jerarquico(Con mas funcionalidades que el tecnico anterior) y se repetia esto mismo, si el nuevo tecnico no podia resolver el problema, entonces se lo delegaba al tecnico que se especializa un poco mas. A menos que ningun tecnico lo pueda desarrollar por diversos motivos, el ticket cambia de estado.

**Aplicación**
Se creó una clase abstracta tecnico, donde cada uno sabia quien era el siguiente, como era una clase abstracta, se crearon sus clases hijas siendo cada tecnico expecificamente con sus metodos sobreescritos, permitiendo que cada uno pudiera tener su logica propia para resolver un ticket o no.