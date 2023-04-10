package BTOn.Temperature.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BTOn.Temperature.model.WeatherData;

public class Temperature extends JFrame {

    private AbstractPanel celsiusPanel;
    private AbstractPanel fahrenheitPanel;
    private TemperatureBarPanel temperatureBarPanel;
    private WeatherData weatherData;

    public Temperature() {
        awake();
        init();
    }

    public void addEvents() {

    }

    public void awake() {
        this.weatherData = new WeatherData(0, 0);
        this.celsiusPanel = new CelsiusPanel(weatherData, "Celsius Temperature");
        this.fahrenheitPanel = new FahrenheitPanel(weatherData, "Fahrenheit Temperature");
        this.temperatureBarPanel = new TemperatureBarPanel(weatherData);
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
        getContentPane().add(temperatureBarPanel, BorderLayout.EAST);
    }


    public static void main(String[] args) {
        new Temperature();
    }
}
