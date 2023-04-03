package WeatherStation3;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    public float getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(float currentPressure) {
        this.currentPressure = currentPressure;
    }

    public float getLastPressure() {
        return lastPressure;
    }

    public void setLastPressure(float lastPressure) {
        this.lastPressure = lastPressure;
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable weatherData) {
        this.observable = weatherData;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

}
