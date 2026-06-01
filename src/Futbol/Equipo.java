package Futbol;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int raking;

    public Equipo(String nombre, String ciudad, int raking) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.raking = raking;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getRaking() {
        return raking;
    }

    public void setRaking(int raking) {
        this.raking = raking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", raking=" + raking +
                '}';
    }
}
