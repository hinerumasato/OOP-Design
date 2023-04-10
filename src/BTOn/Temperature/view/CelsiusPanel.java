package BTOn.Temperature.view;

import BTOn.Temperature.controller.CelsiusButtonController;
import BTOn.Temperature.controller.CelsiusTextFieldController;
import BTOn.Temperature.model.WeatherData;

public class CelsiusPanel extends AbstractPanel {
    public CelsiusPanel(WeatherData weatherData, String title) {
        super(weatherData, title);
    }

    @Override
    public void awake() {
        super.awake();
        this.buttonController = new CelsiusButtonController(weatherData);
        this.textFieldController = new CelsiusTextFieldController(temperatureTextField, weatherData);
    }

    @Override
    public void update(float fahrenheitTemperature, float celsiusTemperature) {
        String content = Float.toString(celsiusTemperature);
        setTemperatureTextFieldContent(content);
    }
}
