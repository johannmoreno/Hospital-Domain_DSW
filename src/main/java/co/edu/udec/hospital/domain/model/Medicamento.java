package co.edu.udec.hospital.domain.model;

import java.util.UUID;

public class Medicamento {

    private final UUID id;
    private String nombreComercial;
    private String nombreGenerico;
    private String principioActivo;
    private String laboratorio;
    private boolean requiereReceta;
    private boolean cubiertoPOS;

    public Medicamento(
            UUID id,
            String nombreComercial,
            String nombreGenerico,
            String principioActivo,
            String laboratorio,
            boolean requiereReceta,
            boolean cubiertoPOS
    ) {
        this.id = id;
        this.nombreComercial = nombreComercial;
        this.nombreGenerico = nombreGenerico;
        this.principioActivo = principioActivo;
        this.laboratorio = laboratorio;
        this.requiereReceta = requiereReceta;
        this.cubiertoPOS = cubiertoPOS;
    }
}
