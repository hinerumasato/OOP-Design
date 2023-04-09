package BTOn.Temperature.model;

public abstract class TemperatureModel implements Observer {
    protected Subject weatherData;

    public TemperatureModel() {
    };

    public TemperatureModel(Subject weatherData) {
        this.weatherData = weatherData;
    }

    public Subject getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Subject weatherData) {
        this.weatherData = weatherData;
    }

}
