package org.japrova.appgaraje.personas;

public class Propietario extends Persona {

    private int celular;
    private Cuenta cuenta;

    public Propietario(String dni, String nombre, String apellido, int celular) {
        super(dni, nombre, apellido);
        this.celular = celular;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getCelular() {
        return celular;
    }
}
