package WeatherStation1;

public class WeatherData {
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public CurrentConditionsDisplay getCurrentConditionsDisplay() {
        return currentConditionsDisplay;
    }

    public void setCurrentConditionsDisplay(CurrentConditionsDisplay currentConditionsDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
    }

    public StatisticsDisplay getStatisticsDisplay() {
        return statisticsDisplay;
    }

    public void setStatisticsDisplay(StatisticsDisplay statisticsDisplay) {
        this.statisticsDisplay = statisticsDisplay;
    }

    public ForecastDisplay getForecastDisplay() {
        return forecastDisplay;
    }

    public void setForecastDisplay(ForecastDisplay forecastDisplay) {
        this.forecastDisplay = forecastDisplay;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

}
