package co.edu.udec.hospital.domain.valueobjects;

public record Telefono(String value) {

    public Telefono {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "El teléfono es obligatorio"
            );
        }

        if (!value.matches("[0-9]{10}")) {
            throw new IllegalArgumentException(
                    "El teléfono debe tener 10 dígitos"
            );
        }
    }
}
