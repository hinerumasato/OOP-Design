package BTOn.Temperature.model;

import javax.swing.JTextField;

public class FahrenheitModel extends TemperatureModel {

    private float fahrenheitTemperature;
    private JTextField fahrenheitTextField;

    public FahrenheitModel() {
        WeatherData data = (WeatherData) weatherData;
        this.fahrenheitTemperature = data.getFahrenheitTemperature();
        this.weatherData.registerObserver(this);
    }

    public FahrenheitModel(Subject weatherData) {
        super(weatherData);
        WeatherData data = (WeatherData) weatherData;
        this.fahrenheitTemperature = data.getFahrenheitTemperature();
        this.weatherData.registerObserver(this);
    }

    public JTextField getFahrenheitTextField() {
        return fahrenheitTextField;
    }

    public void setFahrenheitTextField(JTextField fahrenheitTextField) {
        this.fahrenheitTextField = fahrenheitTextField;
    }

    @Override
    public void update(float fahrenheitTemperature, float celsiusTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
        this.fahrenheitTextField.setText(Float.toString(fahrenheitTemperature));
    }

    public float getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }

    public void setFahrenheitTemperature(float fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

}
