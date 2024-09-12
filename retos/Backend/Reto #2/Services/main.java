package Services;

import domains.abstracts.*;

import java.util.Map;

public class main {
    public static void main(String[] args) {

        Medico medico =
                new Medico("Juan", "Perez", 10L, "sala de urgencias");

        Empleado enfermero =
                new Enfermero("Maria", "Lopez", 20L, "diabetes");

        Empleado aseador =
                new Aseador("Juana", "Morales", 30L, "aseo asensores");

        Empleado paciente =
                new Paciente("Andres", "Lopez", 0L,
                        Map.of("dolor de cabeza", "aspirina"));

        System.out.println("*****");
        System.out.printf("Empleado: %s se gana inicialmente %s dolares por hora con %s de gratificacion\n",
                paciente.getLastName(), paciente.getSalary(), paciente.getGratification());
        System.out.println("El Empleado se le reconoce su esfuerzo y se le sube el sueldo\n");
        //medico.makeGratification();
        // TODO 'makeGratification()' has protected access in 'org.example.domains.Medico
        paciente.setSalary(40L);
        //paciente.setGratification(40.0);
        System.out.printf("Empleado: %s gana ahora %s dolares por hora mas %s de gratificacion\n",
                paciente.getLastName(), paciente.getSalary(), paciente.getGratification());
        System.out.println("*****");


    }


}
