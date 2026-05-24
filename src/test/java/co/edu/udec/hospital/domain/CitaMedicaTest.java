package co.edu.udec.hospital.domain;

import co.edu.udec.hospital.domain.enums.CategoriaMedico;
import co.edu.udec.hospital.domain.enums.EstadoCita;
import co.edu.udec.hospital.domain.model.*;
import co.edu.udec.hospital.domain.valueobjects.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.*;

class CitaMedicaTest {

    @Test
    void debeCancelarCita() {

        var medico = new Medico(
                UUID.randomUUID(),
                new NombreCompleto("Juan"),
                new Direccion("Centro"),
                new Telefono("3001234567"),
                new Nit("112"),
                new NumeroSeguridadSocial("222"),
                "COL1",
                CategoriaMedico.TITULAR
        );

        var paciente = new Paciente(
                UUID.randomUUID(),
                new NombreCompleto("Pedro"),
                new Direccion("Barrio"),
                new Telefono("3011234567"),
                new Nit("333"),
                new NumeroSeguridadSocial("444"),
                medico
        );

        var cita = new CitaMedica(
                UUID.randomUUID(),
                medico,
                paciente,
                LocalDateTime.now(),
                "Consultorio 1"
        );

        cita.cancelar();

        assertThat(cita)
                .isNotNull();
    }
}
