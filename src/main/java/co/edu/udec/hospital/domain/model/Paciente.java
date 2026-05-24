package co.edu.udec.hospital.domain.model;

import co.edu.udec.hospital.domain.exceptions.HospitalException;
import co.edu.udec.hospital.domain.valueobjects.*;

import java.util.UUID;

public class Paciente {

    private final UUID id;
    private NombreCompleto nombre;
    private Direccion direccion;
    private Telefono telefono;
    private Nit nit;
    private NumeroSeguridadSocial numeroSeguridadSocial;
    private Medico medicoAsignado;

    public Paciente(
            UUID id,
            NombreCompleto nombre,
            Direccion direccion,
            Telefono telefono,
            Nit nit,
            NumeroSeguridadSocial numeroSeguridadSocial,
            Medico medicoAsignado
    ) {

        if (nombre == null) {
            throw new HospitalException(
                    "El paciente debe tener nombre"
            );
        }

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.medicoAsignado = medicoAsignado;
    }

    public void asignarMedico(Medico medico) {

        if (medico == null) {
            throw new HospitalException(
                    "El médico es obligatorio"
            );
        }

        this.medicoAsignado = medico;
    }
}