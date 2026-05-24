package co.edu.udec.hospital.domain.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class RecetaMedica {

    private final UUID id;
    private Paciente paciente;
    private Medico medico;
    private List<Medicamento> medicamentos;
    private LocalDate fecha;

    public RecetaMedica(
            UUID id,
            Paciente paciente,
            Medico medico,
            List<Medicamento> medicamentos,
            LocalDate fecha
    ) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.fecha = fecha;
    }
}