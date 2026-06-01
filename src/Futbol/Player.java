package Futbol;

import java.util.HashMap;
import java.util.Map;

public class Player extends Persona {
    protected Posicion posicion;
    protected Map<String, Integer> stats= new HashMap<>();
    public Player(int id, String nombre, int edad, String club, Posicion posicion) {
        super(id, nombre, edad, club);
        this.posicion = posicion;
    }
    public void addStat(String metrica, int valor) {
        this.stats.put(metrica, valor);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre="+ getNombre() +
                "posicion=" + posicion +
                ", stats=" + stats +
                '}';
    }
}
