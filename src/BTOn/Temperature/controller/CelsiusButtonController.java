package BTOn.Temperature.controller;

import java.awt.event.ActionEvent;

import BTOn.Temperature.model.WeatherData;

public class CelsiusButtonController extends ButtonController {

    public CelsiusButtonController(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float oldData = weatherData.getCelsiusTemperature();
        if(e.getActionCommand().equals("Raise")) {
            weatherData.setCelsiusTemperature(oldData + 1);
        }
        else weatherData.setCelsiusTemperature(oldData - 1);
    }
    
}
