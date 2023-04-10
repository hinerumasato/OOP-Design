package BTOn.Temperature.controller;

import java.awt.event.ActionListener;

import javax.swing.JTextField;

import BTOn.Temperature.model.WeatherData;

public abstract class TextFieldController implements ActionListener {

    protected JTextField jTextField;
    protected WeatherData weatherData;

    public TextFieldController(JTextField jTextField, WeatherData weatherData) {
        this.jTextField = jTextField;
        this.weatherData = weatherData;
    }

}
