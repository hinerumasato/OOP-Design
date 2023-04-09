package BTOn.Temperature.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BTOn.Temperature.model.CelsiusModel;
import BTOn.Temperature.model.FahrenheitModel;
import BTOn.Temperature.model.WeatherData;

public class Temperature extends JFrame {

    private CelsiusPanel celsiusPanel;
    private FahrenheitPanel fahrenheitPanel;
    private WeatherData weatherData;
    private FahrenheitModel fahrenheitModel;
    private CelsiusModel celsiusModel;

    public Temperature() {
        awake();
        init();
    }

    public void addEvents() {
        
    }

    public void awake() {
        this.weatherData = new WeatherData(0, 0);
        
        this.celsiusPanel = new CelsiusPanel(this, "Celsius Temperature");
        this.fahrenheitPanel = new FahrenheitPanel(this, "Fahrenheit Temperature");

        this.fahrenheitModel = new FahrenheitModel(weatherData);
        this.fahrenheitModel.setFahrenheitTextField(this.fahrenheitPanel.getTemperatureTextField());

        this.celsiusModel = new CelsiusModel(weatherData);
        this.celsiusModel.setCelsiusTextField(this.celsiusPanel.getTemperatureTextField());
    }

    public void init() {
        setSize(400, 200);
        setTitle("Temperature");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        JPanel temperaturePanel = new JPanel();
        temperaturePanel.setLayout(new GridLayout(2, 1));
        temperaturePanel.add(celsiusPanel);
        temperaturePanel.add(fahrenheitPanel);

        getContentPane().add(temperaturePanel, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new Temperature();
    }

    public AbstractPanel getCelsiusPanel() {
        return celsiusPanel;
    }

    public void setCelsiusPanel(CelsiusPanel celsiusPanel) {
        this.celsiusPanel = celsiusPanel;
    }

    public FahrenheitPanel getFahrenheitPanel() {
        return fahrenheitPanel;
    }

    public void setFahrenheitPanel(FahrenheitPanel fahrenheitPanel) {
        this.fahrenheitPanel = fahrenheitPanel;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public FahrenheitModel getFahrenheitModel() {
        return fahrenheitModel;
    }

    public void setFahrenheitModel(FahrenheitModel fahrenheitModel) {
        this.fahrenheitModel = fahrenheitModel;
    }

    public CelsiusModel getCelsiusModel() {
        return celsiusModel;
    }

    public void setCelsiusModel(CelsiusModel celsiusModel) {
        this.celsiusModel = celsiusModel;
    }
}
