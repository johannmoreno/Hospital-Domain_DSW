package co.edu.udec.hospital.domain.services;

import co.edu.udec.hospital.domain.model.CitaMedica;
import co.edu.udec.hospital.domain.model.Medico;

import java.time.LocalDateTime;

public class AgendaMedicaService {

    public boolean validarDisponibilidad(
            Medico medico,
            LocalDateTime fecha,
            CitaMedica citaExistente
    ) {

        if (medico == null || fecha == null) {
            return false;
        }

        return citaExistente == null;
    }
}
