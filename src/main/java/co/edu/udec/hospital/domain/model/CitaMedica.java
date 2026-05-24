package co.edu.udec.hospital.domain.model;

import co.edu.udec.hospital.domain.enums.EstadoCita;
import co.edu.udec.hospital.domain.exceptions.HospitalException;

import java.time.LocalDateTime;
import java.util.UUID;

public class CitaMedica {

    private final UUID id;
    private final Medico medico;
    private final Paciente paciente;
    private final LocalDateTime fecha;
    private final String consultorio;
    private EstadoCita estado;

    public CitaMedica(
            UUID id,
            Medico medico,
            Paciente paciente,
            LocalDateTime fecha,
            String consultorio
    ) {

        if (medico == null) {
            throw new HospitalException(
                    "La cita necesita un médico"
            );
        }

        if (paciente == null) {
            throw new HospitalException(
                    "La cita necesita un paciente"
            );
        }

        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public void cancelar() {
        this.estado = EstadoCita.CANCELADA;
    }

    public void finalizar() {
        this.estado = EstadoCita.FINALIZADA;
    }
}
