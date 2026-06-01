package Futbol;

public class Staff extends Persona {
    protected Rol rol;
    protected int anosExperiencia;

    public Staff(int id, String nombre, int edad, String club, int anosExperiencia, Rol rol) {
        super(id, nombre, edad, club);
        this.anosExperiencia = anosExperiencia;
        this.rol = rol;
    }
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre="+ getNombre() +
                "rol=" + rol +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
