package BTOn.Temperature.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import BTOn.Temperature.model.Observer;
import BTOn.Temperature.model.WeatherData;

public class TemperatureBarPanel extends JPanel implements Observer {
    private JProgressBar temperatureBar;
    private WeatherData weatherData;

    public TemperatureBarPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        awake();
        init();
        weatherData.registerObserver(this);
    }

    public void awake() {
        this.temperatureBar = new JProgressBar(0, 100);
    }

    public void init() {
        temperatureBar.setOrientation(JProgressBar.VERTICAL);
        temperatureBar.setForeground(Color.RED);
        add(temperatureBar);
    }

    public void setTemperature(float temperature) {
        temperatureBar.setValue((int) temperature);
    }

    @Override
    public void update(float fahrenheitTemperature, float celsiusTemperature) {
        setTemperature(weatherData.getCelsiusTemperature());
    }
}
