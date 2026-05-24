package co.edu.udec.hospital.domain.valueobjects;

public record Direccion(String value) {

    public Direccion {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "La dirección es Obligatoria"
            );
        }
    }
}
