package Futbol;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main() {
        Equipo depor= new Equipo("Depor","A Coruña", 1);
        Equipo camelle= new Equipo("Camelle","Camariñas", 100);

        TeamManager manager= new TeamManager();

        Player djalminha= new Player(1,"djalminha",55,"depor",Posicion.DELANTERO);
        Player ipi= new Player(67,"iker",18,"Camelle",Posicion.MEDIOCAMPO);

        Staff josep= new Staff(69,"El mou",110,"Camelle",88,Rol.FISIOTERAPEUTA);
        Staff nico= new Staff(55,"El correas",18,"Depor",1,Rol.ANALISTA);

        djalminha.addStat("Goles", 12);
        djalminha.addStat("Asistencias", 18);
        djalminha.addStat("Tarjetas Amarillas", 4);

        ipi.addStat("Goles", 2);
        ipi.addStat("Asistencias", 5);
        ipi.addStat("Balones Recuperados", 42);
        System.out.println("JOSE PERUANO");

        manager.registerMember(djalminha);
        manager.registerMember(ipi);
        manager.registerMember(josep);
        manager.registerMember(nico);

        manager.showSquad();

        double promedioEdad = manager.calcularEdadPromedio();
        System.out.println("Promedio edad "+promedioEdad);
        //Cargar Estadísticas: Para los jugadores, añade al menos 3 estadísticas diferentes (ej: Goles, Asistencias, Tarjetas) usando el Map.
        //
        //Cálculo de Promedio: Crea un método que calcule la edad media de todas las personas registradas en la lista del manager.


    }


}
