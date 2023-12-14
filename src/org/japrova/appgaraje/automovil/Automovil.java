package org.japrova.appgaraje.automovil;

import org.japrova.appgaraje.personas.Propietario;

public class Automovil {

    private String matricula;
    private Propietario propietario;
    private TipoAutomovil tipo;

    public Automovil(String matricula, Propietario propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
