package WeatherStation1;

public class StatisticsDisplay {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.setStatisticsDisplay(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp)
            maxTemp = temp;
        if (temp < minTemp)
            minTemp = temp;
        display();
    }
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public float getTempSum() {
        return tempSum;
    }

    public void setTempSum(float tempSum) {
        this.tempSum = tempSum;
    }

    public int getNumReadings() {
        return numReadings;
    }

    public void setNumReadings(int numReadings) {
        this.numReadings = numReadings;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}
