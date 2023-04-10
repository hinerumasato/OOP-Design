package BTOn.Temperature.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    private float fahrenheitTemperature;
    private float celsiusTemperature;
    private List<Observer> observers;
    private boolean isChanged;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
        this.isChanged = false;
    }

    public WeatherData(float fahrenheitTemperature, float celsiusTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
        this.celsiusTemperature = celsiusTemperature;
        this.observers = new ArrayList<Observer>();
    }

    public float getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }

    public void setFahrenheitTemperature(float fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
        this.celsiusTemperature = (float) ((this.fahrenheitTemperature - 32) * 1.8);
        isChanged = true;
        notifyAllObserver();
    }

    public float getCelsiusTemperature() {
        return celsiusTemperature;
    }

    public void setCelsiusTemperature(float celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
        this.fahrenheitTemperature = (float) ((this.celsiusTemperature * 1.8) + 32);
        isChanged = true;
        notifyAllObserver();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }


    @Override
    public void registerObserver(Observer o) {
        if (!this.observers.contains(o))
            this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (this.observers.contains(o))
            this.observers.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        if(isChanged) {
            for (Observer observer : observers)
                observer.update(fahrenheitTemperature, celsiusTemperature);
            isChanged = false;
        }
    }

}
