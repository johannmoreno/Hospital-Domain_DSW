package co.edu.udec.hospital.domain.model;

import co.edu.udec.hospital.domain.enums.CategoriaMedico;
import co.edu.udec.hospital.domain.exceptions.HospitalException;
import co.edu.udec.hospital.domain.valueobjects.*;

import java.util.UUID;

public class Medico {

    private final UUID id;
    private NombreCompleto nombre;
    private Direccion direccion;
    private Telefono telefono;
    private Nit nit;
    private NumeroSeguridadSocial numeroSeguridadSocial;
    private String numeroColegiado;
    private CategoriaMedico categoria;

    public Medico(
            UUID id,
            NombreCompleto nombre,
            Direccion direccion,
            Telefono telefono,
            Nit nit,
            NumeroSeguridadSocial numeroSeguridadSocial,
            String numeroColegiado,
            CategoriaMedico categoria
    ) {

        if (nombre == null) {
            throw new HospitalException(
                    "El nombre del médico es obligatorio"
            );
        }

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.numeroColegiado = numeroColegiado;
        this.categoria = categoria;
    }

    public void cambiarTelefono(Telefono telefono) {

        if (telefono == null) {
            throw new HospitalException(
                    "El teléfono no puede ser nulo"
            );
        }

        this.telefono = telefono;
    }

    public UUID getId() {
        return id;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public CategoriaMedico getCategoria() {
        return categoria;
    }
}
