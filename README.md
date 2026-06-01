🚀 Misión 1: El Modelo de Datos
Crea las siguientes clases:

Clase Club (Equipo):

Atributos: nombre, ciudad, rankingFIFA (1-100).

Clase Abstracta Person (Persona):

Atributos: id, nombre, edad, Club (objeto compuesto).

Clase Player (Jugador - Hereda de Person):

Atributos extra: posicion (Delantero, Portero, etc.), dorsal.

Colección: Map<String, Integer> stats (Donde la clave es la métrica, ej: "Goles", y el valor es la cantidad).

Clase Staff (Cuerpo Técnico - Hereda de Person):

Atributos extra: rol (Entrenador, Fisioterapeuta, Analista), añosExperiencia.

🚀 Misión 2: La Gestión Deportiva
Crea una clase llamada TeamManager que contenga:

Una List<Person> con todos los integrantes del club.

Método registerMember(Person p): Añade una persona a la lista.

Método showSquad(): Muestra por pantalla a todos los integrantes de forma organizada.

Método findPlayersByPosition(String position): Devuelve una sub-lista solo con los jugadores que juegan en esa posición.

🚀 Misión 3: Simulación (Main)
En tu clase Principal, realiza lo siguiente:

Instanciar 2 clubes (ej: Real Madrid, FC Barcelona).

Crear 4 integrantes: 2 jugadores y 2 miembros del staff.

Cargar Estadísticas: Para los jugadores, añade al menos 3 estadísticas diferentes (ej: Goles, Asistencias, Tarjetas) usando el Map.

Cálculo de Promedio: Crea un método que calcule la edad media de todas las personas registradas en la lista del manager.
