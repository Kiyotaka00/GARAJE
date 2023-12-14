package org.japrova.appgaraje;

import org.japrova.appgaraje.automovil.Automovil;
import org.japrova.appgaraje.automovil.TipoAutomovil;
import org.japrova.appgaraje.personas.Cuenta;
import org.japrova.appgaraje.personas.Empleado;
import org.japrova.appgaraje.personas.Propietario;

public class EjercicioMain {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("2121", "Juan", "Velez", "APS12");

        Propietario propietario = new Propietario("5323", "Jhosep", "Pantoja", 21313);
        Cuenta cuenta1 = new Cuenta(1000);
        propietario.setCuenta(cuenta1);

        Propietario propietario1 = new Propietario("4545", "Kei", "Karuizawa", 21313);
        Cuenta cuenta2 = new Cuenta(1000);
        propietario1.setCuenta(cuenta2);

        Automovil automovil = new Automovil("APK23P", propietario);
        automovil.setTipo(TipoAutomovil.ELECTRICO);
        Automovil automovil1 = new Automovil("PASI12", propietario);
        automovil1.setTipo(TipoAutomovil.ELECTRICO);

        Automovil automovil2 = new Automovil("DAHK12", propietario1);
        automovil2.setTipo(TipoAutomovil.ELECTRICO);

        empleado.almacenarVehiculo(automovil);
        empleado.almacenarVehiculo(automovil1);
        empleado.almacenarVehiculo(automovil2);

        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Saldo: " + propietario.getCuenta().getSaldo());

        System.out.println("Propietario: " + propietario1.getNombre());
        System.out.println("Saldo: " + propietario1.getCuenta().getSaldo());
    }
}
