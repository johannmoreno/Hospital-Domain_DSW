package co.edu.udec.hospital.domain.model;

import java.util.List;
import java.util.UUID;

public class Enfermedad {

    private final UUID id;
    private String nombre;
    private List<Sintoma> sintomas;

    public Enfermedad(
            UUID id,
            String nombre,
            List<Sintoma> sintomas
    ) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
    }
}
