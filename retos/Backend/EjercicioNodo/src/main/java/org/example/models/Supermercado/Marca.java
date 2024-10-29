package org.example.models.Supermercado;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "marca" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Producto> productos;
}
