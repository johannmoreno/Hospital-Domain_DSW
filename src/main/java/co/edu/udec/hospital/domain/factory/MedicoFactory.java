package co.edu.udec.hospital.domain.factory;

import co.edu.udec.hospital.domain.enums.CategoriaMedico;
import co.edu.udec.hospital.domain.model.Medico;
import co.edu.udec.hospital.domain.valueobjects.*;

import java.util.UUID;

public class MedicoFactory {

    public static Medico crear(
            NombreCompleto nombre,
            Direccion direccion,
            Telefono telefono,
            Nit nit,
            NumeroSeguridadSocial numeroSeguridadSocial,
            String numeroColegiado,
            CategoriaMedico categoria
    ) {

        return new Medico(
                UUID.randomUUID(),
                nombre,
                direccion,
                telefono,
                nit,
                numeroSeguridadSocial,
                numeroColegiado,
                categoria
        );
    }
}
