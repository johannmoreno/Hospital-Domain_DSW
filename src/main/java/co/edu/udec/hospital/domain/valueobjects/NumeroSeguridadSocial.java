package co.edu.udec.hospital.domain.valueobjects;

public record NumeroSeguridadSocial(String value) {

    public NumeroSeguridadSocial {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    "El número de seguridad social es obligatorio"
            );
        }
    }
}
