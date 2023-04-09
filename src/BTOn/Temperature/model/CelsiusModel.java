package BTOn.Temperature.model;

import javax.swing.JTextField;

public class CelsiusModel extends TemperatureModel {

    private float celsiusTemperature;
    private JTextField celsiusTextField;

    public CelsiusModel() {
        WeatherData data = (WeatherData) weatherData;
        this.celsiusTemperature = data.getCelsiusTemperature();
        this.weatherData.registerObserver(this);
    }

    public CelsiusModel(Subject weatherData) {
        super(weatherData);
        WeatherData data = (WeatherData) weatherData;
        this.celsiusTemperature = data.getCelsiusTemperature();
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float fahrenheitTemperature, float celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
        this.celsiusTextField.setText(Float.toString(celsiusTemperature));
    }

    public float getCelsiusTemperature() {
        return celsiusTemperature;
    }

    public void setCelsiusTemperature(float celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    public JTextField getCelsiusTextField() {
        return celsiusTextField;
    }

    public void setCelsiusTextField(JTextField celsiusTextField) {
        this.celsiusTextField = celsiusTextField;
    }

}
