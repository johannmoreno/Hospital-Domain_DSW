package co.edu.udec.hospital.domain;

import co.edu.udec.hospital.domain.enums.CategoriaMedico;
import co.edu.udec.hospital.domain.model.Medico;
import co.edu.udec.hospital.domain.valueobjects.*;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;

class MedicoTest {

    @Test
    void debeCrearMedicoCorrectamente() {

        var medico = new Medico(
                UUID.randomUUID(),
                new NombreCompleto("Carlos Ruiz"),
                new Direccion("Calle 10"),
                new Telefono("3001234567"),
                new Nit("123456"),
                new NumeroSeguridadSocial("999"),
                "COL123",
                CategoriaMedico.TITULAR
        );

        assertThat(medico.getNombre().value())
                .isEqualTo("Carlos Ruiz");
    }
}
