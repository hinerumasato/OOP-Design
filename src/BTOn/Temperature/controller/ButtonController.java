package BTOn.Temperature.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BTOn.Temperature.view.AbstractPanel;
import BTOn.Temperature.view.FahrenheitPanel;

public class ButtonController implements ActionListener {
    private AbstractPanel abstractPanel;

    public ButtonController(AbstractPanel abstractPanel) {
        this.abstractPanel = abstractPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Raise")) {
            if(abstractPanel instanceof FahrenheitPanel) {
                float currentTemp = this.abstractPanel.getWeatherData().getFahrenheitTemperature();
                this.abstractPanel.getWeatherData().setFahrenheitTemperature(currentTemp + 1);
            }

            else {
                float currentTemp = this.abstractPanel.getWeatherData().getCelsiusTemperature();
                this.abstractPanel.getWeatherData().setCelsiusTemperature(currentTemp + 1);
            }
        }

        else {
            if(abstractPanel instanceof FahrenheitPanel) {
                float currentTemp = this.abstractPanel.getWeatherData().getFahrenheitTemperature();
                this.abstractPanel.getWeatherData().setFahrenheitTemperature(currentTemp - 1);
            }

            else {
                float currentTemp = this.abstractPanel.getWeatherData().getCelsiusTemperature();
                this.abstractPanel.getWeatherData().setCelsiusTemperature(currentTemp - 1);
            }
        }
            
    }

}
