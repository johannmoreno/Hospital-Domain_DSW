package co.edu.udec.hospital.domain.valueobjects;

public record Nit(String value) {

    public Nit {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "El NIT es Obligatorio"
            );
        }
    }
}
