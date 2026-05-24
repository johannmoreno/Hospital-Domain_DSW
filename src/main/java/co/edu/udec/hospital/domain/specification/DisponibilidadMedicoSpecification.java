package co.edu.udec.hospital.domain.specification;

import co.edu.udec.hospital.domain.model.CitaMedica;

import java.time.LocalDateTime;
import java.util.List;

public class DisponibilidadMedicoSpecification {

    public boolean isSatisfiedBy(
            LocalDateTime fecha,
            List<CitaMedica> citas
    ) {

        return citas.stream()
                .noneMatch(cita -> fecha.equals(fecha));
    }
}