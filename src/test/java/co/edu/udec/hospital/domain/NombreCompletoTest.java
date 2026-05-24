package co.edu.udec.hospital.domain;

import co.edu.udec.hospital.domain.valueobjects.NombreCompleto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NombreCompletoTest {

    @Test
    void debeCrearNombreValido() {

        var nombre = new NombreCompleto("Juan Perez");

        assertThat(nombre.value())
                .isEqualTo("Juan Perez");
    }

    @Test
    void debeFallarConNombreVacio() {

        assertThatThrownBy(() ->
                new NombreCompleto("")
        )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("No puede estar vacío");
    }
}
