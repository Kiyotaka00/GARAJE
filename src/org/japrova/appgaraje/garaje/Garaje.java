package org.japrova.appgaraje.garaje;

import org.japrova.appgaraje.automovil.Automovil;

import java.util.ArrayList;

public class Garaje {

    private final ArrayList<Automovil> automovils = new ArrayList<>();

    public void almacenarVehiculo(Automovil automovil) {

        if(automovil != null) {
            automovils.add(automovil);
        }
    }

    public ArrayList<Automovil> getAutomovils() {
        return automovils;
    }
}
