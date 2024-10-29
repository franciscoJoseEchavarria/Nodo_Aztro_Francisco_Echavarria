package org.example;

import org.example.models.Persona;
import org.example.repositories.PersonaRepository;

public class Main {
    public static void main(String[] args) {


        PersonaRepository personaRepository = new PersonaRepository();

        Persona persona = new Persona();
        persona.setNombre("juan");
        persona.setCedula(123456L);
        persona.setApellido("lopez");

        personaRepository.create(persona);
        personaRepository.findAll()
                .stream()
                        .forEach(System.out::println);
        personaRepository.close();



    }
}