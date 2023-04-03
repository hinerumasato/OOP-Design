package WeatherStation2;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
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

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(this.observers.contains(o))
            this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
