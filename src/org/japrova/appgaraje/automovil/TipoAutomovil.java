package org.japrova.appgaraje.automovil;

public enum TipoAutomovil {
    COMBUSTIBLE("Combustible"),
    ELECTRICO("Electrico");

    private final String tipo;

    TipoAutomovil(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
