package org.example.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    private String id;
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    private long cedula;
}
