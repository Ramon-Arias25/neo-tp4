#Enunciado:
JAVA 8+
De los perros que fueron dados como aptos en la actividad anterior, se ha decidido armar una unidad K-9,
la cual consta de la siguiente clasificación:

Perros de detección
- Deben ser entrenados para detección de personas y explosivos
- Deben ser equipados con cámaras para seguimiento
- Deben ser asignados a ubicaciones de concurrencia masiva

Perros de protección
- Deben ser entrenados para ataque
- Deben ser equipados con chalecos tácticos de kevlar
- Deben ser asignados para patrullaje en general

Dado el siguiente listado almacenado en un ArrayList:
id 	- Nombre 	- Tipo 		- Raza 			- sexo
1 	- Kei 		- Protección 	- Pastor belga malinés 	- macho
2 	- Matthis 	- Protección 	- Pastor alemán 	- macho
3 	- Minnie 	- Detección 	- Mestizo 		- hembra
4 	- Marek 	- Protección 	- Pastor holandés	- macho
5 	- Sally 	- Protección 	- Pastor alemán 	- hembra
6 	- Leia 		- Detección 	- Pastor australiano 	- hembra
7 	- Eddie 	- Protección 	- Pastor belga malinés 	- macho
8 	- Razor 	- Detección 	- Border Collie 	- macho

a) Modelar la unidad utilizando clase/s e interface/s según considere (detallar acciones en métodos)
b) Utilizando stream sobre el ArrayList de caninos:
b-1) Generar dos listados a partir de este separando perros de protección de los de detección
b-2) Obtener el conteo total de machos y de hembras

#Comentarios
Para cumplir con buenas prácticas se cambiaron los métodos y variables a inglés pero aunque los datos e impresiones por consola permanecen en español para no modificar los datos de entrada suministrados en el enunciado.

adicionalmente se busco documentar brevemente los metodos definidos en la clase Launch