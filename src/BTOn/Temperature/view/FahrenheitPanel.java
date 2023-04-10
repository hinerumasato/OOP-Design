package BTOn.Temperature.view;

import BTOn.Temperature.controller.FahrenheitButtonController;
import BTOn.Temperature.controller.FahrenheitTextFieldController;
import BTOn.Temperature.model.WeatherData;

public class FahrenheitPanel extends AbstractPanel {

    public FahrenheitPanel(WeatherData weatherData, String title) {
        super(weatherData, title);
    }

    @Override
    public void awake() {
        super.awake();
        this.buttonController = new FahrenheitButtonController(weatherData);
        this.textFieldController = new FahrenheitTextFieldController(temperatureTextField, weatherData);
    }

    @Override
    public void update(float fahrenheitTemperature, float celsiusTemperature) {
        String content = Float.toString(fahrenheitTemperature);
        setTemperatureTextFieldContent(content);
    }
    
}
