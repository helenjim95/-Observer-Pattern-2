package de.tum.in.ase.eist;

import java.awt.*;

public class KelvinGUI extends TemperatureGUI {

    public KelvinGUI(TemperatureModel model, Point location) {
        super("Kelvin Temperature", model, location);
        addRaiseTempListener(() -> getModel().increaseK(1.0));
        addLowerTempListener(() -> getModel().increaseK(-1.0));
        addDisplayListener(() -> {
            double value = getDisplay();
            getModel().setK(value);
        });
    }

    @Override
    public void onUpdate(Double celsiusValue) {
        Double kelvinValue = TemperatureConverter.convertCelsiusToKelvin(celsiusValue);
        setDisplay(String.valueOf(kelvinValue.intValue()));
    }

}
