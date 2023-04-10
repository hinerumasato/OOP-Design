package BTOn.Temperature.controller;

import java.awt.event.ActionEvent;

import BTOn.Temperature.model.WeatherData;

public class FahrenheitButtonController extends ButtonController {

    public FahrenheitButtonController(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float oldData = weatherData.getFahrenheitTemperature();
        if(e.getActionCommand().equals("Raise")) {
            weatherData.setFahrenheitTemperature(oldData + 1);
        }
        else weatherData.setFahrenheitTemperature(oldData - 1);
    }
    
}
