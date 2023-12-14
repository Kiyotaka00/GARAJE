package org.japrova.appgaraje.personas;

import org.japrova.appgaraje.automovil.Automovil;
import org.japrova.appgaraje.automovil.TipoAutomovil;
import org.japrova.appgaraje.garaje.Garaje;

import java.util.ArrayList;

public class Empleado extends Persona {

    private String carnet;
    private static Garaje garaje;

    public Empleado(String dni, String nombre, String apellido, String carnet) {
        super(dni, nombre, apellido);
        this.carnet = carnet;
        Empleado.garaje = new Garaje();
    }

    public String getCarnet() {
        return carnet;
    }

    public static Garaje getGaraje() {
        return garaje;
    }

    public void almacenarVehiculo(Automovil automovil) {
        if (validarPropietario(automovil)) {
            Empleado.getGaraje().almacenarVehiculo(automovil);
        }
    }

    public boolean validarPropietario(Automovil automovil) {
        ArrayList<Automovil> autos = Empleado.garaje.getAutomovils();
        TipoAutomovil tipo = automovil.getTipo();
        Cuenta cuenta = automovil.getPropietario().getCuenta();

        if(autos.isEmpty()) {
            cobrar(tipo, cuenta);
        } else {
            String dni = automovil.getPropietario().getDni();

            for (Automovil au : autos) {
                if(au.getPropietario().getDni().equals(dni)) {
                    cobrar(au.getTipo(), au.getPropietario().getCuenta());
                    return true;
                }
            }
        }
        return false;
    }

    public void cobrar(TipoAutomovil tipo, Cuenta cuenta) {

        if(tipo == TipoAutomovil.COMBUSTIBLE) {
            cuenta.setSaldo(cuenta.getSaldo() - 300);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - 200);
        }
    }
}
