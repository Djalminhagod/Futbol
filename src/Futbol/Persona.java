package Futbol;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String Club;

    public Persona(int id, String nombre, int edad, String club) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        Club = club;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", Club='" + Club + '\'' +
                '}';
    }
}
