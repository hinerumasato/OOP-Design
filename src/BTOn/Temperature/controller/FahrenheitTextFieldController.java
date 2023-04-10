package BTOn.Temperature.controller;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import BTOn.Temperature.model.WeatherData;

public class FahrenheitTextFieldController extends TextFieldController {

    public FahrenheitTextFieldController(JTextField jTextField, WeatherData weatherData) {
        super(jTextField, weatherData);
    }

    public void updateData() {
        String data = jTextField.getText();
        float num = Float.parseFloat(data);
        weatherData.setFahrenheitTemperature(num);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateData();
    }
    
}
