package BTOn.Temperature.model;

public interface Observer {
    public void update(float fahrenheitTemperature, float celsiusTemperature);
}
