package co.edu.udec.hospital.domain.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Diagnostico {

    private final UUID id;
    private Enfermedad enfermedad;
    private List<Sintoma> sintomas;
    private String descripcion;
    private LocalDate fecha;

    public Diagnostico(
            UUID id,
            Enfermedad enfermedad,
            List<Sintoma> sintomas,
            String descripcion,
            LocalDate fecha
    ) {
        this.id = id;
        this.enfermedad = enfermedad;
        this.sintomas = sintomas;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}
