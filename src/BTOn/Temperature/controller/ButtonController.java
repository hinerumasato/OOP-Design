package BTOn.Temperature.controller;

import java.awt.event.ActionListener;

import BTOn.Temperature.model.WeatherData;

public abstract class ButtonController implements ActionListener {
    protected WeatherData weatherData;

    public ButtonController(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

}
