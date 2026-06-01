package Futbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TeamManager {

    protected List<Persona> integrantes;

    public void registerMember(Persona p) {
        integrantes.add(p);
    }
    public TeamManager() {
        this.integrantes = new ArrayList<>(); // <--- Esto crea la lista en memoria y evita el error
    }
    public void showSquad() {
        for (Persona p : integrantes) {
            System.out.println(p);
        }
    }

    public void findPlayersByPosition(String posicion) {
        ArrayList<Player> jugadores = new ArrayList<>();
        for (Persona p : integrantes) {
            if (p instanceof Player) {
                Player jugador = (Player) p;
                if (jugador.getPosicion().toString().equalsIgnoreCase(posicion)) {
                    jugadores.add(jugador); //toString para convertir enum posicion a texto
                }
            }
        }
    }
    public double calcularEdadPromedio() {
        // 1. Si no hay nadie registrado, devolvemos 0 para evitar que el programa explote (división entre cero)
        if (integrantes.isEmpty()) {
            return 0.0;
        }

        int sumaEdades = 0;

        // 2. Recorremos la lista sumando la edad de cada persona
        for (Persona p : integrantes) {
            sumaEdades += p.getEdad();
        }

        // 3. Dividimos la suma total entre el número de integrantes.
        // Usamos (double) para que Java no trunque los decimales y te dé la media exacta (ej: 28.5 en vez de 28).
        return (double) sumaEdades / integrantes.size();
    }
}


