package co.edu.udec.hospital.domain.model;

import java.util.UUID;

public class Sintoma {

    private final UUID id;
    private String nombre;

    public Sintoma(UUID id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}