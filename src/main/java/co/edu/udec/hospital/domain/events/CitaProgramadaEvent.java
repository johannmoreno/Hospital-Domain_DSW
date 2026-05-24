package co.edu.udec.hospital.domain.events;

import java.time.Instant;
import java.util.UUID;

public record CitaProgramadaEvent(
        UUID citaId,
        Instant fechaEvento
) {
}
