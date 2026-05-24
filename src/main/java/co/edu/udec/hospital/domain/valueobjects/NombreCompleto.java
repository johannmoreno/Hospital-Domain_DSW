package co.edu.udec.hospital.domain.valueobjects;

public record NombreCompleto(String value) {

    public NombreCompleto {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío"
            );
        }
    }
}
